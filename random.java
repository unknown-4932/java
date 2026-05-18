//Write a program that generates a random number between 1 and 100. The user will then be asked to guess the number. The program should give hints (too high, too low) until the user guesses the correct number. The number of guesses should be tracked and printed when the user guesses correctly.

//Output:

import java.util.Scanner;
import java.util.Random;

class Guess
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
       	 	int randomNumber = random.nextInt(100); 
       	 	//System.out.println("Random number is :"+randomNumber);
       	 	
       	 	int n;
       	 	int count=0;
       	 	do{
       	 		System.out.println("Guess the number: ");
       	 		n=sc.nextInt();
       	 		
       	 		if(n>randomNumber)
       	 		{
       	 			System.out.println("Its high number ");
       	 		}
       	 		else if(n<randomNumber)
       	 		{
       	 			System.out.println("Its low number ");
       	 		}
       	 		count++;	
       	 	
       	 	}
       	 	while(n!=randomNumber);
       	 	
       	 	if(n==randomNumber)
       	 	{
       	 		System.out.println("Yes you guessed number in " + count + " attempts");
       	 	}
       	 }
}










