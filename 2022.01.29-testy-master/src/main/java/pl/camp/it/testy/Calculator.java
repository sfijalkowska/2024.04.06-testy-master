package pl.camp.it.testy;

public class Calculator {

    private int operations = 0;

    public int add(int a, int b) {
        this.operations++;
        /*int sum = a+b;*/
        /*if((a > 0 && b > 0 && sum < 0) || (a < 0 && b < 0 && sum >= 0)) {
            throw new IllegalArgumentException();
        }*/
        if(a/2 + b/2 > Integer.MAX_VALUE/2) {
            throw new IllegalArgumentException();
        }
        return a+b;
    }

    public int diff(int a, int b) {
        this.operations++;
        return a-b;
    }

    public int multiply(int a, int b) {
        this.operations++;
        return a*b;
    }

    public double divide(int a, int b) {
        this.operations++;
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return ((double) a) / ((double) b);
    }

    public int getOperations() {
        return operations;
    }

    public void setOperations(int operations) {
        this.operations = operations;
    }
}
