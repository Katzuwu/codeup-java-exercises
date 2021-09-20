package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

	public static void main(String[] args) {
		HashMap<String, Students> students = new HashMap<>();
		Students jerry = new Students("Jerry");
		jerry.addGrade(90);
		jerry.addGrade(95);
		jerry.addGrade(98);

		Students tom = new Students("Tom");
		tom.addGrade(87);
		tom.addGrade(89);
		tom.addGrade(82);

		Students spike = new Students("Spike");
		spike.addGrade(70);
		spike.addGrade(67);
		spike.addGrade(75);

		Students toodles = new Students("Toodles Galore");
		toodles.addGrade(93);
		toodles.addGrade(87);
		toodles.addGrade(89);

		students.put("cheeselover", jerry);
		students.put("mousecatcher", tom);
		students.put("machoman", spike);
		students.put("toodlesxbutch", toodles);

//		if (students.containsKey(userInput)) {
//			Student chosen = (Student) students.get(userInput);
		System.out.println("Welcome user! We have a few github users on here.");
		searchStudents(students);

	}

	public static void searchStudents(HashMap<String, Students> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which user would you like to view?");
		for (String key : students.keySet()) {
			System.out.print("|" + key + "|");
		}
		System.out.println("");
		String usernameRequest = sc.nextLine();
		if (students.containsKey(usernameRequest)) {
			System.out.println("Name: " + students.get(usernameRequest).getName() + "\nGithub Username: " + usernameRequest + "\nGrade Average: " + students.get(usernameRequest).getGradeAverage());
			System.out.println("Would you like to see another student?");
			String userYesOrNo = sc.nextLine();
			if (userYesOrNo.equalsIgnoreCase("y") || userYesOrNo.equalsIgnoreCase("yes")){
				searchStudents(students);
			} else if (userYesOrNo.equalsIgnoreCase("n") || userYesOrNo.equalsIgnoreCase("no")){
				System.out.println("Goodbye, and have a wonderful day!");
			}
		} else {
			System.out.println("Sorry, it doesn't seem like that username matches our database.");
			searchStudents(students);
		}
	}
}
