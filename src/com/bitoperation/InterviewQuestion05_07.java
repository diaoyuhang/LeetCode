package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 配对交换。编写程序，交换某个整数的奇数位和偶数位，
 * 尽量使用较少的指令（也就是说，位0与位1交换，位2与位3交换，以此类推）。
 * num的范围在[0, 2^30 - 1]之间，不会发生整数溢出
 *
 * @Date: 14:31 2020-7-20
 */
public class InterviewQuestion05_07 {
    //将所有奇数位，偶数位分别全部取出
    //然后将所有奇数位左移，所有偶数位右移
    //然后将两个进行或操作
    public int exchangeBits(int num) {
        int odd = num & 0x55555555; // .......1010101010101
        int even = num & 0xaaaaaaaa; // ......0101010101010

        odd <<=1;
        even >>>=1;

        return odd|even;
    }
}
