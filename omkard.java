import java.util.Scanner;
import java.util.Random;

class guess
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
       	 	int randomNumber = random.nextInt(100);
		
		int n;
	do
	{
		System.out.println("Guess the number: ");
		n=sc.nextInt();
		if(n>randomNumber)
		{
			System.out.println("Too high try again!!!");
		}
		else if(n<randomNumber)
		{
			System.out.println("Too low try again!!!");
		}
	}while(n!=randomNumber);
	}
}		
