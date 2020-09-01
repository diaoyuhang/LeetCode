package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 给定一个正整数 n，你可以做如下操作：
 * 1. 如果 n 是偶数，则用 n / 2替换 n。
 * 2. 如果 n 是奇数，则可以用 n + 1或n - 1替换 n。
 * n 变为 1 所需的最小替换次数是多少？
 * @Date: 8:39 2020/8/6
 */
public class Question397 {

    public static void main(String[] args) {
        Question397 question397 = new Question397();
        int i = question397.integerReplacement(7);
        System.out.println(i);
    }

    public int integerReplacement(int n) {
            int count = 0;
            while (n > 1) {
                if ((n & 1) == 0) {
                    n /= 2;
                } else {
                    if (((n + 1) & 3) == 0 && n != 3) {//对3求余为0
                        n = n / 2 + 1;
                        count++;
                    }else{
                        n--;
                    }
                }
                count++;
            }
            return count;
    }
}
