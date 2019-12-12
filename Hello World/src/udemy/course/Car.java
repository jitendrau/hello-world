package udemy.course;

import udemy.course.parents.Vehicle;

public class Car extends Vehicle {
	private String doors;
	private String driver;
	private int speed;
	
	public Car(String doors, String driver, int speed) {
		super();
		this.doors = doors;
		this.driver = driver;
		this.speed = speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void getCarFeatures()
	{
		System.out.println("Car Engine:"+this.engine);
		System.out.println("Car Wheels:"+this.wheels);
		System.out.println("Car Seats:"+this.seats);
		System.out.println("Car FuelTank:"+this.fuelTank);
		System.out.println("Car Doors:"+this.doors);
		System.out.println("Car Drivers:"+this.driver);
		System.out.println("Car Speed:"+this.speed);
	}
	
	public void run() {
		System.out.println("Car is running");
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", driver=" + driver + ", speed=" + speed + ", engine=" + engine + ", wheels="
				+ wheels + ", seats=" + seats + ", fuelTank=" + fuelTank + ", lights=" + lights + "]";
	}
	
	
}
