package ThisPackage;

public class student {
int rollno;
String name;
int fee;

student(int rollno,String name,int fee){  //local variables
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
	void display() {
	System.out.println(rollno+" "+name+" "+fee);	
	}
	
}

