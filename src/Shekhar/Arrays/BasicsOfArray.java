package Shekhar.Arrays;

public class BasicsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //adding elements in an array
        arr[0] = 5;
        arr[4] = 3;
        System.out.println("The 0th element in the given array is : " + arr[0]);
        System.out.println("The 4th element in the given array is : " + arr[4]);

        //This will throw array index of bound exception as negative indexing in not allowed in java
//        arr[-1] = 6;
//        System.out.println(arr[-1]);

        //This will also throw array index of bound exception because array size is 0 to 9
//        arr[10] = 10;
//        System.out.println(arr[10]);

        //By default, values of an array are initialized as 0
        System.out.println("The 1st element in the given array is : " + arr[1]);

        //Char array
        char[] chArr = new char[5];
        chArr[1] = 'a';
        System.out.println("The 1st element in char array is : " + chArr[1]);

        //By default, values of char array is initialized as null and ASCII value of null will be printed printed
        System.out.println("The 0th element in char array is : " + chArr[0]);

        //double array
        double[] dArr = new double[5];
        //By default, values of a double array are initialized as 0.0
        System.out.println("The 0th element of a double arrays is : " + dArr[0]);

        //long array
        long[] lArr = new long[5];
        //By default, values of a long array are initialized as 0
        System.out.println("The 0th element of a long array is : " + lArr[0]);
    }
}
