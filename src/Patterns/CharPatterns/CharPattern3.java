package Patterns.CharPatterns;

import java.util.Scanner;

public class CharPattern3 {
    public static void main(String[] args) {
        /*
        Print :
        A B C D
        B C D E
        C D E F
        D E F G
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
