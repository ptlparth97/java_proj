package project1;
import java.util.Random;

public class generateRandomNumber {
	
	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int x = rn.nextInt(5);
		double y = rn.nextDouble();//Generate the number between 0 and 1 
		boolean z = rn.nextBoolean();
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		

	}
	
	
}
