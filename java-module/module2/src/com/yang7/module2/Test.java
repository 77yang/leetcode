package com.yang7.module2;

public class Test {
    public static String test() {
        return "this module2";
    }

    public static void main(String[] args) {
        System.out.println(com.yang7.module1.Test.test());
        System.out.println(test());
    }
}