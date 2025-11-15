package Classwork9;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private String group;
	private double averageGrade;
	private boolean isActive;

	public Student() {
		this.firstName = "неизвестно";
		this.lastName = "неизвестно";
		this.age = 0;
		this.group = "не назначена";
		this.averageGrade = 0.0;
		this.isActive = false;
	}

	public Student(String firstName, String lastName, String group) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 0;
		this.group = group;
		this.averageGrade = 0.0;
		this.isActive = false;
	}

	public Student(String firstName, String lastName, int age, String group, double averageGrade, boolean isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.group = group;
		this.averageGrade = averageGrade;
		this.isActive = isActive;
	}

	public void displayInfo() {
		System.out.println("информация о студенте " + firstName + " " + lastName);
		System.out.println("возраст: " + age);
		System.out.println("группа: " + group);
		System.out.println("средний балл: " + averageGrade);
		System.out.println("активен? " + (isActive ? "да" : "нет"));
	}

	public void updateGrade(double newGrade) {
		this.averageGrade = newGrade;
		System.out.println("студент " + firstName + " " + lastName + " теперь имеет средний балл " + averageGrade);
	}

	public void activateStudent() {
		isActive = true;
		System.out.println("студент " + firstName + " " + lastName + " теперь активен");
	}

	public void deactivateStudent() {
		isActive = false;
		System.out.println("студент " + firstName + " " + lastName + " теперь деактивен");
	}

	public void transferToNewGroup(String group) {
		this.group = group;
		System.out.println("студент " + firstName + " " + lastName + " переведен в группу " + group);
	}
}