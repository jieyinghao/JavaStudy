package Test04;

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
 * @2018年4月27日 下午9:41:31 
 
 */
public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//这句话是键盘的录入，我们录入数字的准备，要引用这个工具
		System.out.println("请输入4位会员卡号:");
		//真正录入的地方
		int vip = input.nextInt();
		//12.34
		int ge = vip%10;
		int shi =vip/10%10;
		int bai =vip/100%10;
		int qian=vip/1000;
		int total=ge+shi+bai+qian;
		System.out.println("各个之和："+total);
		boolean isNo = total>20;
		System.out.println("是幸运用户吗？"+isNo);
		
	}

}
