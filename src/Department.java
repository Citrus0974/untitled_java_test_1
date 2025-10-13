import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name = "";
    private Employee boss;
    public List<Employee> allEmplyees = new ArrayList<>();


    public Department(){
    }
    public Department(String name){
        this.name=name;
    }
//    public Department(String name, Employee boss){
//        this.name=name;
//        this.boss=boss;
//        allEmplyees.add(boss);
//    }


    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        if(boss.getDepartment()==this){
            this.boss = boss;
        }
    }

    public void getAllEmployees(){
        for(int i=0; i<allEmplyees.size(); i++){
            System.out.println(allEmplyees.get(i));
        }
    }
}
