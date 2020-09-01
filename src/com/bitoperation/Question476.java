package com.bitoperation;

//给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
public class Question476 {
	public static void main(String[] args) {
		Question476 question476 = new Question476();
		System.out.println(question476.findComplement(5));
	}

	public int findComplement(int num) {
		int result = 0;
		int count = 0;
		while (num != 0) {

			if ((num & 1) == 0) {
				result += 1 << count;
			}
			count++;
			num >>>= 1;
		}

		return result;
	}
}
