package zj;
import java.util.*;
public class test1 {

	/**
	 * 1.根据年龄判断人的生命期：60岁以上---老年人；40~60岁---中年人；20~40岁---青年人；
	 * 10~20岁---青少年；10岁以下--- 儿童，编程实现
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年龄");
		int age=sc.nextInt();
		int a=age/10;
			switch(a){
			case 10:
			case 9:
			case 8:
			case 7:	
			case 6: System.out.println(age+"是老年人");
				break;
			case 5:
			case 4:System.out.println(age+"是中年人");
			break;
			case 3:
			case 2:System.out.println(age+"是青年人");
			break;
			case 1:System.out.println(age+"是青少年");
			break;
			case 0:System.out.println(age+"是儿童");
			break;
			default:System.out.println("输入错误");
			break;
			}
		}
	}


