package lesson;

public class ObjectsAndClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentdata john = new studentdata();
		john.setId ( 123);
		john.setName ( "john");
		john.setAge(15);
		
		
		studentdata tom = new studentdata();
		tom.setId (102);
		tom.setName ( "tom");
		tom.setAge(16);
	
		System.out.println(john.getName() +"is "+john.getAge ()+ " years old");
		
		System.out.println(tom.getName() +"is "+tom.getAge() + " years old");
		
	}

}
 