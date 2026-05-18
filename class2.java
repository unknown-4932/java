import java.util.Scanner;

class Rational {
    int n;
    int d;

    Rational() {
        n = 0;
        d = 1;
    }

    Rational(int num, int den) {
        n = num;
        if (den == 0) {
            System.out.println("Denominator cannot be zero. Setting it to 1.");
            d = 1;
        } else {
            d = den;
        }
    }

    void display() {
        System.out.println(n + "/" + d);
    }

    static Rational add(Rational a, Rational b) {
        int num = (a.n * b.d) + (b.n * a.d);
        int den = a.d * b.d;
        return new Rational(num, den);
    }

    static Rational sub(Rational a, Rational b) {
        int num = (a.n * b.d) - (b.n * a.d);
        int den = a.d * b.d;
        return new Rational(num, den);
    }

    static Rational mult(Rational a, Rational b) {
        int num = a.n * b.n;
        int den = a.d * b.d;
        return new Rational(num, den);
    }

    static Rational div(Rational a, Rational b) {
        int num = a.n * b.d;
        int den = a.d * b.n;
        return new Rational(num, den);
    }
}

public class TestRational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, den1;
        int num2, den2;

        System.out.println("Enter numerator and denominator for the first rational number:");
        num1 = scanner.nextInt();
        den1 = scanner.nextInt();
        Rational r1 = new Rational(num1, den1);

        System.out.println("Enter numerator and denominator for the second rational number:");
        num2 = scanner.nextInt();
        den2 = scanner.nextInt();
        Rational r2 = new Rational(num2, den2);

        System.out.print("First Rational Number: ");
        r1.display();

        System.out.print("Second Rational Number: ");
        r2.display();

        Rational addResult = Rational.add(r1, r2);
        System.out.print("Addition of the two rational numbers: ");
        addResult.display();

        Rational subResult = Rational.sub(r1, r2);
        System.out.print("Subtraction of the two rational numbers: ");
        subResult.display();

        Rational multResult = Rational.mult(r1, r2);
        System.out.print("Multiplication of the two rational numbers: ");
        multResult.display();

        Rational divResult = Rational.div(r1, r2);
        System.out.print("Division of the two rational numbers: ");
        divResult.display();

        scanner.close();
    }
}