package com.code;

/**
 * ��һ������n�η��ĺ���
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
	 * ����Ľⷨ
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
	 * �ۺϿ����˸������������Ľⷨ
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
	 * �ж�����С���Ƿ����
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
	 * ʹ�õݹ�ķ������
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
		// �ж��Ƿ�Ϊż��
		result *= result;
		if ((exp & 0x1) == 1) {// ���������������
			result *= base;
		}
		return result;
	}

}
