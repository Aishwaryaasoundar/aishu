package week1.day1;

public class ClassStudent {
	String studentName ="Aishwarya";
	int rollNo =12345;
	String collegeName ="GKMCET";
	Float markScored=73.3f;
	double cgpa=9.5;
	public void classReport()
	{
		System.out.println(studentName);
		System.out.println(rollNo);
		System.out.println(collegeName);
		System.out.println(markScored);
		System.out.println(cgpa);
	}
	public static void main(String[] args) {
		
		ClassStudent obj=new ClassStudent();
		obj.classReport();
	}
}
