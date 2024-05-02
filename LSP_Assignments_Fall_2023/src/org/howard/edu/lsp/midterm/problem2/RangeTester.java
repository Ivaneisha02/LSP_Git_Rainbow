package org.howard.edu.lsp.midterm.problem2;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testing the IntegerRange class
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(1, 4);

        System.out.println("Range 1 contains 7: " + range1.contains(7)); // true
        System.out.println("Range 1 contains 15: " + range1.contains(15)); // false

        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false

        System.out.println("Size of Range 1: " + range1.size()); // 6

        // Testing the equals method
        IntegerRange range4 = new IntegerRange(5, 10);
        IntegerRange range5 = new IntegerRange(5, 10);
        IntegerRange range6 = new IntegerRange(7, 12);

        System.out.println("Range 4 equals Range 5: " + range4.equals(range5)); // true
        System.out.println("Range 4 equals Range 6: " + range4.equals(range6)); // false
    }
	}


