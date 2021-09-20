package grades;

import java.util.ArrayList;

public class Student {
	private final String name;
	private ArrayList<Integer> grades;

	public Student(String name){
		this.name = name;
		this.grades = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addGrade(int grade){
		this.grades.add(grade);
	}

	public double getGradeAverage(){
		double total = 0;
		for(int i = 0; i < grades.size(); i++){
			total += grades.get(i);
		} return total / grades.size();
	}

	public static void main(String[] args) {
		Student student = new Student("Tuna");
		student.addGrade(68);
		student.addGrade(85);
		student.addGrade(93);
		student.addGrade(75);
		System.out.println(student.getGradeAverage());

		Student tim = new Student("tim");
		tim.addGrade(99);
		tim.addGrade(99);
		tim.addGrade(99);


		System.out.println(tim.getGradeAverage());
	}

}