import java.util.*;

final class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}
}

/*								Not allowed
class Derived extends Base
{
	
}
*/

class Derived
{
	public Base bobj = new Base();		// Composition
	
	public void gun()
	{
		System.out.println("Derived gun");
	}
}

class Final4
{
	public static void main(String arg[])
	{
		Derived dobj = new Derived();
		dobj.bobj.fun();
		dobj.gun();
	}
}