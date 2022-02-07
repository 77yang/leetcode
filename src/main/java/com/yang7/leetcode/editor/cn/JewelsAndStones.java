//给你一个字符串 jewels 代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头。 stones 中每个字符代表了一种你拥有的石头的类型，
//你想知道你拥有的石头中有多少是宝石。 
//
// 字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。 
//
// 
//
// 示例 1： 
//
// 
//输入：jewels = "aA", stones = "aAAbbbb"
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：jewels = "z", stones = "ZZ"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= jewels.length, stones.length <= 50 
// jewels 和 stones 仅由英文字母组成 
// jewels 中的所有字符都是 唯一的 
// 
// Related Topics 哈希表 字符串 👍 684 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        Solution solution = new JewelsAndStones().new Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(solution.numJewelsInStones("z", "ZZ"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {

            if (stones.length() < 1) {
                return 0;
            }

            Set<Character> set = new HashSet<>();
            for (int i = 0; i < jewels.length(); i++) {
                set.add(jewels.charAt(i));
            }
            int total = 0;

            for (int i = 0; i < stones.length(); i++) {
                char c = stones.charAt(i);
                if (set.contains(c)) {
                    total += 1;
                }
            }
            return total;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}