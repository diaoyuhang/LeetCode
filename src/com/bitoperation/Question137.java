package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @Date: 8:29 2020/7/23
 */
public class Question137 {

    public static void main(String[] args){
        int[] nums={1,2,2,1,4,1,2};
        Question137 question137 = new Question137();
        question137.singleNumber(nums);
    }

    public int singleNumber(int[] nums) {
        //第一次出现，将num加入到seenOnce,不加入到seenTwice
        //第二次出现，将num加入到seecTwice,从seenOnce删除
        //第三次出现，将num加入到seenOnce,从seenTwice删除
        int seenOnce =0 ,seenTwice =0;
        for (int n: nums) {
            seenOnce = ~seenTwice & (seenOnce ^ n);
            seenTwice = ~seenOnce & (seenTwice ^ n);
        }

        return seenOnce;
    }
}
