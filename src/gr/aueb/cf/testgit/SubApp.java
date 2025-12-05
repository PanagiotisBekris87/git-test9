package gr.aueb.cf.testgit;

public class SubApp {

    public static void main(String[] args) {

        int a = 6;
        int b = 3;
        int result = 0;

        result = subtract(a, b);

        System.out.println("result = " + result);
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
