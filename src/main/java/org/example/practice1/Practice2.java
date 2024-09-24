package org.example.practice1;

public class Practice2 {
    /**
     *
     Lấy 4 ký tự cuối cùng của một chuỗi cho trước
     */
    public void getFourLastLetters (String string) {
        int size = string.length();
        int counter = size - 4;
        for (int i = counter; i < size; i++) {
            System.out.print(string.charAt(i));
        }
    }

    public void getFirstThreeLetters (String string) {
        for (int i = 0; i < 3; i++) {
            System.out.print(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        String string = "ps5asdkjhasfjitest";
        Practice2 p2 = new Practice2();
        p2.getFourLastLetters(string);
        System.out.println();
        p2.getFirstThreeLetters(string);
    }
}
