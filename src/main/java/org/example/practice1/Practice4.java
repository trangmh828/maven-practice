package org.example.practice1;

public class Practice4 {
    /**
     * Tìm sô lớn nhất và lớn thứ 2 của một mảng
     */
    public void findMaxAndSecond (int[] arr) {
        int length = arr.length;
        int max = arr[0];
        int secondMax = arr[0];

        if (length < 2) {
            System.out.println("Mang khong hop le. Can phai co tu 2 so tro len");
            return;
        }

        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }


        if (secondMax == max) {
            System.out.println("khong co gia tri lon thu hai");
        } else {
            System.out.println("Gia tri lon thu hai la: " + secondMax);
        }
    }

    public static void main(String[] args) {
        Practice4 p4 = new Practice4();
        int[] arr = {1, 1};
        p4.findMaxAndSecond(arr);
    }
}
