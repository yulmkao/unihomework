package Homework9;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Book ===");
        Book book1 = new Book("1984", "джордж оруэлл", 1949);
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.updateYear(1950);
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА BankAccount ===");
        BankAccount account1 = new BankAccount("123456789", "иван иванов", 1000.0, "rub", true);
        account1.displayInfo();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(2000.0);
        account1.deactivateAccount();
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА MobilePhone ===");
        MobilePhone phone1 = new MobilePhone("samsung", "galaxy S21", 128, 50, true);
        phone1.displayInfo();
        phone1.chargeBattery(30);
        phone1.useBattery(20);
        phone1.powerOff();
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Product ===");
        Product product1 = new Product("iphone", 999.99, "смартфоны", true, 10);
        product1.displayInfo();
        product1.applyDiscount(10.0);
        product1.sell(3);
        product1.sell(10);
        product1.restock(5);
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Car ===");
        Car car1 = new Car("toyota", "camry", 2022, "черный", 2500000.0, false, 0.0);
        car1.displayInfo();
        car1.startEngine();
        car1.drive(150.5);
        car1.repaint("красный");
        car1.updatePrice(2300000.0);
        car1.stopEngine();
    }
}