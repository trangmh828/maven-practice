package org.example.practice2;

public class Practice5 {
    /**
     * Tìm độ lệch lớn nhất giữa 2 phần tử trong một mảng:
     */

    public int differenceBetweenMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,1,2,3,4,5};
        Practice5 practice5 = new Practice5();
        int b = practice5.differenceBetweenMinAndMax(arr);
        System.out.println(b);
    }
}
