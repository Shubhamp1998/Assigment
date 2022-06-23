package Assigment.CoreJavaAssi.Generics;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Employee> act= new HashSet();
        Employee a=new Employee(1,"Shub",35000,"Dev");
        Employee b=new Employee(2,"Asit",42000,"Test");
        Employee c=new Employee(3,"Om",20000,"Data");
        Employee d=new Employee(4,"Megha",50000,"Supervisor");
        act.add(a);
        act.add(b);
        act.add(c);
        act.add(d);
        //printing all the details of the objects
        System.out.println(act);
    }
}
class Employee{
    int id,salary;
    String name,dept;
    public Employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    @Override
    public String toString(){
        return "\n{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
    }
    @Deprecated
    public void displayDetails(){
        System.out.println("\n{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
    }
}
