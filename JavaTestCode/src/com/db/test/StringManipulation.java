package com.db.test;



public class StringManipulation{

public static void main(String[] args) {
	System.out.println("in the main method"+args[0]);
	checkDuplicates(args[0]);
}

	/*package*/ static void checkDuplicates(String valToCheck){
		/*implementation using datastructures*/
		System.out.println("I did come here");
		//char[] uniqueElements=new char[valToCheck.length()];
		/*ArrayList<Character> uniqueElements = new ArrayList<Character>();
		for(int len=0; len<valToCheck.length();len++){
			System.out.println("checkign for the value"+valToCheck.charAt(len));
			if(uniqueElements.contains(valToCheck.charAt(len))){
				System.out.println("duplicate found !!");
			}
			else{
				// Arrays.asList(uniqueElements).add(valToCheck.charAt(len));
				// uniqueElements[len]=valToCheck.charAt(len);
				uniqueElements.add(valToCheck.charAt(len));				
			}
			System.out.println("final array prepared with element"+uniqueElements);
			
		}*/

	if(valToCheck.length()>128) 

		System.out.println("This is not unique !!!")	;
	boolean duplicateFound=false;
	boolean[] char_set = new boolean[256];
	for(int i=0;i<valToCheck.length();i++){
		int val = valToCheck.charAt(i);
		if(char_set[val])
		{
			System.out.println("This is not unique");
		duplicateFound=true;
		break;
		}
		char_set[val]=true;
	}
		if(!duplicateFound)
			System.out.println("We could not find a duplicate");
		else
			System.out.println("We DID find a duplicate");
		System.out.println("For my understanding, the char_set is "+char_set);
	}


}