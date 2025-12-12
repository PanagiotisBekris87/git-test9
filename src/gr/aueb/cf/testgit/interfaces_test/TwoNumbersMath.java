package gr.aueb.cf.testgit.interfaces_test;

public class TwoNumbersMath implements ISimpleMath{

    private int x;
    private int y;

    public TwoNumbersMath() {
    }

    public TwoNumbersMath(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int add() {
        return x + y;
    }

    @Override
    public double divide() {
        return (double) x / (double) y;
    }

    @Override
    public int multiply() {
        return x * y;
    }

    @Override
    public int sub() {
        return  x - y;
    }
}
