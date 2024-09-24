package org.example.practice1;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
    /**
     * Tìm ký tự không lặp lại đầu tiên của một chuối
     */
    public static void main(String[] args) {
        String string = "testnotest";
        findNoNRepeatingCharacter(string);
    }

    public static void findNoNRepeatingCharacter(String string) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            } else {
                map.put(string.charAt(i), counter);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
