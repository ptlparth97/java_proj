package project1;
import java.util.Scanner;

public class takingUserInput {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String foodName;
		
		System.out.println("What is your name: ");
		name = sc.nextLine();
		
		System.out.println("What is your age: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is your fav food: ");
		foodName = sc.nextLine();
		
		System.out.println("Your name is " + name + ".Your age is " + age + " and your fav food is " + foodName);
		
	}

}
