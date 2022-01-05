package com.atguigu.java;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int num = scan.nextInt();
		
		int[] scores = new int[num]; 
		System.out.println("请输入考试成绩：");
		//获取分数
		for(int i=0;i<scores.length;i++){
			scores[i]=scan.nextInt();
		}
		//找最高分
		int max = 0;
		for(int i=0;i<scores.length;i++){
			if(max<scores[i]){
				max = scores[i];
			}
		}
		System.out.println("最高分数为："+max);
		//跟最高成绩比较
		char level ;
		for(int i=0;i<scores.length;i++){
			if(scores[i]>=max-10){
				level = 'A';
			}else if(scores[i]>=max-20){
				level = 'B';
			}else if(scores[i]>=max-30){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("学生"+i+
					"成绩为"+scores[i]+","+"等级为"+level);
		}
		
	}
}
