package com.dikshit.chapter1;

/**
 * @author abhadikshit
 *
 */
public class StringReversion{

	 static String performStringReversion(String args) {
		String valToReverse = args;
		String newValue="";
		for(int len=valToReverse.length(); len>0; len--){
			newValue+=valToReverse.charAt(len-1);
			System.out.println("Value of len now"+len);
		}
		System.out.println("String initially was"+valToReverse);
		System.out.println("new String value now"+newValue);
		
		return newValue;
	}
	 
	 public static void main(String[] args) {
		
	}
}