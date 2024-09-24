package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class Practice6 {
    /**
     Tìm vị trí của các số lặp lại trong mảng:
     */
    public void findIndexRepeating (int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer mapValue = map.get(array[i]);

            if (mapValue == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], 2);
            }
        }

        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() == 2) {
                System.out.println(mapEntry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,1,3};
        Practice6 practice6 = new Practice6();
        practice6.findIndexRepeating(arr);
    }
}
