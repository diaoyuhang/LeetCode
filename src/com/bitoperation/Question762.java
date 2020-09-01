package com.bitoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * 给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
（注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）
 */
public class Question762 {
	public int countPrimeSetBits(int L, int R) {
		boolean[] arrs= {false,false,true,true,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true};
		int result = 0;
		for (int i = L; i <= R; i++) {
			int count = hammingWeight2(i);
			if (arrs[count]) {
				result++;
			}
		}
		return result;
	}

	public int hammingWeight2(int n) {
		int sum = 0;
		while (n != 0) {
			sum++;
			n = n & (n - 1);
		}
		return sum;
	}
}
