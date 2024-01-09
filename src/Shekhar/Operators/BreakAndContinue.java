package Shekhar.Operators;

public class BreakAndContinue {
    public static void main(String[] args) {

        //Break
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }

        System.out.println();
        //continue
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }

        System.out.println();
        //continue in nested for loop
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue; // Skips current iteration if i and j are equal
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
