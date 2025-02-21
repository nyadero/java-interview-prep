package coding_challenges;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{0, 2,1, 3, 5}));
    }

    static int findMissingNumber(int[] nums){
        int initialSum = Arrays.stream(nums).sum();
        int actualSum = (nums.length * (nums.length + 1))/2;
      return actualSum - initialSum;
    }
}
