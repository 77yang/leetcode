  //给你一个字符串 date ，它的格式为 Day Month Year ，其中： 
//
// 
// Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。 
// Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
//"Oct", "Nov", "Dec"} 中的一个元素。 
// Year 的范围在 [1900, 2100] 之间。 
// 
//
// 请你将字符串转变为 YYYY-MM-DD 的格式，其中： 
//
// 
// YYYY 表示 4 位的年份。 
// MM 表示 2 位的月份。 
// DD 表示 2 位的天数。 
// 
//
// 
//
// 示例 1： 
//
// 输入：date = "20th Oct 2052"
//输出："2052-10-20"
// 
//
// 示例 2： 
//
// 输入：date = "6th Jun 1933"
//输出："1933-06-06"
// 
//
// 示例 3： 
//
// 输入：date = "26th May 1960"
//输出："1960-05-26"
// 
//
// 
//
// 提示： 
//
// 
// 给定日期保证是合法的，所以不需要处理异常输入。 
// 
// Related Topics 字符串 👍 12 👎 0

  
  package com.yang7.leetcode.editor.cn;

  import java.util.HashMap;
  import java.util.Map;

  public class ReformatDate{
      public static void main(String[] args) {
           Solution solution = new ReformatDate().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public String reformatDate(String date) {
              String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
              Map<String, Integer> s2month = new HashMap<>();
              for (int i = 1; i <= 12; i++) {
                  s2month.put(months[i - 1], i);
              }
              String[] array = date.split(" ");
              int year = Integer.parseInt(array[2]);
              int month = s2month.get(array[1]);
              int day = Integer.parseInt(array[0].substring(0, array[0].length() - 2));
              return String.format("%d-%02d-%02d", year, month, day);
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }