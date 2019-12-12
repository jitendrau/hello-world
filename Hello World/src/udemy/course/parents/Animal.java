package udemy.course.parents;

public class Animal {
	protected double height;
	protected double weight;
	protected String animalType;
	protected String bloodType;
	protected Animal(double height, double weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	
	
}
