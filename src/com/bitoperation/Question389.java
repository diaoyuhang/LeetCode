package com.bitoperation;

/*
 *	 给定两个字符串 s 和 t，它们只包含小写字母。

	字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

	请找出在 t 中被添加的字母。
 */
public class Question389 {

	// 使用异或的性质，相同为0，不同为1，将所有的字符都异或，就会剩下那个添加的字母
	public char findTheDifference(String s, String t) {
		char result = 0;
		char[] charArray = s.toCharArray();
		char[] charArray2 = t.toCharArray();
		for (char c : charArray2) {
			result ^= c;
		}
		for (char c : charArray) {
			result ^= c;
		}
		return result;
	}

}
