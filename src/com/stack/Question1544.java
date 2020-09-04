package com.stack;

import java.util.Stack;

/**
 * @Author: Mr.diao
 * @Description: 给你一个由大小写英文字母组成的字符串 s 。
 * 一个整理好的字符串中，两个相邻字符 s[i] 和 s[i + 1] 不会同时满足下述条件：
 * 0 <= i <= s.length - 2
 * s[i] 是小写字符，但 s[i + 1] 是相同的大写字符；反之亦然 。
 * 请你将字符串整理好，每次你都可以从字符串中选出满足上述条件的 两个相邻 字符并删除，直到字符串整理好为止。
 * 请返回整理好的 字符串 。题目保证在给出的约束条件下，测试样例对应的答案是唯一的。
 * 注意：空字符串也属于整理好的字符串，尽管其中没有任何字符。
 * @Date: 9:21 2020/9/4
 */
public class Question1544 {
    public static void main(String[] args) {
        String leetcode = makeGood("leetcode");
        System.out.println(leetcode);
    }

    public static String makeGood(String s) {
        Stack<Character> characters = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (characters.isEmpty()) {
                characters.push(c);
            } else if ((c - 32) == characters.peek() || (c + 32) == characters.peek()) {
                characters.pop();
            } else {
                characters.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!characters.isEmpty()) {
            result.insert(0, characters.pop());
        }
        return result.toString();
    }

}
