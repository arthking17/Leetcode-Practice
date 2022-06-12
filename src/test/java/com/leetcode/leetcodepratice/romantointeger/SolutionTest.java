package com.leetcode.leetcodepratice.romantointeger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SolutionTest {

   @ParameterizedTest
   @CsvSource({
       "2, II",
       "3, III",
       "4, IV",
       "58, LVIII",
       "1994, MCMXCIV",
   })
   void testRomanConvert(int value, String romanString) {
     Solution s = new Solution();
       Assertions.assertEquals(value, s.romanToInt(romanString));
   }

}
