package Homework9;

public class Book {
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int count;

	public Book(String title, String author, int year, boolean isAvailable, int count) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
		this.count = count;
	}

	public Book() {
		this("unknown title", "unknown name", 2000, true, 0);
	}

	public Book(String title, String author, int year) {
		this(title, author, year, true, 0);
	}

	public void displayInfo() {
		System.out.println("книга: " + title);
		System.out.println("автор: " + author);
		System.out.println("год издания: " + year);
		System.out.println("количество страниц: " + count);
	}

	public void borrowBook() {
		isAvailable = false;
		System.out.println(title + " теперь взята");
	}

	public void returnBook() {
		isAvailable = true;
		System.out.println(title + " возвращена в библиотеку");
	}

	public void updateYear(int newYear) {
		year = newYear;
		System.out.println("обновленный год издания: " + year);
	}
}