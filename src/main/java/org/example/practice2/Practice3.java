package org.example.practice2;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
    /**
     * Tìm ký tự không lặp lại đầu tiên của một chuối
     */
    public static void noRepeatingLettersOfCharacter (String str) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == 1) {
                System.out.print(entrySet.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        noRepeatingLettersOfCharacter("testhello");
    }
}
