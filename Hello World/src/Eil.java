import udemy.course.Fish;
public class Eil extends Fish {
	protected boolean releaseElectricCharge=false;

	protected Eil(double height, double weight) {
		super(height, weight, true, true);
		this.releaseElectricCharge = releaseElectricCharge;
	}
	
	public void showInfo() {
		System.out.println(super.toString());
	}
	
}
