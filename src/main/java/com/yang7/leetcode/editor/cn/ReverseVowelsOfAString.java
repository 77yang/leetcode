//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 236 👎 0


package com.yang7.leetcode.editor.cn;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new ReverseVowelsOfAString().new Solution();
        System.out.println(solution.reverseVowels("aA"));
        System.out.println(solution.reverseVowels("hello"));
        System.out.println(solution.reverseVowels("leetcode"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {

            int start = 0;
            int end = s.length() - 1;
            String target = "aeiouAEIOU";
            char[] chars = s.toCharArray();
            while (start < end) {
                char c1 = chars[start];
                char c2 = chars[end];

                if (target.indexOf(c1) > -1 && target.indexOf(c2) > -1) {
                    char temp = chars[start];
                    chars[start] = chars[end];
                    chars[end] = temp;
                    start++;
                    end--;
                    continue;
                }


                if (target.indexOf(c1) > -1) {
                    end--;
                } else {
                    start++;
                }
            }
            return String.valueOf(chars);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}