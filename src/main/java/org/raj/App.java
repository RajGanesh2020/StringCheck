/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.raj;
/**
 * 
 * Main class to check whether the String has duplicate character
 * @author Raj Ganesh
 * 
 */

public class App {

	/**
	 * This class returns true if there is duplicate character in the input string str if not return false
	 * @param str input string to check for duplicate character
	 * @return boolean
	 */
	public boolean hasDuplicateChars(String str) {
    	boolean isDuplicate = false;
    	/* Convert the chartacters to Upper case */
    	str = str.toUpperCase();
    	
    	for (int i = 0; i < str.length(); i++) {
    		char c = str.charAt(i);
    		/* check whether the string has one more occurence && check no spaces */
    		if(str.lastIndexOf(c) != i && c != ' ') {
    			isDuplicate = true;
    			break;
    		}
    	}
    	
    	return isDuplicate;
    }

    public static void main(String[] args) {
    	if(args.length == 0) {
    		System.out.println("No ARgs");	
    	}else {
    		System.out.println(args[0]+" has duplicate chars:"+new App().hasDuplicateChars(args[0]));
    	}
    }
}
