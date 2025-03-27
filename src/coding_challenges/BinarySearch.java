package coding_challenges;

import java.util.*;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2,5,6,3,4}, 6));
    }

//    binary search
    public static int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid - 1;
            else right = mid + 1;
        }
        return -1;
    }
}

