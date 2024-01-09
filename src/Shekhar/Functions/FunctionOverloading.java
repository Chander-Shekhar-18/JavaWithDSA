package Shekhar.Functions;

public class FunctionOverloading {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(sum(a, b));
        System.out.println(sum(a));
        System.out.println(sum(1.5, 10.5));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a) {
        return a + 1;
    }

    private static double sum(double a, double b) {
        return a + b;
    }
}
