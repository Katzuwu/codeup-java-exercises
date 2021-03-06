import java.lang.reflect.Array;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class OneHundredOneJavaProblems {
	public static void main(String[] args) {
		//System.out.println(capFirst("hello"));
		//System.out.println(sameFirstAndLast("Owo"));
		//System.out.println(Arrays.toString(oneMore(new int[]{1, 2, 3}, 4)));
		//System.out.println(containsSumOfFour("c1t3"));
		//System.out.println(containsSumOfFour("hello"));
		//System.out.println(isPrime(11));
		//System.out.println(isPalindrome("racecar"));
		//ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
		//System.out.println(reverseValues(places));
		//System.out.println(stringToCharArray("str"));
		//System.out.println(sumInts(new int[]{1,2,3,4,5}));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(9);
		arrayList.add(3);
		arrayList.add(4);
		//System.out.println(remove7s(list));
		//System.out.println(sameCase("StRiNG", "HeLlOO"));
		//char ch1 = 'z';
		//char ch2 = 'y';
		//System.out.println(combineChars(ch1, ch2));
		//System.out.println(nextPrime(7));
		//System.out.println(lowerPrime(11));
		//System.out.println(lowerPrime(11));
		//ArrayList<String> strList = new ArrayList<String>(Arrays.asList("This", "is", "new"));
		//ArrayList<String> strList2 = new ArrayList<String>(Arrays.asList("Hello", "hey", "hi"));
		//System.out.println(listsToMap(strList, strList2));
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		//map.put("hi", 1);
		//map.put("hello", 2);
		//map.put("hola", 2);
		//map.put("hey", 4);
		//System.out.println(sameMapValues(map));
		System.out.println(getStringInfo("ccccccoo"));
		System.out.println(Arrays.toString(javaPop(new int[]{1, 2, 3, 4})));
		System.out.println(returnHalveTheInput(6));
		System.out.println(returnUniqueValues(list, arrayList));
	}
//    Create a class OneHundredOneJavaProblems and add the following public static methods:
//            1. Create a method, returnHelloWorld, that returns the string "Hello World"
public String returnHelloWorld(){
    return "Hello World";
}
//            2. Create a method, addInts, that takes in two integers and returns their sum
public int addInts(int num1, int num2){
    return num1 + num2;
}
//3. Create a method, intToLong, that takes in an integer and returns the same number as a long data type
	public long intToLong(int num){
	return (long)num;
	}
//4. Create a method numericStringToDouble that takes in a numeric string and returns the number value as a double.
	public double numericStringToDouble(String number){
	return Double.parseDouble(number);
	}
//5. Create a method, doubleToFloat, that takes in a double and returns the number as a float. Assume that the input values will fit within a double data type.
	public float doubleToFloat(String number){
	return Float.parseFloat(number);
	}
//6. Create a method, firstChar, that takes in a string and returns the first character of the string.
	public static String firstChar(String str){
	return str.substring(0, 1);
	}
//7. Create a method, lastChar, that takes in a string and returns the last character of the string.
	public static String lastChar(String str){
	return str.substring(str.length() -1);
	}
//8. Create a method, capFirst, that takes in a string and returns the string with the first letter capitalized and all other letters in lowercase.
	public static String capFirst(String str){
	String first = firstChar(str);
	String restOfString = str.substring(1);
	return first.toUpperCase() + restOfString;
	}
//9. Create a method, sameFirstAndLast, that takes in a string and returns true if the first and last character match (not case sensitive).
	public static boolean sameFirstAndLast(String str){
		return firstChar(str).equalsIgnoreCase(lastChar(str));
	}
//10. Create a method, sameCase, that takes in two strings. Assume both strings are the same length and only contain letters. The method should return true if both strings share the same sequence letter case.
	public static boolean sameCase(String str1, String str2){
		for(int i = 0; i < str1.length(); i++){
			if(Character.isUpperCase(str1.charAt(i)) != Character.isUpperCase(str2.charAt(i)) || Character.isLowerCase(str1.charAt(i)) != Character.isLowerCase(str1.charAt(i))){
				return false;
			}
		}
		return true;
	}
//11. Create a method, combineChars, that takes in two char inputs and returns a string combining them in numeric/alphabetical order. If a combination of a letter and number, the number will come first.
	public static String combineChars(char ch1, char ch2){
		StringBuilder str = new StringBuilder();
		if(Character.isDigit(ch1)){
			str.append(ch1).append(ch2);
		} else if(Character.isDigit(ch2)){
			str.append(ch2).append(ch1);
		} else if(Character.compare(ch1, ch2) < 0){
			str.append(ch1).append(ch2);
		} else if(Character.compare(ch1, ch2) > 0){
			str.append(ch2).append(ch1);
		}
		return str.toString();
	}
//            12. Create a method, containsSumOfFour, that takes in a string containing any sequence of letters and numbers. If all numbers in the string add up to four, return true, otherwise, return false.
	public static boolean containsSumOfFour(String str){
		return str.length() == 4;
	}
//            13. Create a method, isPrime, that takes in a positive integer and returns if the integer is a prime number.
	public static boolean isPrime(int num){
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
//14. Create a method, nextPrime, that takes in a positive integer and returns the next highest prime number.
	public static int nextPrime(int num){
		num++;
      for (int i = 2; i < num; i++) {
         if(num % i == 0) {
            num++;
            i=2;
         } else {
            continue;
         }
      }
      return num;
	}
//15. Create a method, lowerPrime, that takes in a positive integer and returns the closest prime number less than the input. If passed one, the method should return 1.
	public static int lowerPrime(int num){
		if(num == 1){
			return 1;
		} else {
			for(int i = num - 1; i >= 2; i--){
				if(isPrime(i)){
					num = i;
					break;
				}
			} return num;
		}
	}
// 16. Create a method, letterToNumber, that takes in a char letter and returns byte which represents the order in which the letter appears in the alphabet. Upper and lower case versions of the same letter should return the same number.
//17. Create a method, lettersToNumber, that takes in a series of letters and numbers and returns a long that combines the number ordering of letters with any existing numbers into a larger long number.
//18. Create a method, isPalindrome, and returns true if the passed string input is identical forwards and backwards. This method should be case sensitive.
	public static boolean isPalindrome(String str){
		StringBuilder check = new StringBuilder();
		for(int i = str.length() -1; i > -1; i--){
			check.append(str.charAt(i));
		}
		return check.toString().equals(str);
	}
//19. Using overloading, create several methods called combine, that will return the sum of two integers, the product of two bytes, the concatenation of two chars, the longer string of two strings, and the result of two booleans combined with an AND logical operator.
//20. Create a method, returnLongerArray, that takes in two arrays of integers and returns the longest array.
//21. Create a method, oneMore, that takes in two inputs, an array of integers and a single integer. The method will return another array of integers with the same values of the first array and an additional integer element of the second input.
	public static int[] oneMore(int[] arr, int intToAdd) {
		int n = arr.length;
		int[] newArr = new int[n + 1];
		System.arraycopy(arr, 0, newArr, 0, n);
		newArr[n] = intToAdd;
		return newArr;
	}
//22. Create a method, javaPop, that takes in an array of any primitive type and returns the same array of that datatype with the last element removed. Method overloading will be needed. If only one element is present, return an empty array.
	public static int[] javaPop(int[] arr){
		int [] arrCopy = new int[arr.length -1];
		System.arraycopy(arr, 0, arrCopy, 0, arr.length - 1);
		return arrCopy;
	}
	public static String[] javaPop(String[] arr){
		String [] arrCopy = new String[arr.length -1];
		System.arraycopy(arr, 0, arrCopy, 0, arr.length - 1);
		return arrCopy;
	}
	public static char[] javaPop(char[] arr){
		char [] arrCopy = new char[arr.length -1];
		System.arraycopy(arr, 0, arrCopy, 0, arr.length - 1);
		return arrCopy;
	}
	public static double[] javaPop(double[] arr){
		double [] arrCopy = new double[arr.length -1];
		System.arraycopy(arr, 0, arrCopy, 0, arr.length - 1);
		return arrCopy;
	}
	public static long[] javaPop(long[] arr){
		long [] arrCopy = new long[arr.length -1];
		System.arraycopy(arr, 0, arrCopy, 0, arr.length - 1);
		return arrCopy;
	}
//23. Create a method, javaShift, that takes in an array of any primitive data type and returns the array with the first element removed. Method overloading will be needed. If only one element is present, return an empty array.
//24. Create a method, stringToCharArray, that takes in a string and returns the characters of the string as an array.
	public static char[] stringToCharArray(String str){
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			arr[i] = str.charAt(i);
		}
		for(char character : arr){
			System.out.println(character);
		}
		return arr;
	}
//25. Create a method, sumInts, that takes in an array of integers and returns the sum of all integers.
	public static int sumInts(int[] arr){
		int total = 0;
		for(int num : arr){
			total += num;
		}
		return total;
	}
//26. Create a method, remove7s, that takes in a list of integers and removes any number sevens and returns the list.
	public static List<Integer> remove7s(List<Integer> list){
		Iterator itr = list.iterator();
        while (itr.hasNext()) {
            int x = (Integer)itr.next();
            if (x == 7)
                itr.remove();
        }
		return list;
	}
//27. Create a method, intArrayToArrayList, that takes in an array of integers and returns an array list of integers.
//28. Create a method, listsToMap, that takes in to arraylists of the same length and creates a hashmap with keys matching the first arraylist, set to values matching the second arraylist.
	public static HashMap<String, String> listsToMap(ArrayList<String> arr1, ArrayList<String> arr2){
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < arr1.size(); i++){
			map.put(arr1.get(i), arr2.get(i));
		}
		return map;
	}
	
//29. Create a method, sameMapValues, that takes in a hashmap and returns true if any keys have matching values, and false if all keys have unique values. Assume the hash map has string keys and integer values.
	public static boolean sameMapValues(HashMap<String, Integer> map){
		Collection<Integer> valuesList = map.values();
		Set<Integer> valuesSet = new HashSet<Integer>(map.values());
		return valuesList.size() != valuesSet.size();
	}
//30. Create a method, concatTwoMapValues, that takes in three inputs total: a hashmap with string keys and string inputs, and two string inputs. The method will return the concatenation of the values of hash map at the keys that match with the string inputs. If no key is found on the hash map matching with one or both of the passed in string inputs, an empty string will be concatentated.
//31. Create a method, getStringInfo, that takes in a string and returns a hashmap with the following keys:
//            "length" - containing the length of the passed in string
//  "noOfCs" - containing the number of c's in the pass in string (case insensitive)
//            "indexOfFirstVowel" - containing the index number within the string of the first vowel
	public static HashMap<String, Integer> getStringInfo(String str){
		int cCount = 0;
		String vowels = "aeiouAEIOU";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("length", str.length());
		for(char character : str.toCharArray()){
			if(character == 'c'){
				cCount++;
			}
		}
		map.put("noOfCs", cCount);
		for (int i = 0; i < str.length(); i++)
    {
        if (vowels.contains(String.valueOf(str.charAt(i)))){
            map.put("indexOfFirstVowel", i);
			break;
        }
    }
		return map;
	}
//32. Create a method, reverseValues, that takes in an arraylist of string values and returns the arraylist with each string in reverse-order
	public static ArrayList<String> reverseValues(ArrayList<String> arr){
		ArrayList<String> newList = new ArrayList<>(arr.size());
		for (String s : arr) {
			String wordToAdd = new StringBuilder(s).reverse().toString();
			newList.add(wordToAdd);
		}
		return newList;
	}
//33. Create a method, progressUpMusicKeys, that takes in a letter char and an integer number of how many keys up or down from a given a "key"/"note" the output letter char will be. The musical alphabet is made of the letters A-G. One letter below A will be G. One letter above G will be A.
//34. Create a method, hashKeysToList, that takes in a hash map and returns the keys of the map as an array list in alphabetical order.
//            35. Create a method, intToByte, that takes in an integer and returns the value as a byte. If the byte value is not the same as the integer due to overflow, throw a custom exception called ValueMismatchException. The exception should extend from exception and should not be handled by a try catch in the method.
//36. Create a method, generateFibonacciSequence, that takes in an integer and returns the Fibonacci sequence up to the passed in input.
//37. Create a method, returnHalveTheInput, that takes in an integer and returns halve the value as a double.
	public static double returnHalveTheInput(int num){
		return (double) num/ 2;
	}
//38. Create a method, returnUniqueValues, that takes in two arraylists of integers and returns only integers that do not appear anywhere in both lists.
	public static ArrayList<Integer> returnUniqueValues(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		ArrayList<Integer> unique = new ArrayList<>(arr1);
		unique.removeAll(arr2);
		return unique;
	}
//            39. Create a method, weaveList, that takes in two arraylists of Character letters and returns an arraylist of Character letters of that alternate between the indexes of the first and second arraylist. If one arraylist is longer that another, the remaining letters of the longer list will continue to add to the end of the output arraylist.
//40. Create a method with a void return type, soutCadence, that takes in a hashmap of string keys and integer values. The method should sout out the name of each key in the hashmap after the number of milliseconds stored as the value at a given key.
//            --------------------------------- The next sets of problems, will require creating and adding to two new classes:
//            40 - 60 : instance methods
//  40 - 50 : Product, Store classes
//40. Create a class, Product, with following...
//            - private instance properties...
//    productId (long),
//    name (string),
//    type (string),
//    description (string),
//    priceInCents (long),
//    onClearence (boolean, indicating a 10% discount off the priceInCents),
//    soldOn (date)
//  - public getters and setters for all properties
//  - a constructor that sets all properties
//41. Create a class, Store, with the following...
//            - private instance properties...
//    name (string)
//    description (string)
//    dateOfFirstSale (date)
//    dateOfMostRecentSale (date)
//    inventory (hashmap with keys for various product names with arraylist values of the type Product)
//  - public getters and setters for all properties
//  - a constructor setting the values for all properties
//42. Add an instance method to the Store class, addProductToInventory, that adds a key and arraylist for a new product name and appends to an existing list if the key already exists in the inventory.
//42. Add an instance method to the Store class, removeProductFromInventory, that adds a key and arraylist for a new product name and appends to an existing list if the key already exists in the inventory.
//43. Add an instance method to the Store class, getProductById, that searches the correct list at a given product name matching key in the inventory hash map for a product matching a given id and returns this product object.
//            44. Add an instance method to the Store class, sellProduct, that takes in a product id and sets soldOn date to todays date and updates the dateOfMostRecentSale property on the Store object.
//            45. Add an instance method to the Store class, sellProducts, that takes in an arraylist of product ids and sets the soldOn property to todays date and the dateOfMostRecentSale property on the Store class.
//            46. Add an instance method to the Store class, getProductCount, that returns the count of all named products as a hash map with keys matching the name of each key in the inventory hash map and values of integers that correspond to how many products are currently in the inventory.
//            47. Add an instance method to the Store class, activateClearanceDiscount, that takes in the name and id of a product and activates the discount in the inventory product.
//            48 Add an instance method to the Store class, getSoldProducts, that returns a hash map of products with only the products with a soldOn date value that is not null.
//            49. Add an instance method to the Store class, getItemsSoldToday, that returns a list of products from the inventory of all products sold today.
//            50. Add an instance method to the Store class, getListOfTypes, that takes in a name of an inventory key and returns all unique types of products that match the product name.
//51. Add an instance method to the Store class, getMostExpensiveProducts, that returns a list of products with the most expensive price. If only one item has the highest price, the list will only contain the single product. If their are many products that share the same high price, the list will contain all of these products.
//            52. Add an instance method to the Store class, mapToList, that returns all products in the inventory hash map as a single arraylist of products.
//53. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListByPrice, that returns the inventory of products as a list of products sorted by price, lowest to highest.
//            54. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListByName, that returns the inventory of products as a list of products sorted by name alphabetically.
//54. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListById, that returns the inventory of products as a list of products sorted by the product id, lowest to highest.
//            54. Using either the Comparable or Comparator interfaces, add an instance method to the Store class, sortInventoryListSoldDate, that returns the inventory of products as a list sorted chronologically by the sortOn date.
//55. Add an instance method to the Store class, getClearenceMetrics, that returns information about the inventory products sold as a hash map, with a key for "numberOfItemsSoldOnClearence" and "numberOfItemsSold".
//            56. Add an instance method to the Store class, getLongestDescription, that returns the longest product description from the inventory hash map as a string.
//            57. Add an instance method to the Store class, setClearenceForExpensiveProducts, that sets the onClearence property to true for all products in the inventory that have not been sold yet and are more expensive than $100.00.
//            57. Add an instance method to the Store class, invokeNaturalDisaster, that removes randomly anywhere from one to three unsold products from each key of the hashmap. If the list value at a given key does not have enough items to be removed by the randomly generated number, remove all remaining unsold products at that given key.
//58. Add an instance method to the Store class, getAllTypes, that returns all unique product types from the inventory as an arraylist, sorted in alphabetical order.
//59. Add an instance method to the Store class, downsizeInventory, that drops the names of all products in the inventory except the name of the product that has the most sold products.
//            60. Add a static method to the Store class, getTopStore, that takes in a list of store instances and returns the store with the most the highest ratio of sold items to total number of products in their inventories.
//--------------------------------- The next sets of problems will require creating and adding to three new classes:
//            61. Create an abstract class, Customer, with following:
//            - private properties:
//    name (string)
//    customerId (long)
//    dateOfFirstTransaction (date)
//    dateOfMostRecentTransaction (date)
//    numberOfTransactions (date)
//    totalAmountSpentInCents (long)
//    numberOfComplaintsCreated (long)
//    numberOfOffenses (long)
//    isBanned (boolean)
//    isCurrentCustomer (boolean)
//  - public getters and setters
//  - contructor that sets all properties
//  - abstract methods
//            calculateCustomerValue
//    calculateSolicitationFrequency
//            updateBanStatus
//    updateActiveStatus
//            registerNewTransaction
//62. Create Patient class that extends from Customer
//63. Create Shopper class that extends from Customer
//64. Create StreamingSubscriber class that extends from Customer
//65. Implement calculateCustomerValue in Patient class
//66. Implement calculateCustomerValue in Shopper class
//67. Implement calculateCustomerValue in StreamingSubscriber class
//68. Implement calculateSolicitationFrequency in Patient class
//69. Implement calculateSolicitationFrequency in Shopper class
//70. Implement calculateSolicitationFrequency in StreamingSubscriber class
//71. Implement updateBanStatus in Patient class
//72. Implement updateBanStatus in Shopper class
//73. Implement updateBanStatus in StreamingSubscriber class
//74. Implement updateActiveStatus in Patient class
//75. Implement updateActiveStatus in Shopper class
//76. Implement updateActiveStatus in StreamingSubscriber class
//77. Implement registerNewTransaction in Patient class
//78. Implement registerNewTransaction in Shopper class
//79. Implement registerNewTransaction in StreamingSubscriber class
//80. Create a class, CustomerMetrics, and add a static method, getAverageCustomer value, that takes in an arraylist of customers of various types and returns the average of all customerValues.



}