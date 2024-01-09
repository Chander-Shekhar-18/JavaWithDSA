package Shekhar.Patterns.MirrorImages;

import java.util.Scanner;

public class MirrorImage5 {
    /*
    print :
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
  */
//TODO : complete the code

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = rows; k > 0 ; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
