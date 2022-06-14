class practice
{
    public static void main(String[] args) 
    {
        printX(5);
    }
    
    public static void printX(int n)
	{
	    static int i = 0;
	    if(i == n)
	    {
	        return;
	    }
		
	    System.out.println("Jay Ganesh...");
	    i++;
	    printX(n);
	    
	}
}