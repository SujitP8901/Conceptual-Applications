import java.lang.*;
import java.io.*;

class Input1
{
	public static void main(String a[]) throws IOException
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader boj = new BufferedReader(iobj);
		
		System.out.println("Enter Your Name : ");
		String name = boj.readLine();
		
		System.out.println("Your Name is : " + name);
	}
}