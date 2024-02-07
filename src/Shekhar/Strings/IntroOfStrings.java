package Shekhar.Strings;

public class IntroOfStrings {
    public static void main(String[] args) {
        String name = "Chander";
        System.out.println("My name is : " + name);

//        Example of string immutability
        String a = "Original pointer";
        System.out.println("This is " + a);
        a = "Changed pointer";
        System.out.println("This is " + a);

//        String comparison
        String check1 = "Check";
        String check2 = "Check";
        System.out.println("This comparison is made by comparator :  " + (check1 == check2));

//        Creating different objects of same name in heap memory but outside the string pool
        String check3 = new String("Chander");
        String check4 = new String("Chander");
        System.out.println("The comparison of same value but different reference variable is made by method : " + check3.equals(check4));
        System.out.println("The comparison of same value but different reference variable is made by comparator : " + (check3 == check4));
        

    }
}
