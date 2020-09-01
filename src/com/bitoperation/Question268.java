package com.bitoperation;

//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
public class Question268 {
	public static void main(String[] args) {

	}

	/*例如：
	 * value	0 1 2 3 5
	 * index	0 1 2 3 4 (5)
	 * 异或操作满足交换律和结合律的
	 * 如果数组中一个值都没有的少的话，value异或对应的index得到的值应该为0
	 *
	 * result = 0^0^1^1^2^2^3^3^5^4^5
	 * 		= (0^0)^(1^1)^(2^2)^(3^3)^(5^5)^4
	 * 		= 0^0^0^0^4
	 * 		= 4
	 */
	public int missingNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= i ^ nums[i];
		}
		result ^= nums.length;
		return result;
	}

	//别的解法：1：先排序，然后循环一次数组就可以找到缺失的数字
	//2：或者是使用hash表进行保存数组，然后从表中查找0-n所有的数字
}
