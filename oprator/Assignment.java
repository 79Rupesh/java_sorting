import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner Rupesh = new Scanner(System.in);
        System.out.print("Ente your number : ");
        int num = Rupesh.nextInt();

        System.out.println("After +=5 : " + (num += 5));
        System.out.println("After -=2 : " + (num -= 2));
        System.out.println("After *=3 : " + (num *= 3));
        System.out.println("After /=5 : " + (num /= 5));

        System.out.println("After %=5 : " + (num %= 5));
        Rupesh.close();
    }

}
