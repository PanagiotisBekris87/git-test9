package gr.aueb.cf.testgit;

public class PowApp {

    public static void main(String[] args) {

    }

    public static int calculatePower(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }
}
