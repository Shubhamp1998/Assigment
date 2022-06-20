package Assigment.CoreJavaAssi.Collection;

import java.util.TreeMap;

public class Details {
public static void main(String[] args) {
	TreeMap<Long,Contact> t=new TreeMap<>();
	Contact c1=new Contact(7896449046L,"Shub", "shub@gmail.com");
	Contact c2=new Contact(9804556643L,"Mesh", "mesh@gmail.com");
	Contact c3=new Contact(7766890234L,"Janny","janny@gmail.com");
	t.put(1L, c1);
	t.put(2L,c2);
	t.put(3L,c3);
	for(long l:t.keySet()) {
		System.out.print(l+" ");
	}
	System.out.println();
	System.out.println(t.get(1L));
	System.out.println(t.get(2L));
	System.out.println(t.get(3L));
	System.out.println(t);
}
}
