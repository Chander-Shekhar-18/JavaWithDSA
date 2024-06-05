package Shekhar.Recursion;

public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Natural numbers from one to N : ");
        printOneToN(10);
        System.out.println();

        System.out.print("Natural numbers from N to One : ");
        printNtoOne(10);
    }
    static void printOneToN (int n) {
        if (n == 0) return;

        System.out.print(n + ", ");

        printOneToN(n - 1);
    }

    static void printNtoOne (int n) {
        if (n == 0) return;

        printNtoOne(n - 1);

        System.out.print(n + ", ");
    }
}
