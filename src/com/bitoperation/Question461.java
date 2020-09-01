package com.bitoperation;

/*
 *	 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
	给出两个整数 x 和 y，计算它们之间的汉明距离。
	注意：
	0 ≤ x, y < 2^31.
 */
public class Question461 {
	public int hammingDistance(int x, int y) {
		int num = x ^ y;
		int count = 0;
		while (num != 0) {
			if ((num & 1) == 1) {
				count++;
			}
			num >>>= 1;
		}
		return count;
	}
}
