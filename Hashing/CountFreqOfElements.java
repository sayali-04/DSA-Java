package Hashing;

import java.util.*;

public class CountFreqOfElements {

    public static int countfreq(int nums[]) {

        int maxfreq = 0;
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } 
            else {
                map.put(nums[i], 1);
            }
        }

        // Step 2: Find highest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxfreq) {
                maxfreq = frequency;
                ans = number;
            } 
            else if (frequency == maxfreq && number < ans) {
                ans = number;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 2, 3, 3, 3};

        System.out.println(countfreq(nums));
    }
}