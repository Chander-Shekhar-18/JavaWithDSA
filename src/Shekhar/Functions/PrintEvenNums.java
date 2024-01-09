package Shekhar.Functions;

public class PrintEvenNums {
    public static void main(String[] args) {
        evenNums(1,100);
    }
    public static void evenNums(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
