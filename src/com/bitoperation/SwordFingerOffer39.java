package com.bitoperation;

import java.util.Arrays;

/**
 * @Author: Mr.diao
 * @Description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * @Date: 7:57 2020/7/18
 */
public class SwordFingerOffer39 {

    //摩尔投票法：
    //因为数组中包含了超过一半的数是同一个数称为众数，所以假设给众数+1票数，其它的数-1票数，
    //最后加起来，票数肯定是正数
    public int majorityElement2(int[] nums) {
        int x = nums[0];//假设第一个数为众数
        int votes = 1;//票数为1；
        for (int i = 1; i < nums.length; i++) {
            //如果当前这个数等于众数，则票数+1；
            if (nums[i] == x) {
                votes++;
            } else { //否则票数-1；
                votes--;
                if (votes == 0) { //如果票数等于0的话，需要重新设定众数
                    x = nums[i + 1];
                    votes = 1;
                    i++;
                }
            }
        }
        return x;
    }
    //方法一：将数组排序，如果前后相同的数的统计超过一半则该数为众数
    public int majorityElement1(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int length = nums.length / 2 + 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] ^ nums[i + 1]) == 0) {
                count++;
                if (count >= length) {
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }
        return 0;
    }
}
