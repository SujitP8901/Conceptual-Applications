import java.lang.*;
import java.util.*;


class Array2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0;
		
		System.out.println("Enter Number of Elements : ");
		iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter Elements of Array : ");
		for(iCnt = 0;iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
		System.out.println("Entered Elements of Array : ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}
