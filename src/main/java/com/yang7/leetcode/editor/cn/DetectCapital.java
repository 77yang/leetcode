  //我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
// Related Topics 字符串 👍 197 👎 0

  
  package com.yang7.leetcode.editor.cn;
  public class DetectCapital{
      public static void main(String[] args) {
           Solution solution = new DetectCapital().new Solution();
          System.out.println(solution.detectCapitalUse("ffffffffffffffffffffF"));
          System.out.println(solution.detectCapitalUse("USA"));
          System.out.println(solution.detectCapitalUse("leetcode"));
          System.out.println(solution.detectCapitalUse("Google"));
          System.out.println(solution.detectCapitalUse("GooglAe"));
          System.out.println((int)'a');
          System.out.println((int)'A');
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 97) {
                upperCount++;
            }
        }
        return upperCount == word.length() || upperCount == 0 || (upperCount == 1 && word.charAt(0) < 97);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }