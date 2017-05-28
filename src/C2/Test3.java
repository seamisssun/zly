package C2;

import java.util.Scanner;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i=1;i<4;i++) {
			System.out.println("欢迎进入菜单注册");
			System.out.println("请选择所需要的功能");
			System.out.println("1 注册" + " " + "2.登录" + " " + "3.退出");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("注册成功");
				break;
			case 2:
				System.out.println("登录成功");
				break;
			case 3:
				System.out.println("欢迎使用");
				//flag=false 循环控制
				return;
			default:
				System.out.println("输入错误");
				break;
			}
			System.out.println("是否继续y/n");
			String answer = sc.next();
			if (answer.equals("n")) {
				break;
			}

		}
	}


	}


