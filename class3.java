import java.util.Scanner;

class Employee {
    private static int nextId = 1;

    private int id;
    private String name;
    private double salary;
    private int exp;
    private String dept;

    Employee() {
        id = nextId++;
        name = null;
        salary = 0.0;
        exp = 0;
        dept = null;
    }

    Employee(String n, double s, int e, String d) {
        id = nextId++;
        name = n;
        if (s > 0)
            salary = s;
        else
            salary = 0.0;
        exp = e;
        dept = d;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double s) {
        if (s > 0)
            salary = s;
        else
            salary = 0.0;
    }

    int getExp() {
        return exp;
    }

    void setExp(int e) {
        exp = e;
    }

    String getDept() {
        return dept;
    }

    void setDept(String d) {
        dept = d;
    }

    double getYearlySalary() {
        return salary * 12;
    }

    void applyRaise() {
        salary = salary + (salary * 0.10);
    }

    void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + exp);
        System.out.println("Department: " + dept);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, Department;
        double salary;
        int experience;

        System.out.println("Enter details for Employee 1:");
        name = scanner.nextLine();
        salary = scanner.nextDouble();
        experience = scanner.nextInt();
        scanner.nextLine();
        Department = scanner.nextLine();

        Employee employee1 = new Employee(name, salary, experience, Department);

        System.out.println("Enter details for Employee 2:");
        name = scanner.nextLine();
        salary = scanner.nextDouble();
        experience = scanner.nextInt();
        scanner.nextLine();
        Department = scanner.nextLine();

        Employee employee2 = new Employee(name, salary, experience, Department);

        System.out.println("\nYearly Salary of Employee 1 before raise: " + employee1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2 before raise: " + employee2.getYearlySalary());

        employee1.applyRaise();
        employee2.applyRaise();

        System.out.println("\nYearly Salary of Employee 1 after 10% raise: " + employee1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2 after 10% raise: " + employee2.getYearlySalary());

        System.out.println("\nEmployee 1 Information:");
        employee1.displayEmployeeInfo();

        System.out.println("Employee 2 Information:");
        employee2.displayEmployeeInfo();

        scanner.close();
    }
}