package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        scanner.close();
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String text1) {
        boolean isPalindr = true;
        text1 = text1.toUpperCase();
        StringBuilder text2 = new StringBuilder(text1).reverse();
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                isPalindr = false;
            }
        }
        return isPalindr;
    }
}