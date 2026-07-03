/*
347. Top K Frequent Elements

Given an integer array nums and an integer k, return the k most
frequent elements. You may return the answer in any order.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:

Input: nums = [1], k = 1
Output: [1]

*/

//CODE:

import java.util.*;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        maxHeap.addAll(map.keySet());

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}