import java.lang.*;
import java.util.*;

class Demo
{
	public int Division(int iNo1, int iNo2) throws ArithmeticException
	{
		return iNo1/iNo2;
	}
}

class Exception4
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int iValue1 = sobj.nextInt();
		
		System.out.println("Enter Second Number : ");
		int iValue2 = sobj.nextInt();
		
		Demo dobj = new Demo();
		
		int iRet = dobj.Division(iValue1, iValue2);
		
		System.out.println("Division is : " + iRet);
		
	}
}