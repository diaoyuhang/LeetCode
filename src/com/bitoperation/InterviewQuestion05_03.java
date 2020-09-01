package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，
 * 找出你能够获得的最长的一串1的长度。
 * @Date: 13:38 2020-7-20
 */
public class InterviewQuestion05_03 {

    public int reverseBits(int num) {
        int curr = 0;
        int result = 0;
        int pre = -1;

        for (int i = 0; i < 32; i++) {
            //当前位值为1，则当前长度+1
            if ((num & 1) == 1) {
                curr++;
            } else {
                //判断curr的长度与result的大小，
                result = result < curr ? curr : result;
                //将当前curr值 +1
                curr = i - pre;
                //使用pre记录当前0的位置
                pre = i;
            }
            num >>>= 1;
        }
        return result;
    }
}
