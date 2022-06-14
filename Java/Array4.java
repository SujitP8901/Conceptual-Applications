import java.lang.*;
import java.util.*;


class Array4
{
	public static void main(String arg[])
	{
		int iCnt1 = 0, iCnt2 = 0;
		int arr[][] = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		
		for(iCnt1 = 0; iCnt1 < arr.length; iCnt1++)
		{
			for(iCnt2 = 0; iCnt2 < arr[iCnt1].length; iCnt2++)
			{
				arr[iCnt1][iCnt2] = 0;
			}
		}
		
		for(iCnt1 = 0; iCnt1 < arr.length; iCnt1++)
		{
			for(iCnt2 = 0; iCnt2 < arr[iCnt1].length; iCnt2++)
			{
				System.out.print(arr[iCnt1][iCnt2] + "\t");
			}
			System.out.println();
		}
		
	}
}
