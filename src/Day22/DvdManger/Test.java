package Day22.DvdManger;

import Day22.DvdManger.biz.Manger;
import Day22.DvdManger.entity.DVD;
import Day22.DvdManger.entity.DVDinfo;
import Day22.DvdManger.entity.User;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/17.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Manger m = new Manger();
        m.WriteManger();

        while (flag) {
            System.out.println("DVD租赁商城");
            System.out.println("***1  注册***");
            System.out.println("***2  登录***");
            System.out.println("***3  退出***");
            System.out.println("请选择：");
            String key = sc.next();
            switch (key) {
                case "1":
                    m.regist();
                    break;
                case "2":
                    m.login();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("选择错误");
            }
            break;
        }
    }


}
