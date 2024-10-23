package org.example;

public class Exercise {

    public static void main(String[] args) {
        isEven(10);
        isEven(11);
        System.out.println(isLeapYear(2004));
        System.out.println(isVowels("a"));
        int[] arr = new int[10];
        assignNumber(arr, 25);
        print(arr);
    }

    /**
     * 1. Even or Odd
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * 2. Leap year
     */
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }

    /**
     * 3. Viet mot ham kiem tra 1 ky tu nhap vao co phai la nguyen am (vowels) hay khong?
     * return true => vowels
     * return false => not vowels
     * ueoai
     */
    public static boolean isVowels(String input) {
        if (input.length() != 1) throw new IllegalArgumentException("INPUT STRING LENGTH MUST BE EQUALS 1");
        return "ueoaiUEOAI".contains(input);
    }

    public static void assignNumber(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
    }

    public static void print(int arr[]) {
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
