import java.lang.*;

class Demo
{
	public int Add(int iNo1, int iNo2)
	{
		return iNo1 + iNo2;
	}
	
	public int Add(int iNo1, int iNo2, int iNo3)
	{
		return iNo1 + iNo2 + iNo3;
	}
	
	public int Add(int iNo1, int iNo2, int iNo3, int iNo4)
	{
		return iNo1 + iNo2 + iNo3 + iNo4;
	}
}

class Overloading
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		
		int iRet = 0;
		
		iRet = obj.Add(10,20);
		System.out.println(iRet);
		
		iRet = obj.Add(10,20,30);
		System.out.println(iRet);
		
		iRet = obj.Add(10,20,30,40);
		System.out.println(iRet);
	}
}