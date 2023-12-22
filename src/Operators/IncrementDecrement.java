package Operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int count = 10;
        int res1 = ++count;
        int res2 = count++;

        System.out.println("The pre incremented value of count is : " + res1);
        System.out.println("The post incremented value of count is : " + res2);

        int res3 = --count;
        int res4 = count--;

        System.out.println("The pre decremented value of count is : " + res3);
        System.out.println("The post decremented value of count is : " + res4);

        System.out.println();

        int a = 60, b = 80;
        if (a++ > 60 && b++ > 80) {
            System.out.println("Inside is block");
        } else {
            System.out.println("Inside else block");
        }
        System.out.println("a : " + a + " b : " + b);
    }
}
