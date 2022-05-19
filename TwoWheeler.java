package week1.day1;

public class TwoWheeler
{
	int noOfWheels=2;
	short noOfMirrors=1;
	long chassisNumber=234;
	boolean isPunctured=true;
	String bikeName="honda";
	double runningKM=455555;
	public static void main(String[] args) {
		System.out.println("The bike details are");
		TwoWheeler bike =new TwoWheeler();
		System.out.println("The No of wheel="+bike.noOfWheels);
		System.out.println("The No of mirrors are="+bike.noOfMirrors);
		System.out.println("The Chassis number is"+" "+bike.chassisNumber);
		System.out.println("The bike is punchtured or not"+" "+bike.isPunctured);
		System.out.println("The bike name is"+" "+bike.bikeName);
		System.out.println("The runningKm is="+bike.runningKM);
		
	}
	
			
	

}
