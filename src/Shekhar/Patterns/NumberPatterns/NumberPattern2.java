package Shekhar.Patterns.NumberPatterns;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        /*
         print :
         1 1 1 1
         2 2 2 2
         3 3 3 3
         4 4 4 4
        * */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
