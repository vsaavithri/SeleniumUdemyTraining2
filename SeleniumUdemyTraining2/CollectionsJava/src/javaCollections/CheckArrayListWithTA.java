package javaCollections;

import java.util.ArrayList;

public class CheckArrayListWithTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(52);

		
		/*
		 * int i = list.get(0); System.out.println(i);
		 */
		
		/*
		 * for (Object var :list) { System.out.println(var); }
		 */
		
		for ( int i = 0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}

	}

}
