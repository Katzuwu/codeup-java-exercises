package grades;

import java.util.ArrayList;

public class Students {
	private final String name;
	private static ArrayList<Integer> grades;

	public Students(String name){
		this.name = name;
		grades = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addGrade(int grade){
		grades.add(grade);
	}

	public double getGradeAverage(){
		double total = 0;
		for (Integer grade : grades){
			total += grade;
		} return total / grades.size();
	}

	public static void main(String[] args) {
		Students student = new Students("Tuna");
		student.addGrade(68);
		student.addGrade(85);
		student.addGrade(93);
		student.addGrade(75);
		System.out.println(student.getGradeAverage());

		Students tim = new Students("tim");
		tim.addGrade(99);
		tim.addGrade(99);
		tim.addGrade(99);


		System.out.println(tim.getGradeAverage());
	}

}
