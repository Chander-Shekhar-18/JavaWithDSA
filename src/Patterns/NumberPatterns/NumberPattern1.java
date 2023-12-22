package Patterns.NumberPatterns;

import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {

        /*
        print :
         1 2 3 4
         1 2 3 4
         1 2 3 4
         1 2 3 4
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
