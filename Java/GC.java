import java.lang.*;

class Demo
{
	public int Arr[];
	
	public Demo(int iSize)
	{
		System.out.println("Allocating the resources in Constructor");
		this.Arr = new int[iSize];
	}
	
	protected void finalize()
	{
		System.out.println("Deallocating the Resources in finalize");
		this.Arr = null;
	}
}

class GC
{
	public static void main(String a[])
	{
		Demo dobj = new Demo(10);
		dobj = null;
		
		System.gc();
		System.out.println("End of main");
	}
}