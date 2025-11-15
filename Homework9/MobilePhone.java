package Homework9;

public class MobilePhone {
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;

	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
	}

	public MobilePhone() {
		this("unknown brand", "unknown model", 0, 0, false);
	}

	public MobilePhone(String brand, String model, int storageGB) {
		this(brand, model, storageGB, 0, false);
	}

	public void displayInfo() {
		System.out.println("телефон марки: " + brand + ", модели: " + model);
		System.out.println("количество памяти: " + storageGB + " GB");
		System.out.println("уровень зарядки батареи: " + batteryLevel + "%");
		System.out.println("включен ли телефон? " + isPoweredOn);
	}

	public void powerOn() {
		isPoweredOn = true;
		System.out.println("телефон включен");
	}

	public void powerOff() {
		isPoweredOn = false;
		System.out.println("телефон выключен");
	}

	public void chargeBattery(int percent) {
	    int oldBattery = batteryLevel;
	    if (percent > 0) {
	        batteryLevel = (batteryLevel + percent > 100) ? 100 : batteryLevel + percent;
	    }
	    System.out.println("телефон зарядился на " + (batteryLevel - oldBattery) + " процентов");
	}

	public void useBattery(int percent) {
	    int oldBattery = batteryLevel;
	    if (percent > 0) {
	        batteryLevel = (batteryLevel - percent < 0) ? 0 : batteryLevel - percent;
	    }
	    System.out.println("телефон разрядился на " + (oldBattery - batteryLevel) + " процентов");
	}
}