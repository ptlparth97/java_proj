package project1;

import java.util.Scanner;

public class logicalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are playing the game!. Press Q or q to quit.");
		
		String responce = sc.next();
		
		if(responce.equals("q") || responce.equals("Q")) {
			System.out.println("Quit the game");
		}
	}
}
