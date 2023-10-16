package org.howard.edu.lsp.assignment4;


public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		System.out.println("The length of set1 is: "+ set1.length());

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		System.out.println("Value of set2 is: " + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2: " + set1.toString());
		
		set1.clear();
		System.out.println("Set 1 after being cleared: "+set1.toString());
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.intersect(set2);
		System.out.println("Result of intersection of Set1 and Set2: "+set1.toString());
		set1.clear();
		
		System.out.println("Does set2 contain 3? "+ set2.contains(3));
		System.out.println("Does set2 contain 5? "+ set2.contains(5));
		
		set1.add(4);
		set1.add(5);
		System.out.println("The new value of set1: "+set1.toString());
		System.out.println("Is set1 equal to set2? "+set1.equals(set2));
		set1.remove(5);
		System.out.println("Set1 after removing 5: "+set1.toString());
		set1.diff(set2);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("New value of set1 "+set1.toString());
		System.out.println("Result of diff of set1 and set2: "+set1.toString());
		
		set1.complement(set2);
		System.out.println("Result of complement of set1 and set2: "+set1.toString());
		System.out.println("Is set2 empty? "+set2.isEmpty());
		set2.clear();
		System.out.println("Result of largest item in set2 after set2 is cleared: "+set2.largest());
		
	}

}
