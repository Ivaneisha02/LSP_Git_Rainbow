package org.howard.edu.lsp.midterm.problem1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("To Kill a MockingBird", "Harper Lee", 1960);
        Book book2 = new Book("To Kill a MockingBird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1960);
        System.out.println("book 1 equals book2:" + book1.equals(book2));
        System.out.println("book 1 equals book3:" + book1.equals(book3) +" "+ 
       book1.toString());


	}

}
