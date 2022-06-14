import java.lang.*;
import java.util.*;

class Marvellous
{
	public int Arr[];
	
	public Marvellous(int size)
	{
		Arr = new int[size];
	}
	
	public void Accept()		//Setter Method
	{
		Scanner sobj = new Scanner(System.in);
		int iCnt = 0;
		
		System.out.println("Enter Numbers : ");
		
		for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
		{
			this.Arr[iCnt] = sobj.nextInt();
		}
	}
	
	public void Display()		//Getter Method
	{
		int iCnt = 0;
		
		System.out.println("Entered Numbers are : ");
		
		for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
		{
			System.out.println(this.Arr[iCnt] + " ");
		}
	}
	
	synchronized public void DisplayEven()
	{
		int iCnt = 0;
		
		System.out.println("Even Numbers are : ");
		for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
		{
			if((this.Arr[iCnt] % 2) == 0)
			{
				System.out.println(this.Arr[iCnt]);
			}
		}
	}
}

class Demo extends Thread
{
	public Marvellous mref;
	
	public Demo(Marvellous obj)
	{
		this.mref = obj;
	}
	
	public void run()			
	{
		this.mref.DisplayEven();
	}
}

class Mythread6 
{
	public static void main(String arg[]) throws Exception
	{
		Marvellous mobj1 = new Marvellous(5);
		
		Marvellous mobj2 = new Marvellous(8);
		
		mobj1.Accept();
		mobj1.Display();
		
		mobj2.Accept();
		mobj2.Display();
		
		Demo dobj1 = new Demo(mobj1);
		Demo dobj2 = new Demo(mobj2);
		
		Thread t1 = new Thread(dobj1);
		Thread t2 = new Thread(dobj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("End Of Main Thread");
		
		
	}
}