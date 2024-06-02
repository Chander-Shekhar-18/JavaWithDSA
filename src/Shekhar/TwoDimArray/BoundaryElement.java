package Shekhar.TwoDimArray;

import java.util.ArrayList;
import java.util.Arrays;

public class BoundaryElement {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13, 14, 15, 16}};
        ArrayList<Integer> ans = printBoundary(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    
    public static ArrayList<Integer> printBoundary(int[][] arr){

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1){
                    list.add(arr[i][j]);
                }
            }
            System.out.println();
        }
        
        return list;
    }
}