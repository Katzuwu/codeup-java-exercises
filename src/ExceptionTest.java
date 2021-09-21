import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		String string = "foo bar";
//		try {
//			System.out.println(string.substring(10));
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("String Index is out of bounds");
//		}
		ExceptionTest test = new ExceptionTest();
		try {
			test.subListMaker("I do not know how this method actually works.");
		} catch (IndexOutOfBoundsException iobx){
			System.out.println("Sorry, you went out of bounds with your integer!");
		} catch (InputMismatchException imx){
			System.out.println("Silly, you didn't enter an integer!");
		} catch (NullPointerException npx){
			System.out.println("Oh no! You entered null.");
		} catch (IllegalArgumentException iax){
			System.out.println("The second number was lower than the first one!");
		} finally {
			System.out.println("Thank you!");
		}
	}
	public void subListMaker(String sentence){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int firstInt = scanner.nextInt();
		System.out.println("Please enter another integer");
		int secondInt = scanner.nextInt();
		System.out.println(sentence);
		ArrayList<String> wordArrayList = new ArrayList<String>();
		String[] stringArray = sentence.split(" ");
		for (String word : stringArray){
			wordArrayList.add(word);
		}
		List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
		String newSentence = String.join(" ", shorterList);
		System.out.println(newSentence);
	}
}
