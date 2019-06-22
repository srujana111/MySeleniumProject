package lesson;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=35;
		switch(score)
		{
		case 80:
			System.out.println("very good");
			break;
		case 60:
			System.out.println(" good");
			break;
		case 40:
			System.out.println(" average");
			break;
			default:
				System.out.println("low");
				break;
		}
	}

}
