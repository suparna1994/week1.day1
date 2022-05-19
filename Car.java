package week1.day1;

public class Car 
{
public void applyBreak()
{
	System.out.println("We can applay break on the car");
}
public void applyGear()
{
	System.out.println("We can applay gear on the car");
	
}
public void switchonAC()
{
	System.out.println("We can switch on ac on the car");
	
}
public void applyAcclerate()
{
	System.out.println("We can applay accelaror on the car");
}
public static void main(String[] args) {
	System.out.println("The car details are");
	Car MyCar =new Car();
	MyCar.applyBreak();
	MyCar.applyGear();
	MyCar.switchonAC();
	MyCar.applyAcclerate();
}
}
