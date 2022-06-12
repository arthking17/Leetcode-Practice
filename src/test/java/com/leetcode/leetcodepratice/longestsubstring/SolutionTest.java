package com.leetcode.leetcodepratice.longestsubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SolutionTest {

   @Autowired
   Solution solution;

   // This test will run 4 times since we have 5 parameters defined
   @ParameterizedTest
   @CsvSource({ "abcabcbb,3", "bbbbb,1", "pwwkew,3" })
   public void testLongestSubstring(String string, int expectedResult) {
      System.out.println("String is : " + string);
      assertEquals(expectedResult,
            solution.lengthOfLongestSubstring(string));
   }

}
