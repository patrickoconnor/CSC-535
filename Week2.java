
public class Week2
{

	public static void main(String[] args)
	//Set assignments to store evenly and unevenly divided counts.
	{
		int count81 = 0;
		int count27 = 0;
		int count13 = 0;
		int count9 = 0;
		int othercount = 0;
		
		//Count to 1 million.
		for(int n = 1; n <= 1000000; n = n + 1)
		{
			// If it is evenly divisible by 81, store in the assigned counter and print to screen.
			if(n % 81 == 0)
				{
					System.out.println(n + " is divisible by 81.");
					count81 = count81 + 1;
				}
			// If it is evenly divisible by 27, store in the assigned counter and print to screen.
			if(n % 27 == 0)
				{
					System.out.println(n + " is divisible by 27.");
					count27 = count27 + 1;
				}
			// If it is evenly divisible by 13, store in the assigned counter and print to screen.
			if(n % 13 == 0)
				{
					System.out.println(n + " is divisible by 13.");
					count13 = count13 + 1;
				}
			// If it is evenly divisible by 9, store in the assigned counter and print to screen.
			if(n % 9 == 0)
				{
					System.out.println(n + " is divisible by 9.");
					count9 = count9 + 1;
				}
			// Number is not divisible by 9, 13, 27, or 81, store in the assigned counter and print to screen.
			else
			{
				System.out.println(n + " is not divisible by 9, 13, 27, or 81");
				othercount = othercount + 1;
			}
		}
		// Print count results to the screen.
		System.out.println("Total numbers that can be divided by 9: " + count9);
		System.out.println("Total numbers that can be divided by 13: " + count13);
		System.out.println("Total numbers that can be divided by 27: " + count27);
		System.out.println("Total numbers that can be divided by 81: " + count81);
		System.out.println("Total numbers that cannot be divided by 9, 13, 27, or 81: " + othercount);
	}

}
