import java.util.Arrays;
import java.util.*;
import java.util.Locale;

//almost done. just need to import swapCase;
public class JavaDrills {
	public static String flipOuterCase(String str){
		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			boolean firstOrLastChar = chars[i] == chars[0] || chars[i] == chars[chars.length - 1];
			if (Character.isUpperCase(c)) {
				if (firstOrLastChar) {
					chars[i] = Character.toLowerCase(c);
				}
			} else if (Character.isLowerCase(c)) {
				if (firstOrLastChar) {
					chars[i] = Character.toUpperCase(c);
				}
			}
		}
		return new String(chars);
	}

//	Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
	public static int returnTotalDifference(List<Integer> arr1, List<Integer> arr2){
		int arr1Total = 0;
		int arr2Total = 0;
		for (Integer number : arr1)
			arr1Total += number;
		for (Integer number : arr2)
			arr2Total += number;
		return arr1Total - arr2Total;
	}

//	Create a public static method, `flipInnerCase`, that takes in a string and returns the string
//	with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
	public static String flipInnerCase(String str) {
	 char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            boolean middleChars = chars[i] != chars[0] && chars[i] != chars[chars.length - 1];
            if (Character.isUpperCase(c)) {
                if (middleChars) {
                    chars[i] = Character.toLowerCase(c);
                }
            } else if (Character.isLowerCase(c)) {
                if (middleChars) {
                    chars[i] = Character.toUpperCase(c);
                }
            }
        }
        return new String(chars);
	}
	public static void main(String[] args) {
//		System.out.println(flipOuterCase("cat")); // CaT
//		System.out.println(flipOuterCase("CaT")); // cat
//		System.out.println(flipOuterCase("caT")); // Cat
//		System.out.println(flipOuterCase("cAt")); // CAT
//		System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
//		System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
//		System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));
		System.out.println(flipInnerCase("cat")); // cAt
		System.out.println(flipInnerCase("CaT")); // CAT
		System.out.println(flipInnerCase("caT")); // cAT
		System.out.println(flipInnerCase("codeup")); // cODEUp
		System.out.println(flipInnerCase("CoDeup")); // COdEUp

	}
}
