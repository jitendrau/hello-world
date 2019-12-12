package udemy.course;
import udemy.course.parents.Animal;
public class Reptile extends Animal {
	protected boolean drySkin = true;
	protected boolean backbone = true;
	protected boolean softShelledEggs = true;
	protected Reptile(double height, double weight,boolean softShelledEggs) {
		super(height, weight, "Reptile", "C");
		this.softShelledEggs = softShelledEggs;
	}
	@Override
	public String toString() {
		return "Reptile [drySkin=" + drySkin + ", backbone=" + backbone + ", softShelledEggs=" + softShelledEggs + "]";
	}
	
	
}
