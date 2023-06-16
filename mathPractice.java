package project1;
import java.util.Scanner;

public class mathPractice {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("Enter the value for side x: ");
		x = sc.nextInt();
		
		System.out.println("Enter the value for side y: ");
		y = sc.nextInt();
		
		z = (int)Math.sqrt((x*x) + (y*y));
		
		System.out.println(z);
		
//		double x = 3.14;
//		double y = 10;
//		
//		double z = Math.sqrt(y);
//		
//		System.out.println(z);
	}
	
	
	

}
