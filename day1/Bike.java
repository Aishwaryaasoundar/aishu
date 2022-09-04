package week1.day1;

public class Bike {
	public void applyBreak() 
	 {
		System.out.println("Break applied");
	 }
	 public void soundHorn() 
	 {
		 System.out.println("Sound horn");
	 
	 }
public static void main(String[] args) {
	Bike obj=new Bike();
	obj.applyBreak();
	obj.soundHorn();
}
}
