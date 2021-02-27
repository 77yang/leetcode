package com.yang7;

import java.util.Arrays;

public class 分发饼干 {
/*
https://leetcode-cn.com/problems/assign-cookies/
 */

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;

    }

    public static void main(String[] args) {

        System.out.println(new 分发饼干().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(new 分发饼干().findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
