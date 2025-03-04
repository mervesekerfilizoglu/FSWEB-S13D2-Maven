package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));


        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }


    public static boolean isPalindrome(int number) {
       /* if(number<0) {
            return false; // Sayı negatif ise palindrome değil.
        }*/
        int orgnumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;  // Son basamak
            reversedNumber = reversedNumber * 10 + digit;  // Basamağı tersine ekle
            number = number / 10;
        }
        // Ters çevrilmiş sayı ile orijinal sayıyı karşılaştır
        return orgnumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Sayı negatif ise PerfectNumber değil.
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) { // Sayının bölenlerini bul ve toplamını hesapla
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;// Bölenlerin toplamı sayıya eşitse true, değilse false
    }

    public static String numberToWords(int number) {
        if (number <= 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "zero";
        }
        String numberInWords = "";
        while (number > 0) {
            int digit = number % 10;  // Son basamağı al
            numberInWords = getWordForDigit(digit) + " " + numberInWords;  // Rakamı yazıya çevir
            number /= 10;  // Sayıyı küçült
        }
        return numberInWords.trim();  // Başındaki boşluğu kaldır
    }

    // Rakamlara karşılık gelen kelimeler
    public static String getWordForDigit(int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "";
        }
    }
}