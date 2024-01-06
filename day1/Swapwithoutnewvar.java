package day1;

public class Swapwithoutnewvar {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("Before swapping: numner-1 = "+a+"; number-2 = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: numner-1 = "+a+"; number-2 = "+b);

    }
}
