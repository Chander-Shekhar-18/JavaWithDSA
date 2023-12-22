package Patterns.NumberPatterns;

import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String[] args) {
        /*
        Print :
        1
        2 3
        4 5 6
        7 8 9 10
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }
    }
}
