package Patterns.MirrorImages;

import java.util.Scanner;

public class MirrorImage1 {
    public static void main(String[] args) {
        /*
        Print :
               *
             * *
           * * *
         * * * *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int spaces = 0; spaces < row - i; spaces ++){
                System.out.print(' ');
            }
            for (int stars = 0; stars <= i; stars ++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
