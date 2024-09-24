package org.example.practice2;

public class Practice2 {
    /**
     * Lấy 4 ký tự cuối cùng của một chuỗi cho trước
     */
    public void getLastLetterOfCharacter (String str) {
        int size = str.length();
        int endFour = size - 4;
        String newString = "";
        for (int i = endFour; i < size; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Practice2 p2 = new Practice2();
        p2.getLastLetterOfCharacter("hellotest");
    }
}
