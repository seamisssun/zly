package zj;
import java.util.*;
public class Test4 {

	/**
	 * 编写代码实现判断某年某月共几天。算法提示：
	 *  d)月份可以用长度12的数组记录，也可以用switch-case 
	 *  e)2月份需要判断是否闰年
	 * f)需要用静态方法实现
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年");
		int year=sc.nextInt();
		System.out.println("请输入月");
		int month=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0)){
			if(month==2){System.out.println(year+"年"+month+"月有29天");}
		}else{System.out.println(year+"年"+month+"月有28天");}
		switch(month){
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(year+"年"+month+"月有30天");
		break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(year+"年"+month+"月有31天");
		break;
		
		}
	}

}
