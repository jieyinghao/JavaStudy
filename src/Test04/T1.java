package Test04;

public class T1 {
	 public static void main(String args[])
	 {
		 int tPrice = 245;
		 int shoePrice = 570;
		 int wangPrice = 180;
		 double total = 1104.0;
		 int factMoney = 1800;
		 double totalMoney = 1200.0;
		 System.out.println("*******消费单********");
		 System.out.println("购物物品\t单价\t个数\t金额");//\t是大空格
		 System.out.println("T恤\t¥"+tPrice+"\t2\t¥"+tPrice*2);
		 System.out.println("网球鞋\t¥"+shoePrice+"\t1\t¥"+shoePrice*1);
		 System.out.println("网球拍\t¥"+wangPrice+"\t1\t¥"+wangPrice*1);
		 System.out.println();
		 System.out.println("折扣：8折");
		 System.out.println("消费总金额"+total);
		 System.out.println("实际缴费"+factMoney);
		 System.out.println("总消费"+totalMoney);
	 }
}
