package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;


public class WordCounterDriver {

	public static void main(String[] args) {
		FileReader fr = new FileReader();
		try {
			fr.readToString("main/java/resources/words.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}

	}

}
