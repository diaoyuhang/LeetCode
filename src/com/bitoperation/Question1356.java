package com.bitoperation;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Mr.diao
 * @Description: 给你一个整数数组?arr?。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 * 如果存在多个数字二进制中?1?的数目相同，则必须将它们按照数值大小升序排列。
 * 请你返回排序后的数组。
 * 提示：
 * 1 <= arr.length <= 500
 * 0 <= arr[i] <= 10^4
 *
 * @Date: 8:27 2020/7/17
 */
public class Question1356 {
    public int[] sortByBits(int[] arr) {
        //由于题目中表示0 <= arr[i] <= 10^4
        for (int i = 0; i < arr.length; i++) {
            //这一步结合了二进制1的个数和数值的大小，后面直接对这个结果排序
            arr[i] = bitCount(arr[i]) * 100000 + arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }

    //获得该数值二进制中1的个数
    private int bitCount(int num) {
        int c = 0;
        while (num != 0) {
            num &= (num - 1);
            c++;
        }
        return c;
    }
}
