package Shekhar.Patterns.CharPatterns;

import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args) {
        /*
        Print :
        A
        B B
        C C C
        D D D D
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
