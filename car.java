package week1.day1;

  public class car {

	public void applyAccelerate() {
		System.out.println("I can Accelerate the Car");
	}
	  public void applyGear() {
		  System.out.println("I can Gear up the Car");
	  }
	  public void switchonAc() {
		  System.out.println("I can Switch on the AC");
	  }
	  public void applyBreak() {
		System.out.println("I can Break the Car");
	  }
	  
	  public static void main(String[] args) {
		   car myCar=new car();
		 myCar.applyAccelerate();
		 myCar.applyGear();
		 myCar.switchonAc();
		 myCar.applyBreak();
	}

}
