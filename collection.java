import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // ==============================
        // 1) LIST OPERATIONS
        // ==============================
        System.out.println("----- LIST OPERATIONS -----");

        List<String> students = new ArrayList<>();

        students.add("Omkar");
        students.add("Amit");
        students.add("Sneha");
        students.add("Riya");
        students.add("Rahul");

        System.out.println("Student List:");
        for(String name : students) {
            System.out.println(name);
        }

        students.add("Priya");
        System.out.println("\nAfter Adding Priya:");
        System.out.println(students);

        students.remove("Amit");
        System.out.println("\nAfter Removing Amit:");
        System.out.println(students);


        // ==============================
        // 2) QUEUE OPERATIONS
        // ==============================
        System.out.println("\n----- QUEUE OPERATIONS -----");

        Queue<String> queue = new LinkedList<>();

        queue.add("Omkar");
        queue.add("Amit");
        queue.add("Sneha");
        queue.add("Riya");
        queue.add("Rahul");

        System.out.println("Initial Queue:");
        System.out.println(queue);

        queue.poll();
        queue.poll();

        System.out.println("\nAfter Serving 2 People:");
        System.out.println(queue);


        // ==============================
        // 3) SET OPERATIONS
        // ==============================
        System.out.println("\n----- SET OPERATIONS -----");

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

        System.out.println("Unique Numbers:");
        System.out.println(numbers);
    }
}
