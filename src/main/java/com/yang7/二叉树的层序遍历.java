package com.yang7;

import com.yang7.sword2offer.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class 二叉树的层序遍历 {
    static class Solution {

        public List<List<Integer>> levelOrder(TreeNode root) {
            TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
            ArrayList<List<Integer>> arrayList = new ArrayList<>();
            if (root == null) {
                return new ArrayList<>();
            }
            lookThrough(treeMap, root, 0);
            return treeMap.values().stream().collect(Collectors.toList());
        }

        private void lookThrough(TreeMap<Integer, List<Integer>> treeMap, TreeNode root, int count) {
            if (root == null) {
                return;
            }
            List<Integer> list = treeMap.getOrDefault(count, new ArrayList<>());
            list.add(root.val);
            treeMap.put(count, list);
            lookThrough(treeMap, root.left, count + 1);
            lookThrough(treeMap, root.right, count + 1);
        }

        public static void main(String[] args) {


            TreeNode treeNode1 = new TreeNode(3);
            TreeNode treeNode2 = new TreeNode(9);
            TreeNode treeNode3 = new TreeNode(20);
            TreeNode treeNode4 = new TreeNode(15);
            TreeNode treeNode5 = new TreeNode(7);


            treeNode1.left = treeNode2;
            treeNode1.right = treeNode3;


            treeNode3.left = treeNode4;
            treeNode3.right = treeNode5;


            System.out.println(new Solution().levelOrder(treeNode1));


        }
    }
}
