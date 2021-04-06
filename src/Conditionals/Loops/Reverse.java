package Conditionals.Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        String rev = "";
        for (char x : arr) rev = x + rev;
        System.out.println(rev);
    }
}
