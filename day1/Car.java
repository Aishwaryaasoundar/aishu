package week1.day1;

public class Car {
 public void applyBreak() 
 {
	System.out.println("Break applied");
 }
 public void soundHorn() 
 {
	 System.out.println("Sound horn");
 
 }
 public static void main(String[] args) {
	Car obj=new Car();
	obj.applyBreak();
	obj.soundHorn();
}
}
