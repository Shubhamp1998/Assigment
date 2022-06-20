package Assigment.CoreJavaAssi.Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class User {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("select your option");
	char c=sc.next().charAt(0);
	if(c=='a') {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortById());
		ts.add(new Employee(4,"Mani","s1",25000));
		ts.add(new Employee(9,"omkar", "s2", 30000));
		ts.add(new Employee(3,"raju","s3",27000));
		ts.add(new Employee(1,"ravi","s4",28000));
		ts.add(new Employee(5,"gopal", "s5", 34000));
		ts.add(new Employee(6,"kumar","s6",23000));
		ts.add(new Employee(7,"anil", "s7", 32000));
		ts.add(new Employee(8,"rahul","s8",22000));
		ts.add(new Employee(2,"govinth","s9",38000));
		ts.add(new Employee(10,"siva", "s10", 39000));
		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	else if(c=='b') {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortByName());
		ts.add(new Employee(4,"Mani","s1",25000));
		ts.add(new Employee(9,"omkar", "s2", 30000));
		ts.add(new Employee(3,"raju","s3",27000));
		ts.add(new Employee(1,"ravi","s4",28000));
		ts.add(new Employee(5,"gopal", "s5", 34000));
		ts.add(new Employee(6,"kumar","s6",23000));
		ts.add(new Employee(7,"anil", "s7", 32000));
		ts.add(new Employee(8,"rahul","s8",22000));
		ts.add(new Employee(2,"govinth","s9",38000));
		ts.add(new Employee(10,"siva", "s10", 39000));
		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	else if(c=='c') {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortByDept());
		ts.add(new Employee(4,"Mani","s5",25000));
		ts.add(new Employee(9,"omkar", "s2", 30000));
		ts.add(new Employee(3,"raju","s3",27000));
		ts.add(new Employee(1,"ravi","s4",28000));
		ts.add(new Employee(5,"gopal", "s1", 34000));
		ts.add(new Employee(6,"kumar","s6",23000));
		ts.add(new Employee(7,"anil", "s7", 32000));
		ts.add(new Employee(8,"rahul","s8",22000));
		ts.add(new Employee(2,"govinth","s9",38000));
		ts.add(new Employee(10,"siva", "s8", 39000));
		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	else if(c=='d') 
	{
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortBySal());
		ts.add(new Employee(4,"Mani","s1",25000));
		ts.add(new Employee(9,"omkar", "s2", 30000));
		ts.add(new Employee(3,"raju","s3",27000));
		ts.add(new Employee(1,"ravi","s4",28000));
		ts.add(new Employee(5,"gopal", "s5", 34000));
		ts.add(new Employee(6,"kumar","s6",23000));
		ts.add(new Employee(7,"anil", "s7", 32000));
		ts.add(new Employee(8,"rahul","s8",22000));
		ts.add(new Employee(2,"govinth","s9",38000));
		ts.add(new Employee(10,"siva", "s10", 39000));
		for(Employee e:ts) {
			System.out.println(e);
		}
	}
}
}
