package com.leetcode.leetcodepratice.longestsubstring;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Service;

@Service
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 1;
        int pos = 0;
        ArrayList<Integer> results = new ArrayList<>();
        
        for(int i = 1; i < s.length() ; i++) {
            
            for(int j = pos; j < i; j++) {
                
                if(s.charAt(i) != s.charAt(j))
                    length ++;
                else {
                    pos = i;
                    break;
                }
            }
            results.add(length);
            length = 1;
        }
        
        System.out.println("results : " + results);
        return Collections.max(results);
    }
}