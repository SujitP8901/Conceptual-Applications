import java.util.*;

class Input
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name : ");
		String name = sobj.nextLine();
		
		System.out.println("Please Enter Your Age : ");
		int age = sobj.nextInt();
		
		System.out.println("Please Enter Your Percentage : ");
		float percentage = sobj.nextFloat();
		
		System.out.println("Enter Your Phone Number : ");
		long phoneNumber = sobj.nextLong();
		
		System.out.println("Your Name is : " + name);
		System.out.println("Your Age : " + age);
		System.out.println("Your Percentage : " + percentage);
		System.out.println("Your Phone Number : " + phoneNumber);
		
		sobj.close();
	}
}