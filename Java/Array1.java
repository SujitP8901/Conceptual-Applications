import java.lang.*;

class Array1
{
	public static void main(String arg[])
	{
		int arr[] = new int[5];
		int iCnt = 0;
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// length is the property for array in java
		System.out.println("Size of array is : " + arr.length);
		
		//System.out.println("Elements of array are : " + arr);		//Hashcode
		
		
		System.out.println("Elements of array using for loop : ");
		for(iCnt = 0;iCnt < arr.length; iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
		
		System.out.println("Elements of array using while loop : ");
		iCnt = 0;
		while(iCnt < arr.length)
		{
			System.out.println(arr[iCnt]);
			iCnt++;
		}
		
		System.out.println("Elements of array using for each loop : ");
		for(int no:arr)
		{
			System.out.println(no);
		}
	}
}
