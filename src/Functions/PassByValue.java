package Functions;

public class PassByValue {
    public static void main(String[] args) {
        int n = 11;
        a(n);
        System.out.println("Main : " + n);
        System.out.println("Updated value of n is : " + updatingOriginalValue(n));
    }

    //Pass By Value functions
    public static void a(int n) {
        b(n);
        System.out.println("Inside a : " + n);
        n++;
    }

    private static void b(int n) {
        c(n);
        System.out.println("Inside b : " + n);
        n++;
    }

    private static void c(int n) {
        System.out.println("Inside c : " + n);
        n++;
    }

    public static int updatingOriginalValue (int n) {
        n++;
        return n;
    }
}
