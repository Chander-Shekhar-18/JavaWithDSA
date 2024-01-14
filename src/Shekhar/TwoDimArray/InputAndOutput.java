package Shekhar.TwoDimArray;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

//Taking input of an array
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the " + i + j + " : ");
                int element = sc.nextInt();
                arr[i][j] = element;
            }

//Printing 2d Array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//Printing array by collection framework
        for (int i = 0; i < rows; i++)
            System.out.println(Arrays.toString(arr[i]));

    }
}
