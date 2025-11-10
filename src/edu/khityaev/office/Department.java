package edu.khityaev.office;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name = "";
    Employee boss;
    final List<Employee> allEmplyees = new ArrayList<>();


    public Department(){
    }
    public Department(String name){
        this.name=name;
    }
//    public edu.khityaev.office.Department(String name, edu.khityaev.office.Employee boss){
//        this.name=name;
//        this.boss=boss;
//        allEmplyees.add(boss);
//    }

    void addEmployee(Employee employee){
        if(employee==null) return;
        if(this.allEmplyees.contains(employee)) return;
        if(employee.department!=null){
            employee.department.removeEmployee(employee);
        }
        this.allEmplyees.add(employee);
        employee.department=this;

    }

    public void removeEmployee(Employee employee) {
        if(employee==null) return;
        if(!this.allEmplyees.contains(employee)) return;
        if(this.boss==employee) this.boss=null;
        this.allEmplyees.remove(employee);
        employee.department = null;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        addEmployee(boss);
        this.boss=boss;
    }

    public void getAllEmployees(){
        for(int i=0; i<allEmplyees.size(); i++){
            System.out.println(allEmplyees.get(i));
        }
    }
}
