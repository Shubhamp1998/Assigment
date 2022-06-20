package Assigment.CoreJavaAssi.Intermidiate_OOPS.Persistence;

public class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Data saved in database");
	}
	
	public static void main(String[] args) {
		Persistence p1= new DatabasePersistence(); //upcasting 
		p1.persist();
	}
	
}