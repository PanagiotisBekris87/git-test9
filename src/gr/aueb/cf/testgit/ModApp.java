package gr.aueb.cf.testgit;

public class ModApp {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int modulo = 0;

        modulo = mod(num1, num2);

        System.out.println("modulo = " + modulo);
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
