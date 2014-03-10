package com.code;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 打印从1到N的数字
 * 
 * @author Ivsunshine
 * 
 */
public class BigNumber2 {

	public static void main(String[] args) {
		BigNumber2 p = new BigNumber2();
		p.print(3);
	}

	public void print(int n) {
		char[] result = new char[n];
		printHelpRecursive(result, n, 0);
	}

	// from result[0] to result[n-1],set 0-9 into it
	public void printHelpRecursive(char[] result, int length, int index) {
		System.out.println(index+"-------");
		if (index == length) {
			printNumber(result);
		} else {
			for (int i = 0; i <= 9; i++) {
				result[index] = (char) ('0' + i);
				printHelpRecursive(result, length, index + 1);
			}
		}
	}

	// don't print the prefix '0'.e.g,when "0012",print "12"
	public void printNumber(char[] re) {
		int len = re.length;
		boolean canPrint = false;
		for (int i = 0; i < len - 1; i++) {
			if (!canPrint && re[i] != '0') {
				canPrint = true;
			}
			if (canPrint) {
				System.out.print(re[i]);
			}
		}
		System.out.println(re[len - 1]);// the last bit is always printed.
	}

}
