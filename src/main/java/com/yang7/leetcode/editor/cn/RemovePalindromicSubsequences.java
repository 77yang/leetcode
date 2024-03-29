//给你一个字符串 s，它仅由字母 'a' 和 'b' 组成。每一次删除操作都可以从 s 中删除一个回文 子序列。
//
// 返回删除给定字符串中所有字符（字符串为空）的最小删除次数。 
//
// 「子序列」定义：如果一个字符串可以通过删除原字符串某些字符而不改变原字符顺序得到，那么这个字符串就是原字符串的一个子序列。 
//
// 「回文」定义：如果一个字符串向后和向前读是一致的，那么这个字符串就是一个回文。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ababa"
//输出：1
//解释：字符串本身就是回文序列，只需要删除一次。
// 
//
// 示例 2： 
//
// 
//输入：s = "abb"
//输出：2
//解释："abb" -> "bb" -> "". 
//先删除回文子序列 "a"，然后再删除 "bb"。
// 
//
// 示例 3： 
//
// 
//输入：s = "baabb"
//输出：2
//解释："baabb" -> "b" -> "". 
//先删除回文子序列 "baab"，然后再删除 "b"。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅包含字母 'a' 和 'b' 
// 
// Related Topics 双指针 字符串 👍 166 👎 0


package com.yang7.leetcode.editor.cn;

public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        Solution solution = new RemovePalindromicSubsequences().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 因为只有'a','b'两个字母且可以删除回文子序列，所以不管怎么样都可以把所有的'a'凑成一个序列，‘b’凑成另一个序列，他们都是回文的可以被删除，故最多需要两次。
         * 所以只需要看本身是不是回文，可不可以一次删除即可。
         * @param s
         * @return
         */
        public int removePalindromeSub(String s) {
            int n = s.length();
            for (int i = 0; i < n / 2; i++)
                if (s.charAt(i) != s.charAt(n - 1 - i))
                    return 2;
            return 1;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}