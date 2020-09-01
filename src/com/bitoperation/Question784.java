package com.bitoperation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.diao
 * @Description: 给定一个字符串S，通过将字符串S中的每个字母转变大小写，
 * 我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * @Date: 8:29 2020/7/16
 */
public class Question784 {
    public static void main(String[] args) {
        Question784 question784 = new Question784();
//        System.out.println(question784.letterCasePermutation("adsfsadfasdfa"));
        System.out.println(Integer.toBinaryString('b'));
        System.out.println(Integer.toBinaryString('B'));

    }

    //方法1:依次遍历每个字符
    public List<String> letterCasePermutation1(String s) {
        ArrayList<StringBuilder> arr = new ArrayList<>();
        arr.add(new StringBuilder());
        char[] chars = s.toCharArray();

        for (char c : chars) {
            int length = arr.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < length; i++) {
                    arr.add(new StringBuilder(arr.get(i)));
                    arr.get(i).append(Character.toLowerCase(c));
                    arr.get(i + length).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < length; i++) {
                    arr.get(i).append(c);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            list.add(arr.get(i).toString());
        }
        return list;
    }

    //方法2
    public List<String> letterCasePermutation2(String s) {
        ArrayList<String> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        dfs(list,chars,0);
        return list;
    }
    //使用深度优先遍历
    private void dfs(List<String> res, char[] nums, int depth) {
        if (depth == nums.length) {
            res.add(new String(nums));
            return;
        }

        dfs(res, nums, depth + 1);
        if (nums[depth] >= 'A') {
            //大小写字母的二进制只有第六位是不同的，所以异或上32后，就可以将大写字母转变成小写，或是小写转成大写
            nums[depth] = (char) (nums[depth] ^ 32);
            dfs(res, nums, depth + 1);
        }
    }
}
