
 //   Create a Java program that asks the user to enter a score (between 0 and 100) and then determines the ////grade //based on the following criteria:

   // 80-100: A
   // 65-79: B
   // 50-64: C
   // 40-49: D
   // Below 40: F
   
   
import java.util.Scanner;

class Guess
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Score: ");
		int score = sc.nextInt();
		
		if(score>100)
		{
			System.out.println("Enter a score between 0 to 100");
		}
		else if(score>=80)
		{
			System.out.println("You Have Succefully Scored A grade: ");
		}
		else if(score>=65 && score<80)
		{
			System.out.println("You Have Succefully Scored B grade: ");
		}
		else if(score>=50 && score<65) 
		{
			System.out.println("You Have Succefully Scored C grade: ");			
		}
		else if(score<=40 )
		{
			System.out.println("You Have Succefully Scored D grade: ");			
		}
	}
}
	
