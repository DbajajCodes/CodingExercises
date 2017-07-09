package pairinginterview;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {

	public static int add(String input) {
		int valToReturn = 0;
		if (StringUtils.isEmpty(input)) {
			valToReturn = 0;
		} else {
			String[] entries = input.split(",");
			if (entries.length == 1) {
				valToReturn = returnValueForSingleEntry(entries);
			} else {
				valToReturn = calculateTotalForMultipleEntries(valToReturn, entries);
			}
		}
		return valToReturn;
	}

	private static int returnValueForSingleEntry(String[] entries) {
		int valToReturn;
		valToReturn = Integer.parseInt(entries[0]);
		return valToReturn;
	}

	private static int calculateTotalForMultipleEntries(int valToReturn, String[] entries) {
		for (String entry : entries) {
			valToReturn += Integer.parseInt(entry);
		}
		return valToReturn;
	}

}
