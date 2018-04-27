package Test03;
/**
 * 
 * @desc 
 * 
 * @Author jieyinghao
 * @2018年4月26日 下午9:40:05 
 
 */
public class T1 {
	public static void main(String args[]){
		  int days =123;//变量days123天
		  int week=days/7;//表达式days/7赋值给变量week,切记赋值是右边的表达式赋值给昨天的变量
		  System.out.println(week);//输出变量week,即123天有几周
		  int yuDay =days%7;//表达式days%7赋值给变量yuweek,%符号表示为余，意思是123天除了17周外余了多少天
		  System.out.println(yuDay);
		  System.out.println("-------------");
		  double r=1.5;//小数取双精度浮动型double
		 double s=3.14*r*r;//JAVA里没有平方的概念，所以用r*r表示r的平方
		 System.out.println("半径为1.5的圆的面积="+s);
		 System.out.println("-------------");
	//2.3.2关系运算符，有>,<,>=,<=,==,!=
	//应用题，10大于99吗？
		 boolean a = 10>99;//判断用布尔型boolen,
		 System.out.println(a);//布尔型输出的结果是true和flase真和假
		 System.out.println("-------------");
	//2.3.3逻辑运算符
		 /*
		  *与&&     所有条件满足
		  *或||     其中一个条件满足即可
		  *非 ！                     取反的意思
		  */
	//应用题，高富帅，高必须180cm以上,富150w以上,帅,颜值60分以上
		 int height =175;
		 int money =1000;
		 int face=80;
		 boolean highRichHumson=height >180 || money > 180 && face >60;
		 System.out.println(highRichHumson);
		 System.out.println("-------------");
	//三目（三元）运算
	/*布尔类型表达式          ?  值1  :  值2
	 *int i=10>5  ?  1   :  2        因为10是大于5的是正确，正确取值1,所以输出是1
	 *int j=10!=10?  10  :  0       因为10是等于10的，所以10不等于10是错误的，取值二，所以输出为0
	 */
	    int i =10>5 ? 1 :2;
	    int j =10!=10 ? 2 : 4;
	    System.out.println(i);
	    System.out.println(j);
	  }
}
