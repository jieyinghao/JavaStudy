package com.jyh.study;

import java.util.Scanner;
/**
 * 
 * @desc 
 * 
 * @Author jieyinghao
 * @2018年4月27日 下午9:00:24 
 
 */
public class InputTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String s = "";
		int a,b;
		while(in.hasNextInt()) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a+b);
		}
	}

}
