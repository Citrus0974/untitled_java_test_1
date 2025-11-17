package edu.khityaev.office;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name = "";
    Employee boss;
    final List<Employee> allEmployees = new ArrayList<>();


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
        if(this.allEmployees.contains(employee)) return;
        if(employee.department!=null){
            employee.department.removeEmployee(employee);
        }
        this.allEmployees.add(employee);
        employee.department=this;

    }

    void removeEmployee(Employee employee) {
        if(employee==null) return;
        if(!this.allEmployees.contains(employee)) return;
        if(this.boss==employee) this.boss=null;
        this.allEmployees.remove(employee);
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
        for (Employee allEmplyee : allEmployees) {
            System.out.println(allEmplyee);
        }
    }

    @Override
    public String toString() {
        String res = "Department " + this.name + " with boss " + this.boss.name + ". Employees: ";
        for(Employee employee: allEmployees){
            res= res + employee.name + "; ";
        }
        return res;
    }
}
