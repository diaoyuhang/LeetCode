package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 设计一个函数把两个数字相加。不得使用 + 或者其他算术运算符。
 * @Date: 15:06 2020-7-20
 */
public class InterviewQuestion17_01 {

    //10101
    //10100 两者相加在不考虑进位的情况下结果为 00001，和异或的结果一样
    //而进位的结果为10100 <<1位 ，进行与操作可得到该结果
    //然后重复，知道进位为0；
    public int add(int a, int b) {
        int carry = (a & b) << 1;
        int result = a ^ b;

        while (carry != 0) {
            int i = result;
            result ^= carry;
            carry &= i;
            carry <<= 1;
        }
        return result;
    }
}
