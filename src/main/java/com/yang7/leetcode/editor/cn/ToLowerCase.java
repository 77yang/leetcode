//给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello"
//输出："hello"
// 
//
// 示例 2： 
//
// 
//输入：s = "here"
//输出："here"
// 
//
// 示例 3： 
//
// 
//输入：s = "LOVELY"
//输出："lovely"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 由 ASCII 字符集中的可打印字符组成 
// 
// Related Topics 字符串 👍 198 👎 0


package com.yang7.leetcode.editor.cn;

public class ToLowerCase {
    public static void main(String[] args) {
        Solution solution = new ToLowerCase().new Solution();
        System.out.println(solution.toLowerCase("Hello"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String toLowerCase(String s) {
            int dif = 'A' - 'a';
            char[] chars = s.toCharArray();
            for(int i = 0; i < chars.length; i++){
                if(chars[i] >= 'A' && chars[i] <= 'Z') chars[i] -= dif;
            }
            return String.valueOf(chars);
        }

        public String toLowerCase2(String s) {
            int diff = 'a' - 'A';
            System.out.println(diff);
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);
                int temp = c + diff;
                if (temp >= 'a' && temp<='z') {
                    sb.append((char)temp);
                } else {
                    sb.append(c);
                }
            }


            return sb.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}