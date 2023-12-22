package Patterns.NumberPatterns;

import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String[] args) {
        /*
        print ;
        1
        1 2
        1 2 3
        1 2 3 4
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
