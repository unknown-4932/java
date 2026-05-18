import java.util.Scanner;

class assign 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("LETS CREATE THE JAGGED ARRAY FIRST");
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		
		int[][] arr = new int[rows][];

		for (int i = 0; i < rows; i++) 
		{
			System.out.print("Enter number of columns for row " + (i + 1) + ": ");
			int cols = sc.nextInt();
			
			arr[i] = new int[cols];
			System.out.println("Enter elements for row " + (i + 1) + ":");
			
			for (int j = 0; j < cols; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Jagged array created succesfully....");
		System.out.println("Tell the operation to be performed on above created jagged array");
		
		int ch;
		do{
			System.out.println("\n1>Display elements\n2>Find sum of each row\n3>Find largest element in each row\n4>Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Jagged Array Elements are:");
				for (int i = 0; i < rows; i++)
				{
					for (int j = 0; j < arr[i].length; j++) 
					{
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			
			case 2:
				for (int i = 0; i < arr.length; i++) 
				{
		                    int sum = 0;
		                    for (int j = 0; j < arr[i].length; j++)
		                    {
		                        sum += arr[i][j];
		                    }
                            		System.out.println("Sum of row " + (i + 1) + ": " + sum);
                        	}
                        	break;
                        	
                        case 3:
                        	for (int i = 0; i < arr.length; i++) 
                        	{
					if (arr[i].length > 0) 
					{
					    int max = arr[i][0]; 
					    for (int j = 1; j < arr[i].length; j++) 
					    {
						if (arr[i][j] > max) 
						{
						    max = arr[i][j]; 
						}
					    }
					    System.out.println("Largest element in row " + (i + 1) + ": " + max);
					} 
					else 
					{
					    System.out.println("Row " + (i + 1) + " is empty.");
					}
			    	}
			   	break;
			}
				
		}while(ch!=4);

	}
}

