  //给你一个二进制字符串 s 。如果字符串中由 1 组成的 最长 连续子字符串 严格长于 由 0 组成的 最长 连续子字符串，返回 true ；否则，返回 
//false 。 
//
// 
// 例如，s = "110100010" 中，由 1 组成的最长连续子字符串的长度是 2 ，由 0 组成的最长连续子字符串的长度是 3 。 
// 
//
// 注意，如果字符串中不存在 0 ，此时认为由 0 组成的最长连续子字符串的长度是 0 。字符串中不存在 1 的情况也适用此规则。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "1101"
//输出：true
//解释：
//由 1 组成的最长连续子字符串的长度是 2："1101"
//由 0 组成的最长连续子字符串的长度是 1："1101"
//由 1 组成的子字符串更长，故返回 true 。
// 
//
// 示例 2： 
//
// 
//输入：s = "111000"
//输出：false
//解释：
//由 1 组成的最长连续子字符串的长度是 3："111000"
//由 0 组成的最长连续子字符串的长度是 3："111000"
//由 1 组成的子字符串不比由 0 组成的子字符串长，故返回 false 。
// 
//
// 示例 3： 
//
// 
//输入：s = "110100010"
//输出：false
//解释：
//由 1 组成的最长连续子字符串的长度是 2："110100010"
//由 0 组成的最长连续子字符串的长度是 3："110100010"
//由 1 组成的子字符串不比由 0 组成的子字符串长，故返回 false 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s[i] 不是 '0' 就是 '1' 
// 
// Related Topics 字符串 👍 16 👎 0

  
  package com.yang7.leetcode.editor.cn;
  public class LongerContiguousSegmentsOfOnesThanZeros{
      public static void main(String[] args) {
           Solution solution = new LongerContiguousSegmentsOfOnesThanZeros().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public boolean checkZeroOnes(String s) {
              int l=s.length();
              int m=0,resm=0;
              int n=0,resn=0;
              for(int i=0;i<l;i++){
                  if(s.charAt(i) == '1'){
                      m++;
                      resm=Math.max(m,resm);
                      n=0;
                  }else{
                      n++;
                      m=0;
                      resn=Math.max(n,resn);
                  }
              }
              return resm>resn? true:false;
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }