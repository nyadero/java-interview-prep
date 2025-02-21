package coding_challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentElement(new int[]{1,2,5,3,4,5,}));
    }

    public static int mostFrequentElement(int[] nums){
        int mostCount = 0;
        int mostFrequent = -1;
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
}
