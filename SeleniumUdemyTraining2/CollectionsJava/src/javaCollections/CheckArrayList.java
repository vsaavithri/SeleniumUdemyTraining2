package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;



public class CheckArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new  ArrayList();
		System.out.println("Starting Array list. The size of the arralist is" +list);
		
		list.add(10);
		list.add("Sairam");
		list.add("Yogiram");
		list.add("Yogiram and SaiRam be with me");
		list.add(null);
		list.add(23.01);
		
		System.out.println(list.get(0));
		System.out.println("The Size of ArrayList now is " +list.size());
		
		list.remove(4);
		System.out.println("The Size of ArrayList now is " +list.size());
	
		//method 1
		/*
		 * 
		 * 
		 * 
		 * for ( int i =0; i<list.size(); i++) {
		 * 
		 * System.out.println(list.get(i)); }
		 */
		
		//method 2 - simplfied  for with creation of Object reference
		
		/*
		 * for( Object var: list) { System.out.println(var);
		 * 
		 * 
		 * }
		 */
		
		//method 3 - Iterator methods
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		

	}

	
	}


