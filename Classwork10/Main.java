package Classwork10;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Book ===");
        Book book1 = new Book("1984", "джордж оруэлл", 1949);
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.updateYear(1950);
        
        Book book2 = new Book("преступление и наказание", "достоевский", 1866, true, 672);
        book2.displayInfo(true);
        book2.displayInfo(false);
        book2.borrowBook("иван петров");

        System.out.println("всего книг: " + Book.getTotalBooks());
        System.out.println("максимальный год: " + Book.MAX_YEAR);
        book2.setYear(3000);
        book2.setTitle("");
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА BankAccount ===");
        BankAccount account1 = new BankAccount("123456789", "иван иванов", 1000.0, "rub", true);
        account1.displayInfo();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(2000.0);
        account1.deactivateAccount();
        
        BankAccount account2 = new BankAccount("987654321", "петр сидоров", 5000.0, "usd", true);
        account2.deposit(1000.0, "зарплата");
        account2.withdraw(500.0, "оплата жилья");
        account2.displayInfo(false);

        System.out.println("расчет сложного процента: " + BankAccount.calculateInterest(1000, 5, 2));
        System.out.println("всего счетов: " + BankAccount.totalAccounts);
        System.out.println("название банка: " + BankAccount.BANK_NAME);
        account2.setBalance(-100);
        account2.setBalance(2000000000);
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА MobilePhone ===");
        MobilePhone phone1 = new MobilePhone("samsung", "galaxy S21", 128, 50, true);
        phone1.displayInfo();
        phone1.chargeBattery(30);
        phone1.useBattery(20);
        phone1.powerOff();
        
        MobilePhone phone2 = new MobilePhone("iphone", "15 pro", 256, 20, false);
        phone2.chargeBattery(50, 120);
        phone2.useBattery(15, "youtube");
        phone2.displayInfo(false);
        phone2.powerOn();

        MobilePhone.displayTechSupport();
        System.out.println("всего телефонов: " + MobilePhone.totalPhones);
        System.out.println("максимальный заряд батареи: " + MobilePhone.MAX_BATTERY);
        phone2.setBatteryLevel(150);
        phone2.setStorageGB(-50);
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Product ===");
        Product product1 = new Product("iphone", 999.99, "смартфоны", true, 10);
        product1.displayInfo();
        product1.applyDiscount(10.0);
        product1.sell(3);
        product1.sell(10);
        product1.restock(5);
        
        Product product2 = new Product("macbook", 1999.99, "ноутбуки", true, 5);
        product2.applyDiscount(15.0, "summer2024");
        product2.restock(10, "apple inc.");
        product2.sell(2, "ооо ромашка");
        product2.displayInfo(true);
        product2.displayInfo(false);

        Product[] products = {product1, product2};
        System.out.println("общая стоимость товаров: " + Product.calculateTotalValue(products));
        System.out.println("всего товаров: " + Product.totalProducts);
        System.out.println("название магазина: " + Product.STORE_NAME);
        product2.setPrice(-100);
        product2.setQuantity(-5);
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Car ===");
        Car car1 = new Car("toyota", "camry", 2022, "черный", 2500000.0, false, 0.0);
        car1.displayInfo();
        car1.startEngine();
        car1.drive(150.5);
        car1.repaint("красный");
        car1.updatePrice(2300000.0);
        car1.stopEngine();
        
        Car car2 = new Car("bmw", "x5", 2023, "синий", 5000000.0, true, 1000.0);
        car2.updatePrice(4800000.0, "скидка по акции");
        car2.displayInfo(true);
        car2.displayInfo(false);

        System.out.println("всего машин: " + Car.totalCars);
        System.out.println("страна: " + Car.COUNTRY);
        car2.setYear(3000);
        car2.setPrice(-100000);
        car2.setMileage(-50);
    }
}