package com.bitoperation;

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
public class Question231 {

	public static void main(String[] args) {

	}

	/**
	 * 1	0001	0001 & (0001-1)=0000	2^0
	 * 2	0010	0010 & (0010-1)=0000	2^1
	 * 3	0011	0011 & (0011-1)=0001
	 * 4	0100	0100 & (0100-1)=0000	2^2
	 * 5	0101	0101 & (0101-1)=0100
	 *
	 * 所有2^n & (2^n -1) =0 凭此条件可以判断一个数是否为2的幂次方
	 */
	public boolean isPowerOfTwo(int n) {
		if (n > 0 && (n & (n - 1)) == 0) {
			return true;
		}
		return false;
	}
}
