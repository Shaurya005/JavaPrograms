package DataStructures;

import java.util.Arrays;
public class ValidShuffleOfString {

		static boolean checkLength(String first, String second, String result) {
			if (first.length() + second.length() != result.length())
				return false;
			else
				return true;
		}

		// this method converts the string to char array sorts the char array convert the char array to string and return it
		static String sortString(String str) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			str = String.valueOf(charArray); // convert char array back to string
			return str;
		}

		// This method compares each character of the result with individual characters of the first and second string.
		static boolean shuffleCheck(String first, String second, String result)
		{
			first = sortString(first); // sort each string to make comparison easier
			second = sortString(second);
			result = sortString(result);

			int i = 0, j = 0, k = 0;
			while (k != result.length()) {
				if (i < first.length() && first.charAt(i) == result.charAt(k))
					i++;
				else if (j < second.length() && second.charAt(j) == result.charAt(k))
					j++;
				else
					return false;
				k++;
			}

			if (i < first.length() || j < second.length()) // after accessing all characters of result if either first or second has some characters left
				return false;
			return true;
		}

		public static void main(String[] args) {
			String first = "XY";
			String second = "12";
			String[] results = {"1XY2", "Y1X2", "Y21XX"};
			for (String result : results) {
				if (checkLength(first, second, result) == true && shuffleCheck(first, second, result) == true)
					System.out.println(result + " is a valid shuffle of " + first + " and " + second);
				else
					System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
			}
		}
}