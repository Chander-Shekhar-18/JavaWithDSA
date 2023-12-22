package Functions;

import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("The addition of two numbers are : " + addition(a, b));
    }

    public static int addition (int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
