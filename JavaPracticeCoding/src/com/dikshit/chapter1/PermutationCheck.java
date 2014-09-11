package com.dikshit.chapter1;

public class PermutationCheck {

	static Boolean checkPermutation(String value1, String value2) {
		boolean result = true;
		char[] valuesPassed = value1.toCharArray();
		if (value1.length()!=value2.length())
			result=false;
//		for (int i = 0; i < valuesToCheck.length; i++) {
//			if (valToCheck.indexOf(valuesToCheck[i]) == -1)
//				result = false;
//		}
		
		java.util.Arrays.sort(valuesPassed);
		value1 = new String(valuesPassed);
		
		char[] valToCheck = value2.toCharArray();
		java.util.Arrays.sort(valToCheck);
		value2 = new String(valToCheck);

		result = value1.equals(value2);
		return result;
	}

}
