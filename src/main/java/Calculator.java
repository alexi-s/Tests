public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

}
