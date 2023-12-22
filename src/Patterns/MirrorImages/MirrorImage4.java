package Patterns.MirrorImages;

import java.util.Scanner;

public class MirrorImage4 {
    /*
        print :
        1 1 1 1
        2 2 2
        3 3
        4
        */
    public static void main(String[] args) {
        int rows = 4;

        int n = 1;

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(n);
            }
            System.out.println();
            n++;
        }
    }
}


