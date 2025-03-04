package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num = num / 10;
        }
        return originalNum == reversedNum;
}
    public static boolean isPerfectNumber(int num) {
        if(num <= 0){
            return false;
        }
        int dividedSum = 0;

        for (int i = 1; i <= num /2; i++) {
            if(num % i == 0) {
                dividedSum += i;
            }
        }
        return dividedSum == num;
    }

    public static String numberToWords(int num){
        if(num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        String word = "";
        while(num >0) {

            int digit = num % 10;
            word = words[digit] + " " + word;
            num /= 10;
        }
        return word.trim();
    }
}
