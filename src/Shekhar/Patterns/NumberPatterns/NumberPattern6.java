package Shekhar.Patterns.NumberPatterns;

import java.util.Scanner;

public class NumberPattern6 {
    public static void main(String[] args) {
        /*
        Print :
        1
        2 3
        3 4 5
        4 5 6 7
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = i;
            for (int j = 1; j <= i; j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }
    }
}
