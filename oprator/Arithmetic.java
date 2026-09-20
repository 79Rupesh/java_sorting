import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner Rupesh = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int a = Rupesh.nextInt();

        System.out.print("Enter your second number: ");
        int b = Rupesh.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division and Modulus not possible (second number is 0)");
        }

        Rupesh.close();
    }
}