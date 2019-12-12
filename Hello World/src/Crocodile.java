import udemy.course.Reptile;
public class Crocodile extends Reptile {
	protected boolean hardShelledEggs = true;

	protected Crocodile(double height, double weight, boolean softShelledEggs, boolean hardShelledEggs) {
		super(height, weight, softShelledEggs);
		this.hardShelledEggs = hardShelledEggs;
	}
	
}
