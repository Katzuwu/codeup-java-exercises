import java.util.Arrays;
import java.util.List;

//almost done. just need to import swapCase;
public class JavaDrills {
//	public static String flipOuterCase(String str){
//		String first = str.substring(0, 1).swapCase;
//		String last = str.substring((str.length() - 1)).toUpperCase();
//		String middle = str.substring(1, str.length() - 1);
//		return first + middle + last;
//	}

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

	public static void main(String[] args) {
//		System.out.println(flipOuterCase("cat")); // CaT
//		System.out.println(flipOuterCase("CaT")); // cat
//		System.out.println(flipOuterCase("caT")); // Cat
//		System.out.println(flipOuterCase("cAt")); // CAT
		System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
		System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
		System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));


	}
}
