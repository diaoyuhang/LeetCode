package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。
 * @Date: 14:25 2020-7-20
 */
public class InterviewQuestion05_06 {

    public int convertInteger(int A, int B) {
        A = A ^ B;
        int count = 0;
        while (A != 0) {
            A = A&(A-1);
            count++;
        }

        return count;
    }
}
