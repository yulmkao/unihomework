package Classwork10;

public class MobilePhone {
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;
	public static int totalPhones;
	public static final int MAX_BATTERY = 100;

	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
		totalPhones++;
	}

	public MobilePhone() {
		this("unknown brand", "unknown model", 0, 0, false);
	}

	public MobilePhone(String brand, String model, int storageGB) {
		this(brand, model, storageGB, 0, false);
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

	public int getStorageGB() {
		return storageGB;
	}

	public void setStorageGB(int storageGB) {
		if (storageGB >= 0) {
			this.storageGB = storageGB;
		} else {
			System.out.println("не может быть отрицательным");
		}
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(int batteryLevel) {
	    if (batteryLevel >= 0 && batteryLevel <= MAX_BATTERY) {
	        this.batteryLevel = batteryLevel;
	    }
	}

	public boolean getIsPoweredOn() {
		return isPoweredOn;
	}

	public void setIsPoweredOn(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}

	public static void displayTechSupport() {
		System.out.println("телефон техподдержки: +79061333231");
        System.out.println("часы работы: 24/7");
        System.out.println("email: yulmkao@gmail.com");
        System.out.println("веб-сайт: www.yulmkaosupport.com");
        System.out.println("адрес: г. казань, ул. пушкина, д. 32");
	}

	public void displayInfo() {
		System.out.println("телефон марки: " + brand + ", модели: " + model);
		System.out.println("количество памяти: " + storageGB + " GB");
		System.out.println("уровень зарядки батареи: " + batteryLevel + "%");
		System.out.println("включен ли телефон? " + isPoweredOn);
	}

	public void displayInfo(boolean showPowerStatus) {
	    if (showPowerStatus == true) {
	        displayInfo();
	    } else {
	        System.out.println("телефон марки: " + brand + ", модели: " + model);
	        System.out.println("количество памяти: " + storageGB + " GB");
	        System.out.println("уровень зарядки батареи: " + batteryLevel + "%");
	    }
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
	        batteryLevel = (batteryLevel + percent > MAX_BATTERY) ? MAX_BATTERY : batteryLevel + percent;
	    }
	    System.out.println("телефон зарядился на " + (batteryLevel - oldBattery) + " процентов");
	}

	public void chargeBattery(int percent, int minutes) {
	    chargeBattery(percent);
	    System.out.println("время зарядки: " + minutes + " минут");
	}

	public void useBattery(int percent) {
	    int oldBattery = batteryLevel;
	    if (percent > 0) {
	        batteryLevel = (batteryLevel - percent < 0) ? 0 : batteryLevel - percent;
	    }
	    System.out.println("телефон использовал " + (oldBattery - batteryLevel) + " процентов заряда");
	}

	public void useBattery(int percent, String appName) {
	    useBattery(percent); 
	    System.out.println("энергозатратное приложение: " + appName);
	}
}