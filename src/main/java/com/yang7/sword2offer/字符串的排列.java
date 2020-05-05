package com.yang7.sword2offer;

import java.util.ArrayList;
import java.util.List;

public class 字符串的排列 {
   static class Solution {
        public String[] permutation(String s) {

            char[] chars = s.toCharArray();

            List<String> ls = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                char[] tempArray = s.toCharArray();

                swap(i, tempArray);

                int j = i;
                while (j < s.length()) {

                }

                tempArray[i] = chars[i];

            }


            return null;
        }

       private void swap(int i, char[] tempArray) {
           char temp = tempArray[0];
           tempArray[0] = tempArray[i];
           tempArray[i] = temp;
       }
   }
}
