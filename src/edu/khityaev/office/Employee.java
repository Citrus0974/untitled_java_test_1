package edu.khityaev.office;

public class Employee {
    public String name = "";
    Department department;

    public Employee(){
    }
    public Employee(String name){
        this.name=name;
    }
    public Employee(String name, Department dep){
        this.name=name;
        this.department=dep;
        dep.allEmployees.add(this);
    }

    public Department getDepartment() {
        return department;
    }

    void setDepartment(Department department){
        if(this.department==department) return;
        if(department!=null){
            department.addEmployee(this);
        }
        if(this.department!=null){
            this.department.removeEmployee(this);
        }
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
