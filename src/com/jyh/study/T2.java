package com.jyh.study;

import java.util.Scanner;

/*应用题
	 * 请输入4位会员卡号：
	 * 1234
	 * 会员卡号3569各位之和：23
	 * 是幸运用户吗？true
	 */
/**
 * 
 * @desc 
 * 
 * @Author jieyinghao
 * @2018年4月27日 下午9:14:15 
 
 */
	public class T2 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);//这句话是键盘的录入，我们录入数字的准备，要引用这个工具
			System.out.println("请输入4位会员卡号:");
			//真正录入的地方
			int vip = input.nextInt();
			//1234
			int ge = vip%10;//1234要取个位数的话，等于123.4，取余，就是4
			int shi =vip/10%10;//1234要取十位数的话，1234除以10取整数=123，除以10取余，就是12.3取余3
			int bai =vip/100%10;
			int qian=vip/1000;
			int total=ge+shi+bai+qian;
			System.out.println("各个之和："+total);
			boolean isNo = total>20;
			System.out.println("是幸运用户吗？"+isNo);
			
		}

	}
