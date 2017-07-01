package Day12.DVD;

import Day12.DVD.Dvd;
import Day12.DVD.Dvdmanger;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Dvd[]dvds=new Dvd[100];
		Dvdmanger dvd=new Dvdmanger();
		while(true){
		System.out.println("1 新增");
		System.out.println("2 查看");
		System.out.println("3 删除");
		System.out.println("4 借出");
		System.out.println("5 归还");
		System.out.println("6 排行榜");
		System.out.println("7 退出");
		System.out.println("请选择");
		String key=sc.next();
	switch(key){
	
	case "1": dvd.add(dvds);
		break;
	case "2":dvd.print(dvds);
		break;
	case "3":dvd.del(dvds);
		break;
	case "4":dvd.borrow(dvds);
		break;
	case "5":dvd.back(dvds);
		break;
	case "6":dvd.sort(dvds);
		break;
		case "7":
		return;}
	}

}
}