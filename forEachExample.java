package project1;

import java.util.ArrayList;

public class forEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i[] = {10,20,30,40};
//		
//		for(int j : i) {
//			System.out.println(j);
//		}
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("rat");
		
		
		for(String name: animals) {
			System.out.println(name);
		}
	}

}
