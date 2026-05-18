import java.util.Scanner;

class Moperations
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int choice;


do
{
  System.out.println("1.Check Number Even or odd");
  System.out.println("2.print multiplication table for given number");
  System.out.println("3.check the number prime or not");
  System.out.println("4.check the number is perfect or not");
  System.out.println("5.Exit");
  System.out.println("Select the operation");
  
   
   choice=sc.nextInt();
   
switch (choice)
{
  case 1:
     System.out.println("Enter number :");
     int num=sc.nextInt();
     if(num%2==0)
     {
       System.out.println("number is even");
     }
     else
     {
       System.out.println("number is odd");
     }
     break;
   
   case 2:
      System.out.println("Enter number :");
      int num1=sc.nextInt();
      System.out.println("Table" + num1);
      for(int i=1 ;i <=10; i++)
      {
       System.out.println(num1 + "*" + i + "="+(num1*i));
      }
      break;
      
    case 3:
      System.out.println("Enter number :");
      int num2=sc.nextInt();
      int count = 0;
      for(int i=1; i < num2; i++)
    {
      if (num2 % i == 0)
      count ++;
    }
    if (count == 2)
    {
      System.out.println(num2+" is a Prime number");
    }
    else
   {
    System.out.println(num2+" is not Prime number");
   }
   break;
   
   case 4:
     System.out.println("Enter number :");
      int num3=sc.nextInt();
     
       int sum = 0;
      for(int i=1; i < num3; i++) 
    {
       if (num3 % i == 0)
       sum += 1;
    }
     if (sum == num3)
   {
      System.out.println(num3 + " is a Prefect number");
   }
    else
   {
     System.out.println(num3 + "is not Prefect number");
   }
   break;
  default:
   System.out.println("Invalid Choice");
   }
   }

  while(choice!=5);

}
}


     
     
        
    
