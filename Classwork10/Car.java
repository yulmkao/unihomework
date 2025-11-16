package Classwork10;

import java.util.Scanner;

public class Car {
	private static Scanner scanner = new Scanner(System.in); //static чтобы был один общий
	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;
    public static int totalCars = 0;
    public static final String COUNTRY = "Россия";

	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
		totalCars++;
	}

	public Car() {
		this("unknown brand", "unknown model", 0, "unknown color", 0.0, false, 0.0);
	}

	public Car(String brand, String model, int year) {
		this(brand, model, year, "unknown color", 0.0, false, 0.0);
	}

	public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1885 && year <= 2025) {
            this.year = year;
        } else {
            System.out.println("введи нормальный год...");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 && price <= 100000000) {
            this.price = price;
        } else {
            System.out.println("ты миллиардер чтоли");
        }
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

	public void displayInfo() {
		System.out.println("страна: " + COUNTRY);
		System.out.println("марка машины " + brand + ", имеет модель " + model + ", была выпущена в " + year + " году");
		System.out.println("цвет машины: " + color);
		System.out.println("цена машины: " + price + " руб");
		System.out.println("заведена ли машина? " + isRunning);
		System.out.println("пробег: " + mileage + " км");
		System.out.println("всего машин в системе: " + totalCars);
	}

	public void displayInfo(boolean showStatus) {
        if (showStatus == true) {
            displayInfo();
        } else {
	        System.out.println("страна: " + COUNTRY);
	        System.out.println("марка машины " + brand + ", модель " + model + ", год выпуска " + year);
	        System.out.println("цвет: " + color);
	        System.out.println("цена: " + price + " руб");
	        System.out.println("пробег: " + mileage + " км");
	        System.out.println("всего машин в системе: " + totalCars);
	    }
    }

	public void startEngine() {
		isRunning = true;
		System.out.println("машина заведена");
	}

	public void stopEngine() {
		isRunning = false;
		System.out.println("машина заглушена");
	}

	public void drive(double distance) {
		mileage += distance;
		System.out.println("пробег увеличился и теперь равен " + mileage + " км");
	}

	public void repaint(String newColor) {
		color = newColor;
		System.out.println("машина была покрашена в " + newColor + " цвет");
	}

	public void updatePrice(double newPrice) {
		price = newPrice;
		System.out.println("машина имеет новую цену в " + newPrice + " рублей");
	}

	public void updatePrice(double newPrice, String reason) {
		updatePrice(newPrice);
		System.out.println("причина изменения цены: " + reason);
    }
}