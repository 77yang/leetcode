  //给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，并且两个单词之间至少存在一个空格。题目测试用例保证 
//text 至少包含一个单词 。 
//
// 请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，这也
//意味着返回的字符串应当与原 text 字符串的长度相等。 
//
// 返回 重新排列空格后的字符串 。 
//
// 
//
// 示例 1： 
//
// 输入：text = "  this   is  a sentence "
//输出："this   is   a   sentence"
//解释：总共有 9 个空格和 4 个单词。可以将 9 个空格平均分配到相邻单词之间，相邻单词间空格数为：9 / (4-1) = 3 个。
// 
//
// 示例 2： 
//
// 输入：text = " practice   makes   perfect"
//输出："practice   makes   perfect "
//解释：总共有 7 个空格和 3 个单词。7 / (3-1) = 3 个空格加上 1 个多余的空格。多余的空格需要放在字符串的末尾。
// 
//
// 示例 3： 
//
// 输入：text = "hello   world"
//输出："hello   world"
// 
//
// 示例 4： 
//
// 输入：text = "  walks  udp package   into  bar a"
//输出："walks  udp  package  into  bar  a "
// 
//
// 示例 5： 
//
// 输入：text = "a"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 100 
// text 由小写英文字母和 ' ' 组成 
// text 中至少包含一个单词 
// 
// Related Topics 字符串 👍 15 👎 0

  
  package com.yang7.leetcode.editor.cn;
  public class RearrangeSpacesBetweenWords{
      public static void main(String[] args) {
           Solution solution = new RearrangeSpacesBetweenWords().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public String reorderSpaces(String text) {
              // trim去除头尾空格 在JDK11中加入了strip
              String[] splited = text.trim().split("\\s+");
              // String[] splited = text.strip().split("\\s+");
              // System.out.println(Arrays.toString(splited));
              // 记录多少个单词
              int wordCnt = splited.length;
              // 记录单词总长
              int wordLen = 0;
              for(String word : splited) {
                  wordLen += word.length();
              }
              // 空格数量
              int spaceCnt = text.length() - wordLen;
              StringBuilder sb = new StringBuilder();
              // 只用在前n-1个单词后面加空格
              for (int i = 0; i < splited.length - 1; i++) {
                  sb.append(splited[i]);
                  for (int j = 0; j < spaceCnt / (wordCnt - 1); j++) {
                      sb.append(" ");
                  }
              }
              // 最后一个单词直接加上去
              sb.append(splited[splited.length - 1]);
              // 补齐剩余的空格
              while (sb.length() < text.length()) {
                  sb.append(" ");
              }
              return sb.toString();
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }