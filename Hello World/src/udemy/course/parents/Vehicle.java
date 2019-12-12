package udemy.course.parents;

public class Vehicle {
	protected String engine;
	protected int wheels;
	protected int seats;
	protected int fuelTank;
	protected String lights;
	protected Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 5;
		this.fuelTank = 35;
		this.lights = "headlight";
	}
	protected Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}
	public void run() {
		System.out.println("Vehicle is running");
	}
	
}
