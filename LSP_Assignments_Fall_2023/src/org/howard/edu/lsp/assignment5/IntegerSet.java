package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class IntegerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	};
	
	private List<Integer> set = new ArrayList<Integer>();
	
	//Default Constructor
	public IntegerSet() {
		
	};
	
	//Constructor if you want to pass in already initialized ArrayList
	public IntegerSet(ArrayList<Integer> set) {
		this.set=set;
	};
	
	//Clears the internal representation of the set
	public void clear() {
		set.clear();
	};
	
	//returns the length of the set
	public int length() {
		return set.size();
	};
	
	//returns true if 2 sets are equal
	
	public boolean equals(Object o) {
		
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        // Convert both sets to sets to eliminate duplicate elements and compare them
        Set<Integer> set1 = new HashSet<>(this.set);
        Set<Integer> set2  = new HashSet<>(that.set);

        return set1.equals(set2);
	};
	
	//returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if (set.contains(value)){
			return true;
		};
		return false;
		
	};
	
	//returns largest item in the set
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty. Cannot find the largest item.");
        }
		return Collections.max(set);
	};
	
	//returns the smallest item in the set
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty. Cannot find the smallest item.");
        }
		return Collections.min(set);
	};
	
	//adds an item to the set if not already there
	public void add(int item) {
		if (!set.contains(item)){
			set.add(item);
		}
		
	};
	
	//removes an item from the set if there
	void remove(int item) {
		
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
		
	};
	
	//set union
	public void union(IntegerSet intSetb) {
		set.addAll(intSetb.set);
		Set<Integer> newset = new HashSet<Integer>(set);
	}
	
	//set intersection
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	};
	
	//set difference
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	};
	
	//set complement, all elements not in set1
	public void complement(IntegerSet intSetb) {
		// Create a new ArrayList to store the complement
        List<Integer> complement = new ArrayList<Integer>(intSetb.set);
        complement.removeAll(set);
        set=complement;
	};
	
	//returns true if set is empty, false otherwise
	public boolean isEmpty() {
		if (set.isEmpty()) {
			return true;
		}
		return false;
	};
	
	//returns the string representation of your set
	@Override
	public String toString() {
		// Create a new ArrayList 
	    ArrayList<Integer> newList = new ArrayList<Integer>(); 
	    // Traverse through the first list 
	    for (Integer element : set) { 
	    	// If this element is not present in newList 
	        // then add it 
	        if (!newList.contains(element)) { 
	        	newList.add(element); 
	        } 
	    } 
		return newList.toString();
	};
	

	

}

class IntegerSetException extends Exception
{
      private static final long serialVersionUID = 1L;

	// Parameterless Constructor
      public IntegerSetException() {}

      // Constructor that accepts a message
      public IntegerSetException(String message)
      {
         super(message);
      }
 }