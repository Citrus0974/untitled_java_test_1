package edu.khityaev.structure;

import java.lang.reflect.Field;
import java.util.*;

public abstract class Entity {
    @Override
    public final String toString() {
        Class thisClass = this.getClass();
        List<Field> fields = new ArrayList<>();

        List<Field> ownFields = Arrays.asList(thisClass.getDeclaredFields());
        fields.addAll(ownFields);

        Set<Class> parents = this.getAllParentClasses(thisClass, new HashSet<>());

        for(Class parent: parents){
            fields.addAll(Arrays.asList(parent.getDeclaredFields()));
        }

        StringBuilder builder = new StringBuilder(thisClass.getSimpleName() + "{");
        for (Field field : fields){
            builder.append(field.getName());
            builder.append("=");
            field.setAccessible(true);
            try {
                Object value =  field.get(this);
                if(value!=null) builder.append(value.toString());
                else builder.append("null");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            builder.append(", ");
        }


        return builder.substring(0, builder.length()-2) + "}";
    }


    protected final Set<Class> getAllParentClasses(Class clz, Set<Class> parents){
        if(clz == null){
            return parents;
        }
        Class superclass = clz.getSuperclass();
        Class[] interfaces = clz.getInterfaces();

        if(superclass==null && interfaces.length==0){
//        if(superclass== Object.class){
            return parents;
        }
        parents.add(superclass);
        parents.addAll(Arrays.asList(interfaces));

        parents.addAll(this.getAllParentClasses(superclass, parents));
        for(Class interfaceClass : interfaces){
            parents.addAll(this.getAllParentClasses(interfaceClass, parents));
        }
        return parents;
    }
}
