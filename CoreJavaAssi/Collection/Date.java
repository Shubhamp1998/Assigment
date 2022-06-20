package Assigment.CoreJavaAssi.Collection;

import java.util.LinkedList;

public class Date {
	public Date date;
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("23-12-2000");
	l.add("22-12-2021");
	l.add("15-06-2022");
	l.add("09-08-1999");
	l.add("22-10-2001");
	System.out.println();
	for(int i=0;i<l.size();i++) {
	 String s=l.get(i).toString();
	 String [] s1=s.split("-");
	 int year=Integer.parseInt(s1[2]);
	 if((year%4==0)&& (year % 100!= 0)||year%400==0) {
		 System.out.println("The date is "+l.get(i)+" is a leap year");
	 }
	 else
		 System.out.println("The date is "+l.get(i)+" is a not leap year");
	}
}
}
