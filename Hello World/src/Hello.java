//import udemy.course.Car;

public class Hello {

	public static void main(String[] args) {
	    //getSumOfDigits(12345);
	    //Calculate cl = new Calculate();
	    //System.out.println("Area of rectangle:"+cl.area(5,6));
	    //Car car = new Car("closed","seated",10);
	    //car.run();
		Eagle eagle = new Eagle(10.5, 15.45, "Birds", "B", true, true);
		eagle.showInfo();
		Eil eil = new Eil(5.6, 4.5);
		eil.showInfo();
		
	}
	
	public static void getSumOfDigits(int num){
		int sumOfDigits=0;
	
		while(num>0)
		{
			
			sumOfDigits += num%10;
			num = num/10;
		}
		System.out.println(sumOfDigits);
	}
}
