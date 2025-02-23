package coding_challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentElement(new int[]{1,2,5,3,4,5,}));
        System.out.println(mostFrequentChar("Hello"));
    }

    public static int mostFrequentElement(int[] nums){
        int mostCount = 0;
        Integer mostFrequent = null;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int num : nums) {
            // Get the current count, defaulting to 0 if the key doesn't exist
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Update most frequent element if the count increases
            if (map.get(num) > mostCount) {
                mostFrequent = num;
                mostCount = map.get(num);
            }
        }

        return mostFrequent;
    }

    public static char mostFrequentChar(String s) {
        int mostCount = 0;
        char mostFrequent = '\0';
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.get(c) > mostCount) {
                mostFrequent = c;
                mostCount = map.get(c);
            }
        }
        return mostFrequent;
    }

}
