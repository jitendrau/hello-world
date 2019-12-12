import udemy.course.Birds;
public class Eagle extends Birds {

	protected Eagle(double height, double weight, String animalType, String bloodType, boolean animalWithFeathers,
			boolean canFly) {
		super(height, weight, animalType, bloodType, animalWithFeathers, canFly);
		// TODO Auto-generated constructor stub
	}
	
	public void showInfo() {
		System.out.println(super.toString());
	}

}
