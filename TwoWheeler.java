package week1.day1;

public class TwoWheeler {
     
	int noOfWheels =2;
	short noOfMirrors=4;
	long chassisNumber = 7654852464L;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM= 10020.253;
	String result ="";
	
	public static void main(String[] args) {
		TwoWheeler myTwoWheeler = new TwoWheeler();
		 
		System.out.println("This is Assignment 1 : TwoWheeler");
        System.out.println("My Two Wheeler has");
        System.out.println("No Of Wheels: " + myTwoWheeler.noOfMirrors);
        System.out.println("No Of Mirrors: " + myTwoWheeler.noOfMirrors);
        System.out.println("Chassis Number: " + myTwoWheeler.chassisNumber);
       if (!myTwoWheeler.isPunctured)
    	   myTwoWheeler.result = "No";
       else
    	   myTwoWheeler.result = "Yes";
       System.out.println("Is it Puntuured:" + myTwoWheeler.result);
       System.out.println("Bike Name:" + myTwoWheeler.bikeName);
       System.out.println("Running KM: " + myTwoWheeler.runningKM);
	}
}

