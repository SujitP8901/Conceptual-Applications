import java.lang.*;
import java.util.*;

class AL
{
	public static void main(String arg[])
	{
		ArrayList <String> obj = new ArrayList <String> ();
		
		obj.add("January");
		obj.add("Febuary");
		obj.add("March");
		obj.add("Marvellous");
		obj.add("April");
		obj.add(2, "New");
		obj.add("May");
		obj.add("Marvellous");
		obj.add("Marvellous");
		obj.add("Marvellous");
		
		int i = 0, iCnt = 0;
		System.out.println("Elements are : ");
		for(i = 0; i < obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
		
		String str;
		for(i = 0; i < obj.size(); i++)
		{
			str = obj.get(i);
			if(str.equals("Marvellous"))
			{
				iCnt++;
			}
		}
		
		System.out.println("Frequency of Marvellous : " + iCnt);
		
		System.out.println("ArrayList contains : " + obj);
		System.out.println("Size is : " + obj.size());
		
		if(obj.contains("April"))
		{
			System.out.println("Element is there");
		}
		
		System.out.println("Index of April : " + obj.indexOf("April"));
		
		System.out.println("Element At index 3 : " + obj.get(3));
		
		obj.remove(3);
		obj.remove("April");
		System.out.println("Updatesd ArrayList contains : " + obj);
		
		
		obj.clear();
		System.out.println("Updatesd ArrayList contains : " + obj);
	}
}