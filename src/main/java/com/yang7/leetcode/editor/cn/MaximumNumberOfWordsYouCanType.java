  //键盘出现了一些故障，有些字母键无法正常工作。而键盘上所有其他键都能够正常工作。 
//
// 给你一个由若干单词组成的字符串 text ，单词间由单个空格组成（不含前导和尾随空格）；另有一个字符串 brokenLetters ，由所有已损坏的不同字
//母键组成，返回你可以使用此键盘完全输入的 text 中单词的数目。 
//
// 
//
// 示例 1： 
//
// 输入：text = "hello world", brokenLetters = "ad"
//输出：1
//解释：无法输入 "world" ，因为字母键 'd' 已损坏。
// 
//
// 示例 2： 
//
// 输入：text = "leet code", brokenLetters = "lt"
//输出：1
//解释：无法输入 "leet" ，因为字母键 'l' 和 't' 已损坏。
// 
//
// 示例 3： 
//
// 输入：text = "leet code", brokenLetters = "e"
//输出：0
//解释：无法输入任何单词，因为字母键 'e' 已损坏。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10⁴ 
// 0 <= brokenLetters.length <= 26 
// text 由若干用单个空格分隔的单词组成，且不含任何前导和尾随空格 
// 每个单词仅由小写英文字母组成 
// brokenLetters 由 互不相同 的小写英文字母组成 
// 
// Related Topics 哈希表 字符串 👍 11 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import java.util.HashSet;
  import java.util.Set;

  public class MaximumNumberOfWordsYouCanType{
      public static void main(String[] args) {
           Solution solution = new MaximumNumberOfWordsYouCanType().new Solution();
          System.out.println(solution.canBeTypedWords("leet code", "lt"));
          System.out.println(solution.canBeTypedWords("hello world", "ad"));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int total = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(String.valueOf(brokenLetters.charAt(i)));
        }
        for (String s : arr) {
            for (String c : set) {
                if (s.contains(c)) {
                    total -= 1;
                    break;
                }
            }
        }
        return arr.length+total;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }