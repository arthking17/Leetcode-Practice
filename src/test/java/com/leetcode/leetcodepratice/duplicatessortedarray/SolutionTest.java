package com.leetcode.leetcodepratice.duplicatessortedarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SolutionTest {

    Solution s = new Solution();

    // This test will run 4 times since we have 5 parameters defined
    @ParameterizedTest
    @CsvSource(value = { "{1,1,2}:2", "{0,0,1,1,1,2,2,3,3,4}:5" }, delimiter = ':')
    public void testParametizedRemoveDuplicatesFromSortedArray(String numsString, int expectedResult) {
        System.out.println("Array is : " + numsString);
        int[] nums = conertStringToIntArray(numsString);
        assertEquals(expectedResult,
                s.removeDuplicates(nums));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArray() {
        int[] nums = { 1, 1, 2 };
        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Array is : " + nums);
        assertEquals(2,
                s.removeDuplicates(nums));
    }

    public int[] conertStringToIntArray(String str) {
        String[] string = str.replaceAll("\\{", "")
                              .replaceAll("}", "")
                              .split(",");
 
        // declaring an array with the size of string
        int[] arr = new int[string.length];
 
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        return arr;
    }

}
