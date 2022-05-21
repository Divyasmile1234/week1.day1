package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int Input = 13;
            int Flag = 0;
            if (Input == 0 || Input == 1) {
            	
            	System.out.println("Output: " + Input + "is a Prime Number ");
            }
            else {
            	for (int i = 2; i<= Input/2; i++)
            	{
            		System.out.println("Output:" + Input + "is not a Prime Number");
            		Flag = 1;
            		break;
            	}
            }
            if (Flag == 0) {
            	System.out.println("Output:" + Input + "is a Prime Number");
            	}
            }
	}


