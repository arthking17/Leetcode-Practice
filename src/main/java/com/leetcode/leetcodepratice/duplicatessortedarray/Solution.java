package com.leetcode.leetcodepratice.duplicatessortedarray;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    public int removeDuplicates(int[] nums) {
        return removeDuplicate(nums).length;
    }

    // recursive function
    public int[] removeDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums = removeTheElement(nums, i);
                nums = removeDuplicate(nums);
            }
        }
        displayArray(nums);
        return nums;
    }

    public void displayArray(int[] nums) {
        String arrayString = "";
        for (int i = 0; i < nums.length; i++) {
            arrayString += nums[i] + " ";
        }
        log.info(arrayString);
    }

    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}