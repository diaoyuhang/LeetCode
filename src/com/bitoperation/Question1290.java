package com.bitoperation;

import java.util.ArrayList;

/**
 * @Author: Mr.diao
 * @Description: 给你一个单链表的引用结点?head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * @Date: 7:43 2020/7/17
 */
public class Question1290 {

    //head 的最高位就是二进制的最左边的
    //二进制左移一位就是乘以2
    public int getDecimalValue(ListNode head) {
        /*ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int result = 0;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += (list.get(i) << count);
            count++;
        }*/

        int result=0;
        while(head!=null){
            result = result*2 +head.val;
            head=head.next;
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
