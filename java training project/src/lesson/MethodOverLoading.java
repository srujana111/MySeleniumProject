package lesson;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Add(1,2));
		
		System.out.println(Add(1.5,7.8));
		
		System.out.println(Add(1.37,7.90,8.65));
	}

public static int Add(int a,int b) {	
	
	return(a+b);
	
	
}
public static double Add(double a,double b) {	
	
	return(a+b);

}
public static double Add(double a,double b,double c) {	
	
	return(a+b);

}
}