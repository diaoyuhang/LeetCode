package com.bitoperation;

/**
 * @Author: Mr.diao
 * @Description: 给定一个字符串数组 words，找到 length(word[i]) * length(word[j]) 的最大值，
 * 并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。
 * @Date: 8:26 2020/7/31
 */
public class Question318 {
    public int maxProduct(String[] words) {
        int n = words.length;

        int[] masks = new int[n];
        int[] lens = new int[n];

        for (int i = 0; i < words.length; i++) {
            int bitmask = 0;
            for (char c : words[i].toCharArray()) {
                bitmask |= 1 << (c - 'a');
            }
            masks[i] = bitmask;
            lens[i] = words[i].length();
        }

        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    result = Math.max(result, lens[i] * lens[j]);
                }
            }
        }
        return result;
    }
}
