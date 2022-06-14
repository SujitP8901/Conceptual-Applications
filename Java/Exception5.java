import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
	public AgeInvalid(String str)
	{
		super(str);
	}
}

class Exception5
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int iAge = sobj.nextInt();
		
		try
		{
			if(iAge < 18)
			{
				throw new AgeInvalid("Age is below 18");
			}
		}
		catch(AgeInvalid obj)
		{
			System.out.println("Inside catch");
			System.out.println(obj);
		}		
		
	}
}