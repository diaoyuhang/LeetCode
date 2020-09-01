package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 插入。给定两个32位的整数N与M，以及表示比特位置的i与j。
 * 编写一种方法，将M插入N，使得M从N的第j位开始，到第i位结束。
 * 假定从j位到i位足以容纳M，也即若M = 10 011，那么j和i之间至少可容纳5个位。
 * 例如，不可能出现j = 3和i = 2的情况，因为第3位和第2位之间放不下M
 * @Date: 8:01 2020/7/19
 */
public class InterviewQuestion05_01 {

    public static void main(String[] args) {
        InterviewQuestion05_01 question0501 = new InterviewQuestion05_01();
        System.out.println(Integer.toBinaryString(1143207437));
        System.out.println(Integer.toBinaryString(1017033));
        int i = question0501.insertBits(1143207437, 1017033, 11, 31);
        System.out.println(i);

    }

    //将i~j位的二进制置为0，
    //然后将M左移i位
    //最后将M覆盖到N上，也就是加
    public int insertBits(int N, int M, int i, int j) {
        for (int k = i; k <= j; k++) {
            if ((N & (1 << k)) == (1 << k)) {
                N = N - (1 << k);
            }
        }
        N += (M<<i);
        return N;

//        int mask = ((1 << (j - i + 1)) - 1) << i;
//        mask = ~mask;
//        N &= mask;
//        M = M << i;
//        return M | N;
    }
}
