package com.code;

public class BinarySystem {

	public static void main(String[] args) {
		binaryNumber2(33);//100001
	}

	// ͳ�ƶ�������1�ĸ���
	public static void binaryNumber(int n) {
		int flag = 1;
		int count = 0;
		while (flag > 0 && flag <= n) {
			if ((n & flag) > 0){
				count ++;
			}
			flag = flag << 1;
		}
		
		System.out.println("����Ϊ" + count);
	}
	
	//ͳ�ƶ�������1�ĸ����ĵڶ��ֽⷨ
	public static void binaryNumber2 (int n){
		int count = 0;
		while(n > 0){
			count ++;
			n = n & (n - 1); 
		}
		
		System.out.println("����Ϊ" + count);
		
		double d1 = 0.00, d2 = 0.0;
		if (d1 == d2){
			System.out.println("hello");
		}
	}

}
