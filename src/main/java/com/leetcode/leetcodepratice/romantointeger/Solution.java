package com.leetcode.leetcodepratice.romantointeger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution {
    public int romanToInt(String s) {
        char[] validCharacters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] valueOfRomainChar = { 1, 5, 10, 50, 100, 500, 1000 };
        boolean exist = false;
        int position = -1;
        int value = 0;
        if (s.length() >= 1 && s.length() <= 15) {
            for (int i = 0; i < s.length(); i++) {
                log.info(String.valueOf(s.charAt(i)));
                for (int j = 0; j < validCharacters.length; j++) {
                    if (s.charAt(i) == validCharacters[j]) {
                        exist = true;

                        // position in char list validCharacters
                        position = j;

                        break;
                    }
                }

                // check if char present in the roman string is valid
                if (!exist)
                    return -1;

                // reset value of exist
                exist = false;

                if (i > 0 && s.charAt(i - 1) == 'I') {
                    if (s.charAt(i) == 'V') {
                        value += 4 - 1;
                    } else if (s.charAt(i) == 'X') {
                        value += 9 - 1;
                    } else
                        value += valueOfRomainChar[position];
                } else if (i > 0 && s.charAt(i - 1) == 'X') {
                    if (s.charAt(i) == 'L') {
                        value += 40 - 10;
                    } else if (s.charAt(i) == 'C') {
                        value += 90 - 10;
                    } else
                        value += valueOfRomainChar[position];
                } else if (i > 0 && s.charAt(i - 1) == 'C') {
                    if (s.charAt(i) == 'D') {
                        value += 400 - 100;
                    } else if (s.charAt(i) == 'M') {
                        value += 900 - 100;
                    } else
                        value += valueOfRomainChar[position];
                } else
                    value += valueOfRomainChar[position];

                log.info(String.valueOf(value));

            }
            return value;
        }
        return 0;
    }
}