package com.code;

/**
 * �ҵ������еĵ�k������ģ���������ĵ�k���ڵ�
 * @author Ivsunshine
 *
 */
public class FindKinArray {

	public static void main(String[] args) {
		int [] a = {1,2,4,3,5,7};
		getTheKNumber(a, 3);
	}
	
	static void getTheKNumber (int [] array, int k){
		printArray(array);
		int point1 = 0, point2 = 0;
		int i = 0, j = 0;
		//��һ��ָ���ƶ���k - 1��λ����
		while (i < k -1){
			point1 = array[i];
			i ++;
		}
		while (i <= array.length - 1){
			point1 = array[i];
			point2 = array[j];
			i ++;
			j ++;
		}
		System.out.println(point1 + "-" + point2);
	}
	
	static void printArray(int [] array){
		for (int i = 0; i < array.length ; i ++){
			System.out.print(array[i] + ",");
			System.out.println();
		}
	}

}
