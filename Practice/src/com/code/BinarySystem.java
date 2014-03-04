package com.code;

public class BinarySystem {

	public static void main(String[] args) {
		binaryNumber2(33);//100001
	}

	// 统计二进制中1的个数
	public static void binaryNumber(int n) {
		int flag = 1;
		int count = 0;
		while (flag > 0 && flag <= n) {
			if ((n & flag) > 0){
				count ++;
			}
			flag = flag << 1;
		}
		
		System.out.println("个数为" + count);
	}
	
	//统计二进制中1的个数的第二种解法
	public static void binaryNumber2 (int n){
		int count = 0;
		while(n > 0){
			count ++;
			n = n & (n - 1); 
		}
		
		System.out.println("个数为" + count);
		
		double d1 = 0.00, d2 = 0.0;
		if (d1 == d2){
			System.out.println("hello");
		}
	}

}
