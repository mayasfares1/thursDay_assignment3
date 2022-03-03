import java.util.Arrays;
import java.util.Random;

class Task4c 
{


public static void main(String args[])
{

int[] intArray = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
		
System.out.println("Random number from the array = "+intArray[new Random().nextInt(intArray.length)]);
}

}

