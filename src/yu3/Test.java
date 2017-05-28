package yu3;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入数学成绩（满分100）");
    double math=sc.nextDouble();
    System.out.println("请输入语文成绩（满分100）");
    double ch=sc.nextDouble();
    System.out.println("请输入英语成绩（满分100）");
    double en=sc.nextDouble();
    double sum=math+ch+en;
    double svn=sum/3;
    System.out.println("总分："+sum+"    平均分"+svn);
    
    
    
	}

}
