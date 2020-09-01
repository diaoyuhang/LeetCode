package com.bitoperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: Mr.diao
 * @Description: 所有 DNA 都由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：“ACGAATTCCG”。
 * 在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
 * 编写一个函数来查找目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
 * @Date: 8:36 2020/7/24
 */
public class Question187 {

    //方法一：滑动窗口+hashset
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> one = new HashSet<>();
        HashSet<String> two = new HashSet<>();
        int L = 10, n = s.length();
        for (int i = 0; i < n - L + 1; i++) {
            String tmp =s.substring(i,i+L);
            if (one.contains(tmp))
                two.add(tmp);
            one.add(tmp);
        }

        return new ArrayList<>(two);
    }
}
