package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * @Date: 8:14 2020/7/17
 */
public class Question1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num !=0) { //说明是偶数
            if((num & 1) == 0){
                num = num >>> 1;
                count++;
            }else{
                num--;
                count++;
            }

        }
        return count;
    }
}
