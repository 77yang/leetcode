//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
// Related Topics 字符串 👍 165 👎 0


package com.yang7.leetcode.editor.cn;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution solution = new NumberOfSegmentsInAString().new Solution();
        System.out.println(solution.countSegments(""));
        System.out.println(solution.countSegments("Hello, my name is John"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSegments(String s) {
            int n = s.length(), ans = 0;
            char last = ' ';
            for(int i=0;i<n;i++){
                char c = s.charAt(i);
                if(c == ' ' && last != ' ')
                    ans++;
                last = c;
            }
            return last != ' '? ans+1 : ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}