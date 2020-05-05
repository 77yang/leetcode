package com.yang7.sword2offer;

public class 表示数值的字符串 {

    static class Solution {
        public boolean isNumber(String s) {
            s = s.trim();
            int length = s.length();

            if (length < 1) {
                return false;
            }
            boolean dotFlag = false;
            boolean eFlag = false;
            int lastIndex = length - 1;


            for (int i = 0; i < length; i++) {

                char c = s.charAt(i);
                if (i != 0 && (c == '-' || c == '+') || i == 0 && (c == '-' || c == '+') && length == 1) {
                    return false;
                }


                if (c == '.') {
                    if (dotFlag || i == 0 || i == lastIndex || length==1) {
                        return false;
                    }
                    dotFlag = true;

                }

                if (c == 'e' || c == 'E') {
                    if (eFlag || i == 0 || i == lastIndex) {
                        return false;
                    }
                    eFlag = true;

                }

            }

            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isNumber("-1111"));
        System.out.println(new Solution().isNumber("-"));
        System.out.println(new Solution().isNumber("-1.111"));
        System.out.println(new Solution().isNumber(".1111"));
        System.out.println(new Solution().isNumber("111e1"));
        System.out.println(new Solution().isNumber(".1"));
    }
}
