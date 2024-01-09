package Shekhar.Patterns.NumberPatterns;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        /*
        print :

         4 3 2 1
         4 3 2 1
         4 3 2 1
         4 3 2 1

        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
