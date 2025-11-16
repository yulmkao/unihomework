package Classwork10;

public class Book {
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;
	private static int totalBooks = 0;
	public static final int MAX_YEAR = 2025;

	public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
		this.pageCount = pageCount;
		totalBooks++;
	}

	public Book() {
		this("unknown title", "unknown name", 2000, true, 0);
	}

	public Book(String title, String author, int year) {
		this(title, author, year, true, 0);
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
    	if (title != null && title.length() != 0) {
    		this.title = title;
    	} else {
    		System.out.println("введи нормальное название");
    	}
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
    	if (author != null && author.length() != 0) {
        	this.author = author;
    	} else {
    		System.out.println("введи нормального автора");
    	}
    }

    public int getYear() {
    	return year;
    }

    public void setYear(int year) {
    	if (year >= 1 && year <= MAX_YEAR) {
    		this.year = year;
    	} else {
    		System.out.println("этот год не подходит");
    	}
    }

    public boolean getIsAvailable() {
    	return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
    	this.isAvailable = isAvailable;
    }

    public int getPageCount() {
    	return pageCount;
    }

    public void setPageCount(int pageCount) {
    	if (pageCount > 0) {
    		this.pageCount = pageCount;
    	}
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

	public void displayInfo() {
		System.out.println("книга: " + title);
		System.out.println("автор: " + author);
		System.out.println("год издания: " + year);
		System.out.println("количество страниц: " + pageCount);
		System.out.println("доступна: " + (isAvailable ? "да" : "нет"));
	}

	public void displayInfo(boolean detailed) {
		if (detailed == true) {
			displayInfo();
		} else {
			System.out.println("книга: " + title + " - " + author + " (" + year + ")");
		}
	}

	public void borrowBook() {
		isAvailable = false;
		System.out.println(title + " теперь взята");
	}

	public void borrowBook(String borrowerName) {
		isAvailable = false;
		System.out.println(title + " теперь взята " + borrowerName);
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