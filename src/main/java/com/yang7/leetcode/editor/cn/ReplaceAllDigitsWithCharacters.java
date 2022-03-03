//给你一个下标从 0 开始的字符串 s ，它的 偶数 下标处为小写英文字母，奇数 下标处为数字。
//
// 定义一个函数 shift(c, x) ，其中 c 是一个字符且 x 是一个数字，函数返回字母表中 c 后面第 x 个字符。 
//
// 
// 比方说，shift('a', 5) = 'f' 和 shift('x', 0) = 'x' 。 
// 
//
// 对于每个 奇数 下标 i ，你需要将数字 s[i] 用 shift(s[i-1], s[i]) 替换。 
//
// 请你替换所有数字以后，将字符串 s 返回。题目 保证 shift(s[i-1], s[i]) 不会超过 'z' 。 
//
// 
//
// 示例 1： 
//
// 输入：s = "a1c1e1"
//输出："abcdef"
//解释：数字被替换结果如下：
//- s[1] -> shift('a',1) = 'b'
//- s[3] -> shift('c',1) = 'd'
//- s[5] -> shift('e',1) = 'f' 
//
// 示例 2： 
//
// 输入：s = "a1b2c3d4e"
//输出："abbdcfdhe"
//解释：数字被替换结果如下：
//- s[1] -> shift('a',1) = 'b'
//- s[3] -> shift('b',2) = 'd'
//- s[5] -> shift('c',3) = 'f'
//- s[7] -> shift('d',4) = 'h' 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 只包含小写英文字母和数字。 
// 对所有 奇数 下标处的 i ，满足 shift(s[i-1], s[i]) <= 'z' 。 
// 
// Related Topics 字符串 👍 12 👎 0


package com.yang7.leetcode.editor.cn;

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        Solution solution = new ReplaceAllDigitsWithCharacters().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceDigits(String s) {
            char[] a = s.toCharArray();
            int b = s.length() / 2;
            for (int i = 0; i < b; i++)
                a[i * 2 + 1] = (char) (a[i * 2] + (a[i * 2 + 1] - '0'));//减去0的ASII码来得到准确数值
            //例如a[3]=2,那么需要让a[2]+2,但a[3]中的2是字符型，不可以直接被a[2]相加，相加相当于a[2]的ASII码+2的ASII码。 所以需要用2的ASII码-0的ASII码 即a[3]-'0';
            return new String(a);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}