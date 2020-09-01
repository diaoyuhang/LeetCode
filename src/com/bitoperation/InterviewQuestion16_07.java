package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。
 * @Date: 14:42 2020-7-20
 */
public class InterviewQuestion16_07 {
    public static void main(String[] args){
        Long result=2147483647L- -2147483648L;
        System.out.println(result);
    }

    //使用数学方式解决，
    //求差值，然后求出（a+b+差值）/2,得到的就是较大的那个数
    public int maximum(int a, int b) {
        Long A = Long.valueOf(a);
        Long B = Long.valueOf(b);
        return (int) ((A + B + Math.abs(A - B)) / 2);
    }
}
