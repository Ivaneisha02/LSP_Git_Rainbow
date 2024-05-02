package org.howard.edu.lsp.midterm.problem1;

public class SecurityOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
     * encrypting a text 
     * characters at even indices are moved to the front of a string
     * characters at odd indices are moved to the back of a string
     */
	public static String encrypt(String text) {
		// go for it!!
		char[] textArray = text.toCharArray();
		String front = "";
		String back = "";
		for (int i = 0; i < textArray.length; i++) {
			if (Character.isLetterOrDigit(textArray[i]) && i %2 == 0 ) {
				front += textArray[i];
			} else if (Character.isLetterOrDigit(textArray[i]) && i %2 == 1 ) {
				back += textArray[i];
			}
		}
		return front+back;
	}

	
}
