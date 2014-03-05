package com.code;

public class Maxn {

	public static void main(String[] args) {
		maxn1(3);
	}
	
	public static void maxn1 (int n){
		int result = 1;
		/*
		for (int i = 0; i < n; i ++){
			result *= 10;
		}*/
		int i = 0;
		while (i ++ < n){
			result *= 10;
		}
		result --;
		
		System.out.println(result);
	}
	
	public static void maxn2 (int n){
	}

}
