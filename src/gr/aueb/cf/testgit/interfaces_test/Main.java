package gr.aueb.cf.testgit.interfaces_test;

public class Main {

    public static void main(String[] args) {
        ISimpleMath couple1 = new TwoNumbersMath(8,5);
        ISimpleMath couple2 = new TwoNumbersMath(9,3);
        ISimpleMath couple3 = new TwoNumbersMath(12,7);
        ISimpleMath couple4 = new TwoNumbersMath(8,0);

        doMath(couple1);
        System.out.println();
        doMath(couple2);
        System.out.println();
        doMath(couple3);
        System.out.println();
        doMath(couple4);
    }

    public static void doMath(ISimpleMath iSimpleMath) {
        System.out.println("Add: " + iSimpleMath.add());
        System.out.println("Sub: " + iSimpleMath.sub());
        System.out.println("Mul: " + iSimpleMath.multiply());
        System.out.println("Div: " + iSimpleMath.divide());

    }
}
