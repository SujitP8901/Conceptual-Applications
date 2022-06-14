import java.lang.*;
import java.util.*;


class Array3
{
	public static void main(String arg[])
	{
		// arr is 2 dimentional array which contains 2 one dimentional array
		// each one dimentional array contains 3 elements
		// each element is of type integer.
		int arr[][] = new int[2][3];
		
		int iCnt1 = 0, iCnt2 = 0;
		
		arr[0][0] = 11;
		arr[0][1] = 21;
		arr[0][2] = 51;
		arr[1][0] = 101;
		arr[1][1] = 111;
		arr[1][2] = 121;
		
		for(iCnt1 = 0; iCnt1 < arr.length; iCnt1++)
		{
			for(iCnt2 = 0; iCnt2 < arr[iCnt1].length; iCnt2++)
			{
				System.out.println(arr[iCnt1][iCnt2]);
			}
		}
			
		
	}
}
