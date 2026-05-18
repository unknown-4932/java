import java.util.Scanner;

interface Methods 
{
    void insert();
    void delete();
    void disp();
}

class LinearQueue implements Methods 
{
    int[] queue;
    int front, rear, size;
    Scanner sc = new Scanner(System.in);

    LinearQueue(int n) 
    {
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

   
    public void insert() 
    {
        if (rear == size - 1) 
        {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.print("Enter element to insert: ");
        int item = sc.nextInt();

        if (front == -1)
            front = 0;

        queue[++rear] = item;
        System.out.println("Inserted: " + item);
    }

    public void delete() 
    {
        if (front == -1 || front > rear) 
        {
            System.out.println("Queue Underflow");
            return;
        }

        int item = queue[front++];
        System.out.println("Deleted: " + item);
    }

    public void disp() 
    {
        if (front == -1 || front > rear) 
        {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) 
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

class TestQueue 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of queue: ");
        int n = sc.nextInt();

        LinearQueue q = new LinearQueue(n);

        int choice;
        do 
        {
            System.out.println("\n1. Insert\n2. Delete\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q.insert();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.disp();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
