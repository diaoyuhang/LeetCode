package com.stack;

import java.util.Stack;

/**
 * @Author: Mr.diao
 * @Description: 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。
 * # 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 * @Date: 8:49 2020/9/2
 */
public class Question844 {

    public boolean backspaceCompare(String S, String T) {
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        Stack<Character> l1 = new Stack<>();
        Stack<Character> l2 = new Stack<>();
        int i = 0;
        for (; i < s.length && i < t.length; i++) {
            if ('#' == s[i]) {
                if (l1.size() != 0)
                    l1.pop();
            } else {
                l1.push(s[i]);
            }

            if ('#' == t[i]) {
                if (l2.size() != 0)
                    l2.pop();
            } else {
                l2.push(t[i]);
            }
        }

        while (i < s.length) {
            if ('#' == s[i]) {
                if (l1.size() != 0)
                    l1.pop();
            } else {
                l1.push(s[i]);
            }
            i++;
        }

        while (i < t.length) {
            if ('#' == t[i]) {
                if (l2.size() != 0)
                    l2.pop();
            } else {
                l2.push(t[i]);
            }
            i++;
        }
        if (l1.size() != l2.size())
            return false;
        while (l1.size() != 0) {
            if (l1.pop() != l2.pop())
                return false;
        }
        return true;
    }

}
