  //给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。 
//
// 注意: 
//
// 
// 十六进制中所有字母(a-f)都必须是小写。 
// 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
// 给定的数确保在32位有符号整数范围内。 
// 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。 
// 
//
// 示例 1： 
//
// 
//输入:
//26
//
//输出:
//"1a"
// 
//
// 示例 2： 
//
// 
//输入:
//-1
//
//输出:
//"ffffffff"
// 
// Related Topics 位运算 数学 👍 231 👎 0

  
  package com.yang7.leetcode.editor.cn;
  public class ConvertANumberToHexadecimal{
      public static void main(String[] args) {
           Solution solution = new ConvertANumberToHexadecimal().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
      class Solution {
          public String toHex(int num) {
              String res = "";
              long N = num;     // 预处理
              if (N == 0) return "0";
              String dict = "0123456789abcdef";
              if (N < 0) N = 4294967296L + N;  /* 4294967296L就是 0x0000000100000000(16^8=2^32), Java中不使用BigInteger无法存储, 只能hard code在这里了 */
              while (N > 0)
              {
                  long lastDigit = N % 16;
                  N /= 16;
                  res = dict.charAt((int)lastDigit) + res;
              }
              return res;
          }
      }

//leetcode submit region end(Prohibit modification and deletion)

  }