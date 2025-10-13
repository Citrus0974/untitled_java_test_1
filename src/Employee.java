public class Employee {
    public String name = "";
    public Department department;

    public Employee(){
    }
    public Employee(String name){
        this.name=name;
    }
    public Employee(String name, Department dep){
        this.name=name;
        this.department=dep;
        dep.allEmplyees.add(this);
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString(){
        String out = name;
        if (department==null) return out;
        if (department.getBoss() == this) out += " начальник отдела"; else out+= " работает в отделе";
        if (department.name!="") out = out + " " + department.name;
        if (department.getBoss() == this || department.getBoss()== null) return out; else out = out + ", начальник которого " + department.getBoss().name;
        return out;

    }

}
