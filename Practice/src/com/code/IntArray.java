package com.code;

/**
 * 在一个数组中，使所有的奇数都位于偶数前面
 * @author Ivsunshine
 *
 */
public class IntArray {

	public static void main(String[] args) {
		int a[] = {2,5,4,3,8,5,10,25,30,1,5,5};
		getIntArray(a);
	}
	
	public static void getIntArray(int[] array){
		for (int i = 0; i < array.length; i ++){
			System.out.print(array[i] + ",");
		}
		System.out.println();
		int start = 0, end = array.length - 1;
		while (start < end){
			boolean first = (array[start] & 0x1) == 0;
			boolean second = (array[end] & 0x1) == 1;
			if ((array[start] & 0x1) == 0 && (array[end] & 0x1) == 1){//表明前者是奇数，后者是偶数
				//swap(array[start], array[end - 1]);
				int tmp = array[start];
				array[start] = array[end];
				array[end] = tmp;
			}
			if ((array[start] & 0x1) == 1){//表示是奇数的情况下，才增加
				start ++;
			}
			if ((array[end] & 0x1) == 0){//表示是偶数的情况下才减小
				end --;
			}
		}
		
		for (int i = 0; i < array.length; i ++){
			System.out.print(array[i] + ",");
		}
	}
	
	static void condition(){
		
	}
	
	public static void swap (int a, int b){
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
	}

}
