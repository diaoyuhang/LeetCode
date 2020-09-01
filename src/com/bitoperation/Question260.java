package com.bitoperation;

import java.util.ArrayList;

/**
 * @Author: Mr.diao
 * @Description: 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。
 * 找出只出现一次的那两个元素。
 * @Date: 8:15 2020/7/28
 */
public class Question260 {
    public int[] singleNumber(int[] nums) {
        int result = 0;

        //将所有第数进行异或操作，结果就是两个只出现一次的元素异或结果
        for (int n : nums) {
            result ^= n;
        }

        //保留结果二进制最右边的1
        //两个元素在该位置的1肯定是不同的
        int result2 = result & (~result + 1);
        //将所有数根据该位置的结果，分为两组
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = 0;
        for (int n : nums) {
            if ((n & result2) == 0) {
                n1 ^= n;
            }
        }

        return new int[]{n1, result ^ n1};
    }
}
