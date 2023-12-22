package Functions;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        /*
         * Syntax of function :
         * <access_modifier> <return_type> <method_name> (list of parameters) {
         *   //body of a function
         * }
         *
         * access modifiers : public, private, protected, default
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial : ");
        int n = sc.nextInt();
        //Calling of function
        int fact = factorial(n);
        System.out.print("Factorial " + fact);
    }

    // function of factorial
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}