//给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的每个数字在每个组合中只能使用 一次 。 
//
// 注意：解集不能包含重复的组合。 
//
// 
//
// 示例 1: 
//
// 
//输入: candidates = [10,1,2,7,6,1,5], target = 8,
//输出:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//] 
//
// 示例 2: 
//
// 
//输入: candidates = [2,5,2,1,2], target = 5,
//输出:
//[
//[1,2,2],
//[5]
//] 
//
// 
//
// 提示: 
//
// 
// 1 <= candidates.length <= 100 
// 1 <= candidates[i] <= 50 
// 1 <= target <= 30 
// 
// Related Topics 数组 回溯 👍 873 👎 0


package com.yang7.leetcode.editor.cn;

import java.util.*;

public class CombinationSumIi {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi().new Solution();
        //1,1,2,5,6,7,10
        System.out.println(solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int sum = 0;

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            //为了将重复的数字都放到一起，所以先进行排序
            Arrays.sort(candidates);
            //加标志数组，用来辅助判断同层节点是否已经遍历
            boolean[] flag = new boolean[candidates.length];
            backTracking(candidates, target, 0, flag);
            return lists;
        }

        public void backTracking(int[] arr, int target, int index, boolean[] flag) {
            if (sum == target) {
                lists.add(new ArrayList(deque));
                return;
            }
            for (int i = index; i < arr.length && arr[i] + sum <= target; i++) {
                //出现重复节点，同层的第一个节点已经被访问过，所以直接跳过
                if (i > 0 && arr[i] == arr[i - 1] && !flag[i - 1]) {
                    continue;
                }
                flag[i] = true;
                sum += arr[i];
                deque.push(arr[i]);
                //每个节点仅能选择一次，所以从下一位开始
                backTracking(arr, target, i + 1, flag);
                int temp = deque.pop();
                flag[i] = false;
                sum -= temp;
            }
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}