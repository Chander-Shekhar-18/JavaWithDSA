package Patterns.NumberPatterns;

import java.util.Scanner;

public class SquarePattern {
    /*
       print :
       * * * *
       * * * *
       * * * *
       * * * *
       */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print('*');
            System.out.println();
        }

        System.out.println("Another solution for same pattern :");

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
