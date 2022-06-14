import java.lang.*;

class Demo extends Thread
{
	public void run()			// Running State
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Value of i : " + i + " " + Thread.currentThread().getName());
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception obj)
			{}
		}
	}
}

class Mythread5 
{
	public static void main(String arg[]) throws Exception
	{
		Demo obj1 = new Demo();
		Thread t1 = new Thread(obj1, "First");		// New State
		
		Demo obj2 = new Demo();		
		Thread t2 = new Thread(obj2, "Second");		// New State
		
		t1.start();				// Runnable State
		
		t1.join();
		
		t2.start();				// Runnable State
		
		
		// Dead State
	}
}