package udemy.course;
import udemy.course.parents.Animal;
public class Fish extends Animal {
	protected boolean liveInWater = true;
	protected boolean hasGills = true;
	protected Fish(double height, double weight, boolean liveInWater,
			boolean hasGills) {
		super(height, weight, "water animal", "A");
		this.liveInWater = liveInWater;
		this.hasGills = hasGills;
	}
	@Override
	public String toString() {
		return "Fish [liveInWater=" + liveInWater + ", hasGills=" + hasGills + super.toString() + "]";
	}
	

}
