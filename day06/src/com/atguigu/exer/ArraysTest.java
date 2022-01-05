package com.atguigu.exer;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		// boolean equals(int[] a,int[] b) 判断两个数组是否相等。
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 1, 3, 2, 4 };
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);

		// String toString(int[] a) 输出数组信息。

		int arr3[] = { 12, 2, 65, 98, 44 };
		String toStr = Arrays.toString(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		// void fill(int[] a,int val) 将指定值填充到数组之中。
		Arrays.fill(arr2, 007);
		System.out.println(Arrays.toString(arr2));

		// void sort(int[] a) 对数组进行排序。
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		// int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值。
		int bin = Arrays.binarySearch(arr3, 44);
		
		System.out.println(bin);
	}
}
