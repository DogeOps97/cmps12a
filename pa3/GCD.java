import java.util.Scanner

class GCD{
	public static main void ( String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// initialize variable
		int a, b;

           System.out.print("Enter two positive integers: ");
		
	}
	
	static int get_int()
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			if (sc.hasNextInt())
			{
				temp = sc.nextInt();
				if (Integer.signum(temp) > 0)
				{
					return temp;
				}
			}	
			else sc.next();
			
			System.out.print("Please enter a positive integer : ");
			
		}
		
	}
	
	static int GCD_algorithm(int a, int b)
	{
		int temp;
		if (a < b)
		{
			
			temp = a;
			a = b;
			b = a;
		}
		
		
		
	}
	
	
}


