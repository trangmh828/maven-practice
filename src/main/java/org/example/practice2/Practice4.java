package org.example.practice2;

public class Practice4 {
    /**
     * Tìm sô lớn nhất và lớn thứ 2 của một mảng
     */
    public static void findSecondLargestOfArray(int [] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];

        if (arr.length < 2){
            System.out.println("Mang khong hop le.");
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == largest) {
            System.out.println("Khong co so lon thu hai trong mang");
        } else {
            System.out.println("Second Larget = " + secondLargest + ", Largest = " + largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,4};
        findSecondLargestOfArray(arr);
    }
}
