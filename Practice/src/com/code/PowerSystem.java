package com.code;

/**
 * 求一个数的n次方的函数
 * 
 * @author Ivsunshine
 * 
 */
public class PowerSystem {

	public static void main(String[] args) {
		double result = power3(2, 4);
		System.out.println(result);
	}

	/**
	 * 常规的解法
	 * 
	 * @param base
	 * @param exp
	 */
	public static void power1(double base, int exp) {
		double result = 1.0;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		System.out.println(result);
	}

	/**
	 * 综合考虑了各种输入参数后的解法
	 * 
	 * @param base
	 * @param exp
	 * @return
	 */
	public static double power2(double base, int exp) {
		double result = 1.0;
		int tmp = 0;
		if (isEqual(base, 0.0) && exp < 0) {
			return 1.0;
		}
		if (exp < 0) {
			tmp = exp;
			exp = -exp;
		}
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		if (tmp < 0) {
			result = 1.0 / result;
		}
		System.out.println(result);
		return result;
	}

	/**
	 * 判断两个小数是否相等
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static boolean isEqual(double d1, double d2) {
		double tmp = 0.0000001;
		if ((d1 - d2) < tmp && (d2 - d1) < tmp) {
			return true;
		}
		return false;
	}

	/**
	 * 使用递归的方法求解
	 * @param base
	 * @param exp
	 * @return
	 */
	public static double power3(double base, int exp) {
		if (exp == 0) {
			return 1.0;
		}
		if (exp == 1) {
			return base;
		}

		double result = power3(base, exp >> 1);
		// 判断是否为偶数
		result *= result;
		if ((exp & 0x1) == 1) {// 表明是奇数的情况
			result *= base;
		}
		return result;
	}

}
