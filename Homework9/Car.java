package Homework9;

public class Car {
	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;

	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
	}

	public Car() {
		this("unknown brand", "unknown model", 0, "unknown color", 0.0, false, 0.0);
	}

	public Car(String brand, String model, int year) {
		this(brand, model, year, "unknown color", 0.0, false, 0.0);
	}

	public void displayInfo() {
		System.out.println("марка машины " + brand + ", имеющая модель " + model + ", выпущенная в " + year + " году");
		System.out.println("цвет машины: " + color);
		System.out.println("цена машины: " + price);
		System.out.println("заведена ли машина? " + isRunning);
		System.out.println("пробег: " + mileage);
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
}