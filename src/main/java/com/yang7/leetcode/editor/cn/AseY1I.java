  //给定一个字符串数组 words，请计算当两个字符串 words[i] 和 words[j] 不包含相同字符时，它们长度的乘积的最大值。假设字符串中只包含英语
//的小写字母。如果没有不包含相同字符的一对字符串，返回 0。 
//
// 
//
// 示例 1: 
//
// 
//输入: words = ["abcw","baz","foo","bar","fxyz","abcdef"]
//输出: 16 
//解释: 这两个单词为 "abcw", "fxyz"。它们不包含相同字符，且长度的乘积最大。 
//
// 示例 2: 
//
// 
//输入: words = ["a","ab","abc","d","cd","bcd","abcd"]
//输出: 4 
//解释: 这两个单词为 "ab", "cd"。 
//
// 示例 3: 
//
// 
//输入: words = ["a","aa","aaa","aaaa"]
//输出: 0 
//解释: 不存在这样的两个单词。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= words.length <= 1000 
// 1 <= words[i].length <= 1000 
// words[i] 仅包含小写字母 
// 
//
// 
//
// 注意：本题与主站 318 题相同：https://leetcode-cn.com/problems/maximum-product-of-word-
//lengths/ 
// Related Topics 位运算 数组 字符串 👍 45 👎 0

  
  package com.yang7.leetcode.editor.cn;
  public class AseY1I{
      public static void main(String[] args) {
           Solution solution = new AseY1I().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
          // 暴力解法
// m 表示单词的平均长度，n 表示单词的个数
// 时间复杂度：O(n^2 * m)
// 空间复杂度：O(1)
          public int maxProduct(String[] words) {
              int ans = 0;
              for (int i = 0; i < words.length; i++) {
                  String word1 = words[i];
                  for (int j = i + 1; j < words.length; j++) {
                      String word2 = words[j];
                      // 每个单词的 bitMask 会重复计算很多次
                      if (!hasSameChar(word1, word2)) {
                          ans = Math.max(ans, word1.length() * word2.length());
                      }
                  }
              }
              return ans;
          }
          // O(m^2)
          private boolean hasSameChar(String word1, String word2) {
              for (char c : word1.toCharArray()) {
                  if (word2.indexOf(c) != -1) return true;
              }
              return false;
          }

}
//leetcode submit region end(Prohibit modification and deletion)

  }