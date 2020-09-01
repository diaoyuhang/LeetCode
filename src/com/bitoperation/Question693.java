package com.bitoperation;

//给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
public class Question693 {
	public static void main(String[] args) {
		Question693 question693 = new Question693();
		System.out.println(question693.hasAlternatingBits(4));
	}

	/*
	 * 如果一个数num1的二进制为1、0交替的，那么将这个数无符号右移得到num2，
	 * num1^num2结果就是为全1的二进制
	 *
	 */
	public boolean hasAlternatingBits(int n) {
		int num1 = n ^ (n >>> 1);
		int num2 = num1 + 1;
		if ((num1 & num2) == 0) {
			return true;
		}
		return false;
	}
}
