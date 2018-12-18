package com.yang7;

import jdk.nashorn.internal.ir.ReturnNode;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

    public int reverse(int x) {
        //657  65   6
        int reverseValue = 0;

        while (x != 0) {
            int remainder = x % 10;
            x /= 10;

            int max = Integer.MAX_VALUE / 10;
            if (reverseValue > max || max == reverseValue && remainder > 8) return 0;
            int min = Integer.MIN_VALUE / 10;
            if (reverseValue < min || min == reverseValue && remainder < -7) return 0;

            reverseValue = remainder + reverseValue * 10;

        }


        return reverseValue;


    }


}
