package week1.day1;

public class Mobile {
	public void sendSms()
	{System.out.println("hi how are you doing");
	}
	public void snapShot()
	{
		System.out.println("Check thesnapshot"); 
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendSms();
		obj.snapShot();
	}
	
}