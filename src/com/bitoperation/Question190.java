package com.bitoperation;

//颠倒给定的32位无符号整数的二进制位
public class Question190 {
	public static void main(String[] args) {
		Question190 question190 = new Question190();
		System.out.println(question190.reverseBits02(43261596));
	}

	// 方法一：直接按位颠倒，使用循环
	public int reverseBits01(int n) {
		int result = 0;
		int count = 31;
		while (count >= 0) {
			// （n&1）取得n二进制位上最右侧的数
			// （n&1）<< count 将取得的最右侧的数左移对应的位数
			result += (n & 1) << count;
			count--;
			n = n >> 1;
		}
		return result;
	}

	// 方法二:题目给定位数为32位，用分治法；
	public int reverseBits02(int  n) {
		//0xff00ff00 =>11111111 00000000 11111111 00000000
		//1、左右16位对半，然后位移颠倒
		n = (n >>> 16) | (n << 16);
		//2、左右8位对半，位移颠倒
		n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
		//3、左右4位为对半...
		n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
		//4、2位
		n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
		//5、1位
		n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
		return n;
	}
}
