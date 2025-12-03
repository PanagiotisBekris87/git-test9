package gr.aueb.cf.testgit;

import java.util.Scanner;

public class DivApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.println("Please insert nominator and denominator.");
            System.out.println("Denominator cannot be zero.");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        } while (num2 != 0);

        System.out.printf("Division result of %d and %d is: %d\n", num1, num2, divide(num1, num2));
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
