package Homework9;

public class Product {
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;

	public Product(String name, double price, String category, boolean inStock, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.inStock = inStock;
		this.quantity = quantity;
	}

	public Product() {
		this("unknown name", 0.0, "unknown category", false, 0);
	}

	public Product(String name, double price, String category) {
		this(name, price, category, false, 0);
	}

	public void displayInfo() {
		System.out.println("название товара: " + name);
		System.out.println("цена: " + price);
		System.out.println("категория: " + category);
		System.out.println("есть в наличии? " + inStock);
		System.out.println("количтесво на складе: " + quantity);
	}

	public void applyDiscount(double percent) {
		price = price - (price * percent / 100);
		System.out.println("цена с учетом скидки: " + price);
	}

	public void restock(int amount) {
		quantity += amount;
		System.out.println("количество товаров на складе после пополнения новыми товарами: " + quantity);
	}

	public void sell(int amount) {
	    if (inStock == true && quantity >= amount) {
	        quantity -= amount;
	        System.out.println("товар был продан, остаток: " + quantity);

	        if (quantity == 0) {
	            inStock = false;
	            System.out.println("товара нет на складе");
	        }
	    } else {
	    	System.out.println("недостаточно товаров на складе");
	    }
    }
}