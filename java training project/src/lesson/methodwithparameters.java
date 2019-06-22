package lesson;

public class methodwithparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*sayhello("john");
		sayhello("tom");
		add(2,3); */
		
		int sum=add(20,30);
		int result=sum*5;
		System.out.println(sum);
		System.out.println(result);
	}

	
	/*public static void sayhello(String name) {
		System.out.println("hello " + name);
	}
	
	
	public static void add(int a,int b) {
		
		System.out.println(a+b);
	} */
	
	
	public static int add(int a,int b) {
		
		//System.out.println(a+b);
		return(a+b);
	}
}
