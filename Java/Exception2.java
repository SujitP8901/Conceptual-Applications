import java.util.*;

class Exception2
{
	public static void main(String a[])
	{
		int iAns = 0, iNo1 = 0, iNo2 = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please Enter First Number : ");
		iNo1 = sobj.nextInt();
		
		System.out.println("Please Enter Second Number : ");
		iNo2 = sobj.nextInt();
		
		try
		{
			iAns = iNo1/iNo2;		// Exception Prone Code
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception occured as : " + obj);
		}
		System.out.println("Division is : " + iAns);
		
		sobj.close();
	}
}