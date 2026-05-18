import java.util.Scanner;

class assign 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
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

		System.out.println("Jagged Array Elements are:");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
