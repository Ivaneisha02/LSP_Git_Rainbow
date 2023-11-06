package org.howard.edu.assignment5;

import org.howard.edu.assignment5.IntegerSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
//import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class IntegerSetTest {
	private IntegerSet integerSet;
	
	@BeforeEach
	void setUp() {
		integerSet = new IntegerSet();
	}
	
	@Test
	@DisplayName("test clear")
	public void testClear() {
		integerSet.add(2);
		integerSet.clear();
		assertEquals(0,integerSet.length());
	}
	
	@Test
	@DisplayName("test length")
	public void testLength() {
		integerSet.add(2);
		integerSet.add(5);
		integerSet.add(9);
		assertEquals(integerSet.length(),3);
	}
	
	@Test
	@DisplayName("test equals")
	public void testEquals() {
		IntegerSet integerSet2 = new IntegerSet();
		IntegerSet integerSet = new IntegerSet();
		integerSet2.add(3);
		integerSet2.add(65);
		integerSet.add(3);
		integerSet.add(65);
		assertTrue(integerSet.equals(integerSet2));
		
	}
	@Test
	@DisplayName("test contains")
	public void testContains() {
		integerSet.add(9);
		integerSet.add(7);
		assertTrue(integerSet.contains(9));
		assertFalse(integerSet.contains(8));
	}
	
	@Test
	@DisplayName("test largest")
	public void testLargest() throws IntegerSetException {
		integerSet.add(9);
		integerSet.add(7);
		integerSet.add(10);
		assertEquals(integerSet.largest(),10);
	}
	
	@Test
	@DisplayName("test smallest")
	public void testSmallest() throws IntegerSetException {
		integerSet.add(9);
		integerSet.add(7);
		integerSet.add(10);
		assertEquals(integerSet.smallest(),7);
	}
	
	@Test
	@DisplayName("test add")
	public void testAdd() {
		integerSet.add(8);
		assertTrue(integerSet.contains(8));
	}
	
	
	@Test
	@DisplayName("test remove")
	public void testRemove() {
		integerSet.add(9);
		integerSet.add(89);
		integerSet.remove(9);
		assertFalse(integerSet.contains(9));
	}
	
	@Test
	@DisplayName("test union")
	public void testUnion() {
		IntegerSet set2 = new IntegerSet();
		set2.add(9);
		set2.add(8);
		integerSet.add(30);
		integerSet.union(set2);
		assertEquals(integerSet.length(),3);
	}
	
	@Test
	@DisplayName("test intersect")
	public void testIntersect() {
		IntegerSet set2 = new IntegerSet();
		set2.add(9);
		set2.add(8);
		integerSet.add(9);
		integerSet.add(2);
		integerSet.intersect(set2);
		assertEquals(integerSet.length(),1);
	}
	
	@Test
	@DisplayName("test difference")
	public void testDifference() {
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(3);
		integerSet.add(2);
		integerSet.add(4);
		integerSet.diff(set2);
		assertEquals(integerSet.length(),1);
	}
	
	@Test
	@DisplayName("test complement")
	public void testComplement() {
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(3);
		integerSet.add(2);
		integerSet.add(4);
		integerSet.complement(set2);
		assertEquals(integerSet.length(),1);
	}
	
	@Test
	@DisplayName("test isEmpty")
	public void testIsEmpty() {
		integerSet.add(9);
		assertFalse(integerSet.isEmpty());
		integerSet.clear();
		assertTrue(integerSet.isEmpty());
	}
	
	@Test
	@DisplayName("test toString")
	public void testString() {
		integerSet.add(5);
        integerSet.add(10);
        integerSet.add(15);
        assertEquals("[5, 10, 15]",integerSet.toString());
	}
	
	@Test
	@DisplayName("test largest_IntegerSetException")
	public void testLargestIntegerSetException() {
		Throwable exception = assertThrows(IntegerSetException.class, () -> integerSet.largest());
		assertEquals("Set is empty. Cannot find the largest item.", exception.getMessage());
		assertNotNull(exception.getMessage());
	}
	
	@Test
	@DisplayName("test smallest_IntegerSetException")
	public void testSmallestIntegerSetException() {
		Throwable exception = assertThrows(IntegerSetException.class, () -> integerSet.smallest());
		assertEquals("Set is empty. Cannot find the smallest item.", exception.getMessage());
		assertNotNull(exception.getMessage());
	}
	
	
	
}
