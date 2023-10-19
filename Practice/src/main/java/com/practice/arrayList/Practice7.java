package com.practice.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice7 {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "Kamlesh", 10);
        Employee e2 = new Employee(102,"Raju",20);
        Employee e3 = new Employee(103, "Rajan", 30);
        Employee e4 = new Employee(104, "Nandan", 10);
        Employee e5 = new Employee(105,"Kaushal", 20);
        
        ArrayList<Employee> al_emp = new ArrayList<>();
        al_emp.add(e1);
        al_emp.add(e2);
        al_emp.add(e3);
        al_emp.add(e4);
        al_emp.add(e5);
        
//        Iterator itr = al_emp.iterator();
//        while(itr.hasNext()){
//            Employee emp = (Employee)itr.next();
//            System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getDeptNo());
//        }
        for(Employee emp : al_emp){
            System.out.println(emp.getEmpId()+ " " + emp.getEmpName() + " " + emp.getDeptNo());
        }
    }
}

class Employee{
    private int emp_id;
    private String emp_name;
    private int dept_no;
    
    public Employee(int emp_id, String emp_name, int dept_no){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.dept_no = dept_no;
    }
    
    public int getEmpId(){
        return emp_id;
    }
    
    public String getEmpName(){
        return emp_name;
    }
    
    public int getDeptNo(){
        return dept_no;
    }
    
    public void setEmpId(int emp_id){
        this.emp_id = emp_id;
    }
    
    public void setEmpName(String emp_name){
        this.emp_name = emp_name;
    }
    
    public void setDeptNo(int dept_no){
        this.dept_no = dept_no;
    }
}
