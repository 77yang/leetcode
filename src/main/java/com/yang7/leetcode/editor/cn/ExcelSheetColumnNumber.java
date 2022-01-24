//给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回该列名称对应的列序号。
//
// 
//
// 例如， 
//
// 
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
//    ...
// 
//
// 
//
// 示例 1: 
//
// 
//输入: columnTitle = "A"
//输出: 1
// 
//
// 示例 2: 
//
// 
//输入: columnTitle = "AB"
//输出: 28
// 
//
// 示例 3: 
//
// 
//输入: columnTitle = "ZY"
//输出: 701 
//
// 示例 4: 
//
// 
//输入: columnTitle = "FXSHRXW"
//输出: 2147483647
// 
//
// 
//
// 提示： 
//
// 
// 1 <= columnTitle.length <= 7 
// columnTitle 仅由大写英文组成 
// columnTitle 在范围 ["A", "FXSHRXW"] 内 
// 
// Related Topics 数学 字符串 👍 306 👎 0


package com.yang7.leetcode.editor.cn;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution solution = new ExcelSheetColumnNumber().new Solution();
        System.out.println(solution.titleToNumber("A"));
        System.out.println(solution.titleToNumber("AA"));
        System.out.println(solution.titleToNumber("AB"));
        System.out.println(solution.titleToNumber("BA"));
        System.out.println(solution.titleToNumber("ZY"));
        System.out.println(solution.titleToNumber("FXSHRXW"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int titleToNumber(String columnTitle) {
            int n = columnTitle.length();

            int total = 0;
            int multiple = 1;
            for (int i = n - 1; i >= 0; i--) {
                char c = columnTitle.charAt(i);
                int sum = c - 'A' + 1;

                //A~Z   1~26
                //AA~AZ   27~52 26^1+1 26^1+26
                //BA~BZ   53~78 26^2+1 26^2+26
                //CA~CZ   79~104
                //AAA~CZ   79~104
                total += (sum * multiple);
                multiple *= 26;

            }
            return total;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}