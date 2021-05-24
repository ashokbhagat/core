package core.interview;

import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        reverseString("This is java");
        swapNumbers(10, 20);
    }

    private static void reverseString(String str) {
        System.out.println("*****String Reverse*******");
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--)
            System.out.print(chars[i]);
        System.out.println("");
    }


    public static void swapNumbers(int a, int b) {
        System.out.println("*****Swap number*******");
        System.out.println("a:" + a + ", b:" + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("a:" + a + ", b:" + b);
    }



}  
