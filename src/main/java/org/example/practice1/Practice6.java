package org.example.practice1;

import java.util.HashMap;
import java.util.Map;

public class Practice6 {
    /**
     *
     Tìm vị trí của các số lặp lại trong mảng
     */
    public static void findIndexOfRepeatedNumber(int arr[]) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer mapValue = maps.get(arr[i]);
            if (mapValue == null) {
                maps.put(arr[i], i+2);
            } else {
                maps.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
            if (map.getValue() == 1) {
                System.out.print(map.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,1};
        findIndexOfRepeatedNumber(arr);
    }
}
