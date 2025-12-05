package gr.aueb.cf.testgit;

public class MulApp {

    static void main() {
        int a = 8;
        int b = 15;
        int result = 0;

        result = multiply(a, b);

        System.out.println("result = " + result);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
