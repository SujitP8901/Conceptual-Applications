import java.lang.*;
import java.io.*;

class Input3
{
	public static void main(String a[]) throws IOException
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter String : ");
		String str  = bobj.readLine();
		
		System.out.println("Enter Integer : ");
		int no = Integer.parseInt(bobj.readLine());		
		
		System.out.println("Enter Float : ");
		float f = Float.parseFloat(bobj.readLine());
		
		System.out.println("Enter Double : ");
		double d = Double.parseDouble(bobj.readLine());
		
		System.out.println("Entered String " + str);
		System.out.println("Entered intger " + no);
		System.out.println("Entered float " + f);
		System.out.println("Entered double " + d);
		
	}
}