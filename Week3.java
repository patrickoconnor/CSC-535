
public class Week3 
{
	//Start collection of methods that will find and print vowels, consonants, digits, and expressions.
	public static void main(String[] args)
	{
		// set assignments for what is being looked into and to what method will process it.
		
		// String used for the find vowels, consonants, digits, and expressions methods.
		String find1 = "In the code, looking for all kinds of stuff.";
		String find2 = "Still in the code, now maybe looking for foxes or walruses as well. Your guess is as good as mine.";
		String find3 = "Now, lets look for all the digits. Did they get used up in binary 0's or 1's or 3 of 9 barcodes? Who knows? What I do know is 6 is afraid of 7, because 7, 8 9! Which now leaves us to search for 2, 3, 4, and 5.";
		findvowels(find1);
		findconsonants(find2);
		finddigits(find3);
		findexpression(find3);
		String Convert1 = "125";
		String Convert2 = "125+7";
		String Convert3 = "125+7-2";
		String Convert4 = "125*2";
		String Convert5 = "10/3";
		StringToInt(Convert1);
		StringToInt(Convert2);
		StringToInt(Convert3);
		StringToInt(Convert4);
		StringToInt(Convert5);
	}
	// This is my method to find vowels in a String of characters and prints to the screen.
	static void findvowels(String findv)
	{
		for(int index =0;index < findv.length(); index++)
		{
			char vowel = findv.charAt(index);
			if("aeiouAEIOU".indexOf(vowel) != -1)
			//if ((vowel == 'a') || (vowel == 'e') || (vowel == 'i') || (vowel == 'o') || (vowel == 'u'))
			{
				System.out.println(vowel);
			}
		}
	}
	// This is my method to find consonants in a String of characters and prints to the screen.
	static void findconsonants(String findc)
	{
		for(int index =0;index < findc.length(); index++)
		{
			char consonant = findc.charAt(index);
			if("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(consonant) != -1)
			{
				System.out.println(consonant);
			}
		}
	}
	// This is my method to find digits in a String of characters and prints to the screen.
	static void finddigits(String findd)
	{
		for(int index =0;index < findd.length(); index++)
		{
			char digit = findd.charAt(index);
			if("1234567890".indexOf(digit) != -1)
			{
				System.out.println(digit);
			}
		}
	}
	// This is my method to find anything else in a String of characters and prints to the screen.
	static void findexpression(String finde)
	{
		for(int index =0;index < finde.length(); index++)
		{
			char expression = finde.charAt(index);
			if(",.?!'".indexOf(expression) != -1)
			{
				System.out.println(expression);
			}
		}
	}
	// This is my attempt at a method to convert a String of characters into an Integer and prints a solution to the screen.
	static int StringToInt(String stuff)
	{
    	int i = 0;
    	int j = 0;
    	while( i < stuff.length())
    	{
    		j *= 10;
    		j += stuff.charAt(i++) - '0';
    	}
		System.out.println(j);
		return j;
	}
}
