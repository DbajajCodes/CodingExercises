package com.dikshit.chapter1;

public class ReplaceSpace {

	public static String performOperation(String spacedOutString) {

		// char[] replacementValues = "%20".toCharArray();
		// StringBuilder sBuilder = new StringBuilder(spacedOutString);
		//
		// for (int i = 0; i < sBuilder.length(); i++) {
		// if (sBuilder.charAt(i) == ' ') {
		// sBuilder.deleteCharAt(i);
		// sBuilder.insert(i,replacementValues);
		// }
		//
		// }
		// return sBuilder.toString();
		char[] spacedOutStringCharArray = spacedOutString.toCharArray();
		int initialLength = spacedOutStringCharArray.length;
		int noSpaces = 0;
		for (int len = 0; len < initialLength; len++) {
			if (spacedOutStringCharArray[len] == ' ')
				noSpaces++;
		}
		int newLength = initialLength + 2 * noSpaces;
		char[] replacementSet = new char[newLength];
		for (int len = newLength - 1; len >= 0; len--) {
			if (spacedOutStringCharArray[initialLength-1] != ' ') {
				replacementSet[len] = spacedOutStringCharArray[initialLength-1];
			} else {
				replacementSet[len - 2] = '%';
				replacementSet[len - 1] = '2';
				replacementSet[len] = '0';
				len -= 2;
			}
			initialLength-=1;
		}

		return String.valueOf(replacementSet);

	}

}
