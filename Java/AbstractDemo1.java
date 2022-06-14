import java.lang.*;

abstract class Demo
{
	public int i, j;
	
	public Demo()
	{
		System.out.println("Demo Constructor");
	}
	
	public void fun()
	{
		System.out.println("Demo fun");
	}
	
	public abstract void gun();
}

class Hello extends Demo
{	
	public int x, y;
	
	public Hello()
	{
		System.out.println("Hello Constructor");
	}
	
	public void sun()
	{
		System.out.println("Hello sun");
	}
	
	public void gun()
	{
		System.out.println("Hello gun");
	}
}

class AbstractDemo1
{
	public static void main(String arg[])
	{
		Demo dobj;
		dobj = new Demo();
		
		Hello hobj = new Hello();

		hobj.fun();
		hobj.gun();
		hobj.sun();
		
	}
	
}