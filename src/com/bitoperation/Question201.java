package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
 * @Date: 8:22 2020/7/27
 */
public class Question201 {

    //如果将所有数字进行与操作，会超过系统所给定的时间限制
    //方法一：二进制进行与操作的时候，只要是0，那么该二进制位永远是0
    //换句话说就是找到相同的二进制位
    public int rangeBitwiseAnd(int m, int n) {

        while (m < n) {
            //把最右的1去掉，直到找到二进制的公共字符串
            n = n & (n - 1);
        }
        return m & n;
    }
}
