package com.stack;

import java.util.Stack;

/**
 * @Author: Mr.diao
 * @Description: 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * @Date: 9:09 2020/9/3
 */
public class Question1047 {
    public String removeDuplicates(String S) {
        char[] s = S.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (Character c : s) {
            if (characters.isEmpty()) {
                characters.push(c);
            }else{
                if (c==characters.peek()){
                    characters.pop();
                }else{
                    characters.push(c);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!characters.isEmpty())
            stringBuilder.insert(0,characters.pop());

        return stringBuilder.toString();
    }
}
