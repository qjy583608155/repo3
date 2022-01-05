package com.atguigu.exer;

import java.util.Scanner;

/*
 * 
 * 数组冒泡排序
 * 
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int arr[] =new int[6];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<6;i++){
			System.out.println("请输入第"+(i+1)+"个数字");
			arr[i] =scan.nextInt(); 
		}
		//冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
				
				
				
				
				//int temp ;
				//temp = arr[i+1];
			//	arr[i+1]= arr[i];
				//arr[i] = temp;
			   	}
			}
		
			
		}
		//输出数组
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

	
	


