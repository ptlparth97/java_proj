package project1;

import java.util.ArrayList;

public class stringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name = "parth";
////		boolean result = name.equalsIgnoreCase("Parth");
//		
//		int result = name.length();
//		
//		System.out.println(result);
		
		ArrayList<ArrayList<String>> group = new ArrayList();
		ArrayList<String> nameListOne = new ArrayList();
		nameListOne.add("Parth");
		nameListOne.add("Gopal");
		nameListOne.add("Raj");
		nameListOne.add("Kavay");
		
		ArrayList<String> nameListTwo = new ArrayList();
		nameListTwo.add("Tini");
		nameListTwo.add("Keta");
		nameListTwo.add("Priyanka");
		nameListTwo.add("Mummay");
		
		group.add(nameListOne);
		group.add(nameListTwo);
		
		for(int i = 0; i <group.size(); i++) {
			for(int j=0; j <group.get(i).size();j++) {
				System.out.println(group.get(i).get(j));
			}
		}
		
		
		
		
		
		

	}

}
