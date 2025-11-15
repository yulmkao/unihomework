package Classwork9;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.displayInfo();

		Student student2 = new Student("юля", "орешкина", "11-504");
		student2.displayInfo();

		Student student3 = new Student("ктото", "интересный", 18, "11-300", 2.0, true);
		student3.displayInfo();

		student3.transferToNewGroup("11-504");
		student3.deactivateStudent();
		student3.updateGrade(5.0);
		student3.displayInfo();
	}
}