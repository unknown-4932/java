import java.util.Scanner;

class Student 
{
   String name;
   int age;
   String grade;
 
   public Student(Scanner sc)
   {
       name=sc.next();
       age=sc.nextInt();
       grade=sc.next();
   }
   public Student(String n, int a, String g)
   {
        name = n;
        age = a;
        grade = g;
   }
   public void displayInfo()
   {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade); 
   }
}
public class StudentClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Rohit", 28, "A");
        Student s2 = new Student(sc);
       
        s1.displayInfo();
        s2.displayInfo();

        sc.close();
    }
}