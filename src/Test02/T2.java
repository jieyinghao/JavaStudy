package Test02;
/*练习题
 *  1、输出JAVA课考试最高分：98.5 
 *  2、输出最高分学员姓名：张三 
 *  3、输出最高分学员性别：男
  */
/**
 * 
 * @desc 
 * 
 * @Author jieyinghao
 * @2018年4月25日 下午9:39:37 
 
 */
public class T2 {
	 {
	    	double x = 98.5;//98.5是小数，浮点型，用双精度double 声明和赋值合二为一
	    	String y = "张三";//张三是字符串类型，用String,赋值要写在双引号里面""
	    	char z = '男';//男是一个字符型，用char,字符要在单引号里面''
	    	System.out.println("最高成绩："+x);//最高成绩是字符串，x是变量，字符串和变量连接要用加号 +
	    	System.out.println("姓名："+y);
	    	System.out.println("性别："+z);
	    }
}
