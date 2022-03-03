  //给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 109 👎 0

  
  package com.yang7.leetcode.editor.cn;
  public class MaximumNumberOfBalloons{
      public static void main(String[] args) {
           Solution solution = new MaximumNumberOfBalloons().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public int maxNumberOfBalloons(String text) {
              int[] cnts = new int[5];
              for (int i = 0; i < text.length(); i++) {
                  char c = text.charAt(i);
                  if (c == 'b') cnts[0]++;
                  else if (c == 'a') cnts[1]++;
                  else if (c == 'l') cnts[2]++;
                  else if (c == 'o') cnts[3]++;
                  else if (c == 'n') cnts[4]++;
              }
              cnts[2] /= 2; cnts[3] /= 2;
              int ans = cnts[0];
              for (int i = 0; i < 5; i++) ans = Math.min(ans, cnts[i]);
              return ans;
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }