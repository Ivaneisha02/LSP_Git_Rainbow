package org.howard.edu.lsp.midterm.problem1;

public class Book {

	private String title;
	private String author;
	private Integer year;
	
	public Book(String title,String author, Integer year ) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", Author: "  + author +", Year: "+year;
		
	}
	
	@Override
	public boolean equals(Object o) {
		Book book = (Book) o;
		
		if ((this.year.equals(book.year)) && (this.title.equals(book.title)) && (this.author.equals(book.author))) {
			return true;
		}
		return false;
	}
	
	

}
