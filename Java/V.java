import java.lang.*;
import java.util.*;

class V
{
	public static void main(String arg[])
	{
		Vector <Integer> obj = new Vector<Integer>(12);
		int i = 0, no = 0, iCnt = 0;
		
		System.out.println("Capacity of vector is : " + obj.capacity());
		System.out.println("Size of vector is : " + obj.size());
		
		obj.add(11);
		obj.add(20);
		obj.add(31);
		obj.add(101);
		obj.add(110);
		obj.add(111);
		
		System.out.println("Capacity of vector is : " + obj.capacity());
		System.out.println("Size of vector is : " + obj.size());
		
		for(i = 0; i < obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
		
		for(i = 0; i < obj.size(); i++)
		{
			no = obj.get(i);
			if(no % 2 == 0)
			{
				iCnt++;
			}
		}
		System.out.println("Even Elements are : " + iCnt);
		Iterator iobj = obj.iterator();
		
		System.out.println("Using Iterator");
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}
		
		obj.clear();
	}
}