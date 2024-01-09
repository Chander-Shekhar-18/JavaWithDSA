package Shekhar.Patterns.MirrorImages;

import java.util.Scanner;

public class MirrorImage2 {
     /*
        print :
              1
            1 2
          1 2 3
        1 2 3 4
        */
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of rows :");
         int rows = sc.nextInt();

         for (int i = 0; i < rows; i ++) {
             for (int spaces = 0; spaces < rows - i; spaces++) {
                 System.out.print(' ');
             }

             for (int nums = 0; nums <= i; nums++) {
                 System.out.print(nums + 1);
             }
             System.out.println();
         }
     }
}
