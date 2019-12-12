package udemy.course;
import udemy.course.parents.Animal;
public class Birds extends Animal{
	boolean animalWithFeathers;
	boolean canFly;
	protected Birds(double height, double weight, String animalType, String bloodType, boolean animalWithFeathers,
			boolean canFly) {
		super(height, weight, animalType, bloodType);
		this.animalWithFeathers = animalWithFeathers;
		this.canFly = canFly;
	}
	@Override
	public String toString() {
		return "Birds [animalWithFeathers=" + animalWithFeathers + ", canFly=" + canFly + ", toString()="
				+ super.toString() + "]";
	}
	
}
