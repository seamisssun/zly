package Day12.DVD;

import Day12.DVD.Dvd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dvdmanger {

	public void add(Dvd[] dvds) {

		Scanner sc = new Scanner(System.in);
		int id = 0;
		System.out.println("name");
		String name = sc.next();
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] != null) {
				if (name.equals(dvds[i].getName())) {
					System.out.println("DVD已存在");
					return;
				}
			}
		}
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] == null) {
				/*System.out.println("id");
				int id = sc.nextInt();
				System.out.println("name");
				String name = sc.next();
				System.out.println("lengCount");
				int lengCount = sc.nextInt();
				System.out.println("lendDate");
				String lendDate = sc.next();
				System.out.println("status");
				String status = sc.next();*/
				id = i + 1;
				dvds[i] = new Dvd(id, name, 0, null, "可借");
				System.out.println("添加成功");
				break;
			}
		}

	}

	public void print(Dvd[] dvds) {
		for (Dvd dvd : dvds) {
			if (dvd != null) {
				System.out.println(dvd.toString());
			}
		}
	}

	public int find(Dvd[] dvds, String name) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("请输入要查找的DVD名字");

		int index = -1;
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] != null) {
				if (name.equals(dvds[i].getName())) {
					index = i;
					break;
				}
			}


		}
		return index;

	}


	public void del(Dvd[] dvds) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除的DVD名称");
		String name = sc.next();
		int index=find(dvds,name);
		if (index == -1) {System.out.println("未找到要删除的DVD");
		}else{
			for (int i = 0; i < dvds.length; i++) {

				if (i > index) {
					/*Dvd d=new Dvd();
					d=dvds[i];
					d.setId(i);*/
					//System.out.println(i);
					dvds[i - 1] = dvds[i];
					if(dvds[i-1]!=null){
					dvds[i - 1].setId(i);}

				}
			}dvds[dvds.length-1]=null;
		}
	}

	public void borrow(Dvd[] dvds) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要借的DVD名称");
		String name = sc.next();
		int index = find(dvds, name);
		if (index == -1) {
			System.out.println("DVD不存在");
		} else {
			Dvd dvd = dvds[index];


			if (dvd.getStatus().equals("可借")) {
				dvd.setLengcount(dvd.getLengCount() + 1);
				dvd.setStatus("借出");
				System.out.println("请输入借的日期");
				String date = sc.next();
				dvd.setLendDate(date);
				dvds[index]=dvd;
				System.out.println("借出成功");
			}else{
				System.out.println("已借出");
			}
		}
	}

	public void back(Dvd[] dvds){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要归还的DVD名称");
		String name = sc.next();
		int index=find(dvds,name);
		if(index==-1){
			System.out.println("未找到要归还的记录");
		}else{ Dvd dvd=dvds[index];
			if (dvd.getStatus().equals("借出")) {
				dvd.setStatus("可借");
				dvd.setLendDate(null);
				System.out.println("归还成功");
			}else{
				System.out.println("归还未成功");
			}
		}
	}
	public void sort(Dvd []dvds){
		Arrays.sort(dvds, new Comparator<Dvd>() {
			@Override
			public int compare(Dvd o1, Dvd o2) {
				return o1.getLengCount()-o2.getLengCount();
			}
		});
		for(Dvd dvd:dvds){
			System.out.println(dvd.toString());
		}
	}
}
