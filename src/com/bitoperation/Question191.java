package com.bitoperation;

//编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
public class Question191 {

	public static void main(String[] args) {
		Question191 question191 = new Question191();
		System.out.println(question191.hammingWeight2(4));
	}

	// 方法1：通过将n&1得到最左边是否为1，然后将n进行无符号右移一位，在进行同样的&操作，知道n为0
	public int hammingWeight1(int n) {
		int sum = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				sum++;
			}
			n = n >>> 1;
		}

		return sum;
	}

	/*方法二：
	 * 比如：10010110 - 1
	 * = 10010101
	 *
	 * 然后将	10010110
	 *		10010101 &
	 *		10010100
	 *这时候就得知其中一位为1，然后在重复进行两部操作，直到n=0；
	 */
	public int hammingWeight2(int n) {

		int sum=0;
		while(n!=0) {
			sum++;
			n=n&(n-1);
		}
		return sum;
	}
}
