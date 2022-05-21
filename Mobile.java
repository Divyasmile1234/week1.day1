package week1.day1;

   public class Mobile {
    public void makecall() {
	 System.out.println("make a Call");
	 
 }
    public void message() {
    	System.out.println("Text me Please");
    }
    
    public static void main(String[] args) {
    	System.out.println("hello");
    	Mobile myMob = new Mobile();
    	myMob.makecall();
    	myMob.message();
    }
}
