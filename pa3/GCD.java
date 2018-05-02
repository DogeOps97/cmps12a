import java.util.Scanner;

class GCD{
	public static void main( String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// initialize variable
		int a = 0, b = 0, answer;
		
		// get input
		
		System.out.print("Enter a positive integer : ");
		a = get_int();
		
		System.out.print("Enter another positive integer : ");
		b = get_int();
		
		answer = GCD_algorithm(a, b);
		
		System.out.println(a + " " + b + " " + answer);
		
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
		
		while (b != 0)
		{
			temp = b;
			b = a % b;
			a = b;
		}
		
		return a;
	}
	
	
}


