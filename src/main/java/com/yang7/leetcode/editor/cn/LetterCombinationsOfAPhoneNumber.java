//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
// Related Topics 哈希表 字符串 回溯 👍 1681 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
        System.out.println((int) '1');
        System.out.println((int) 'a');
        System.out.println('a' - '1');
        System.out.println('b' - '1');
        System.out.println(Character.digit(49, 10));


        System.out.println("======");
        solution.letterCombinations("789");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> ans = new ArrayList<>();
        String[] phone = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        public List<String> letterCombinations(String digits) {
            if("".equals(digits)) return ans;
            dfs(digits, 0, new StringBuilder());
            return ans;
        }
        public void dfs(String digits, int start, StringBuilder sb){
            if(start == digits.length()){
                ans.add(new String(sb));
                return;
            }
            // 取出当前数字
            int curIdx = digits.charAt(start) - '0';
            // 当前数字对应的电话按键
            String curPhoneNum = phone[curIdx];
            // 回溯
            for(int i = 0; i < curPhoneNum.length(); i++){
                sb.append(curPhoneNum.charAt(i));
                dfs(digits, start + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}