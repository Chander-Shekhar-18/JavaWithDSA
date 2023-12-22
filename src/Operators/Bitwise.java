package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        int bitwiseAnd = a & b;
        System.out.println("The output of bitwise AND is : " + bitwiseAnd);

        int bitwiseOr = a | b;
        System.out.println("The output of bitwise OR is : " + bitwiseOr);

        int bitwiseXor = a ^ b;
        System.out.println("The output of bitwise XOR is : " + bitwiseXor);

        int bitwiseNot = ~a;
        System.out.println("The output of bitwise NOt is : " + bitwiseNot);

        int leftShift = a << 1;
        System.out.println("The output of left shift is : " + leftShift);

        int rightShift = a >> 1;
        System.out.println("The output of right shift is : " + rightShift);
    }
}
