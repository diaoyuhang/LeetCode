package com.bitoperation;

//给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
public class Question342 {
	public static void main(String[] args) {
		Question342 question342 = new Question342();
		System.out.println(question342.isPowerOfFour(16));
	}

	/*
	 * 	先判断是否是2的幂次方，如果不是就直接返回false
	 * 	4的幂次方的值会出现在 .....10101010101这些1的位置上
	 * 	所以当&......1010101010结果必然是为0
	 *
	 */
	public boolean isPowerOfFour(int num) {
		if (num > 0 && (num & (num - 1)) == 0) {
			if ((num & 0xaaaaaaaa) == 0) {
				return true;
			}
		}

		return false;
	}
}
