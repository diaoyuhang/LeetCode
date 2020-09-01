package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 * @Date: 8:26 2020-7-21
 */
public class InerviewQuestion17_10 {

    public int majorityElement(int[] nums) {
        int x = nums[0];
        int v = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == x) {
                v++;
            } else {
                v--;
                if (v == 0) {
                    if (i + 1 < nums.length) {
                        x = nums[i + 1];
                        v = 1;
                        i++;
                    }
                }
            }
        }

        int length = nums.length / 2 +1;
        int count =0;
        for (int n: nums) {
            if (n == x)
                count++;
        }
        if (count >=length)
            return x;
        return -1;
    }
}
