package Patterns.CharPatterns;

import java.util.Scanner;

public class CharPattern1 {
    public static void main(String[] args) {
        /*
        Print :
        A B C D
        A B C D
        A B C D
        A B C D
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            ch = 'A';
            for (int j = 1; j <= n; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
