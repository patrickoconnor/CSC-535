
import java.util.Random;
public class Week4 
{
	//Start collection of methods that will fill an array with random numbers, sort the numbers and print what was imported and sorted.
	public static void main(String[] args)
	{
		int[] array = new int[6];
		Week4.fill(array);
		Week4.print(array);
		Week4.Sort(array);
		Week4.print(array);
	}
	
	//Method used to fill the array with random numbers.	
	static void fill(int[] array)
	{
		Random r = new Random();
		for(int i = 0; i < array.length; i++)
		{
			array[i] = r.nextInt(100);
		}
	}
	
	//Method used to print what is currently in the array.
	static void print(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	//Method used to print what is currently in the array.
	static int[] Sort(int array[])
	{
		//Check to see if there is one or more numbers in the array.
		if(array.length > 1)
		//If there is more than one number, begin the process of splitting the array in half.
		{
			int sparray1 = array.length/2;
			int sparray2 = sparray1;
				if((array.length % 2) == 1)
					sparray2 += 1;
		//Initialize the new split sub-arrays and copy for sorting.
			int split1[] = new int[sparray1];
			int split2[] = new int[sparray2];
			for(int i = 0; i < sparray1; i++)
				split1[i] = array[i];
			for(int i = sparray1; i < sparray1 + sparray2; i++)
				split2[i - sparray1] = array[i];
		//Send sub-arrays back through the methods to be sorted.
			split1 = Sort(split1);
			split2 = Sort(split2);
		//Compare the numbers in the sub-arrays and sort them from small to large.
			int i = 0, j = 0, k = 0;
			while(split1.length != j && split2.length != k)
			{
				if(split1[j] < split2[k])
				{
					array[i] = split1[j];
					i++;
					j++;
				}
				else
				{
					array[i] = split2[k];
					i++;
					k++;
				}
			}
		//Recombine the sorted sub-arrays and return the completed sorted array. 
			while(split1.length != j)
			{
				array[i] = split1[j];
				i++;
				j++;
			}
			while(split2.length != k)
			{
				array[i] = split2[k];
				i++;
				k++;
			}
		}
		return array;
	}

}
