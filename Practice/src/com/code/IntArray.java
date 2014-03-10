package com.code;

/**
 * ��һ�������У�ʹ���е�������λ��ż��ǰ��
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
			if ((array[start] & 0x1) == 0 && (array[end] & 0x1) == 1){//����ǰ����������������ż��
				//swap(array[start], array[end - 1]);
				int tmp = array[start];
				array[start] = array[end];
				array[end] = tmp;
			}
			if ((array[start] & 0x1) == 1){//��ʾ������������£�������
				start ++;
			}
			if ((array[end] & 0x1) == 0){//��ʾ��ż��������²ż�С
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
