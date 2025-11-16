package Classwork10;

public class Product {
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;
	public static int totalProducts = 0;
	public static final String STORE_NAME = "Супермаркет 'У дома'";

	public Product(String name, double price, String category, boolean inStock, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.inStock = inStock;
		this.quantity = quantity;
		totalProducts++;
	}

	public Product() {
		this("unknown name", 0.0, "unknown category", false, 0);
	}

	public Product(String name, double price, String category) {
		this(name, price, category, false, 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean getInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		}
	}

	public static double calculateTotalValue(Product[] products) {
	    double totalValue = 0;
	    for (Product product : products) {
	        totalValue += product.getPrice() * product.getQuantity();
	    }
	    return totalValue;
	}

	public void displayInfo() {
		System.out.println("магазин: " + STORE_NAME); 
	    System.out.println("название товара: " + name);
	    System.out.println("цена: " + price);
	    System.out.println("категория: " + category);
	    System.out.println("есть в наличии? " + inStock);
	    System.out.println("количество на складе: " + quantity);
	    System.out.println("всего товаров в магазине: " + totalProducts);
	}

	public void displayInfo(boolean showStockStatus) {
		if (showStockStatus == true) {
       		displayInfo();
        } else {
        	System.out.println("магазин: " + STORE_NAME); 
	        System.out.println("название товара: " + name);
			System.out.println("цена: " + price);
			System.out.println("категория: " + category);
			System.out.println("количество на складе: " + quantity);
			System.out.println("всего товаров в магазине: " + totalProducts);
        }
    }

	public void applyDiscount(double percent) {
		price = price - (price * percent / 100);
		System.out.println("цена с учетом скидки: " + price);
	}

	public void applyDiscount(double percent, String promoCode) {
        applyDiscount(percent);
        System.out.println("промокод: " + promoCode);
    }

	public void restock(int amount) {
		quantity += amount;
		System.out.println("количество товаров на складе после пополнения новыми товарами: " + quantity);
	}

	public void restock(int amount, String supplier) {
        restock(amount);
        System.out.println("поставщик: " + supplier);
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

    public void sell(int amount, String customer) {
	    sell(amount);
	    System.out.println("покупатель: " + customer);
	}
}