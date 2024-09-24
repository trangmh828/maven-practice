package org.example.practice1;

public class Practice5 {
    /**
     * Tìm độ lệch lớn nhất giữa 2 phần tử trong một mảng:
     */

    public int differenceBetweenNumber(int[] arr) {
        int size = arr.length;
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,10};
        Practice5 p5 = new Practice5();
        int diff = p5.differenceBetweenNumber(arr);
        System.out.println("diff = " + diff);
    }
}
