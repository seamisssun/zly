package Day22.DvdManger.biz;


import Day22.DvdManger.entity.DVD;
import Day22.DvdManger.entity.DVDinfo;
import Day22.DvdManger.entity.Records;
import Day22.DvdManger.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/17.
 */
public class Manger {
    Scanner sc = new Scanner(System.in);
    private ArrayList<User> userlist;
    private UserManger um;
    private AdminManger am;
    private ArrayList<DVD> dvdlist;
    private ArrayList<Records> recordslist;
    private ArrayList<DVDinfo> infolist;
    private String UserListFile = "G:\\DVD.USER.txt";
    private String DvdListFile = "G:\\DVD.dvd.txt";
    private String RecordListFile = "G:\\DVD.records.txt";
    private String InfoListFile = "G:\\DVD.info.txt";

    public Manger() throws IOException, ClassNotFoundException {
        um = new UserManger();
        am = new AdminManger();
        //userlist = new ArrayList<>();
        //dvdlist = new ArrayList<>();
        //recordslist = new ArrayList<>();
        //infolist = new ArrayList<>();
        ReadUserList();
        ReadDvdList();
        ReadRecordsList();
        ReadInfoList();


    }

    private void ReadInfoList() throws IOException, ClassNotFoundException {
        FileInputStream fos3 = new FileInputStream(InfoListFile);
        ObjectInputStream oos3 = new ObjectInputStream(fos3);
        infolist = (ArrayList<DVDinfo>) oos3.readObject();
        oos3.close();
        fos3.close();

    }

    private void ReadRecordsList() throws IOException, ClassNotFoundException {
        FileInputStream fos2 = new FileInputStream(RecordListFile);
        ObjectInputStream oos2 = new ObjectInputStream(fos2);
        recordslist = (ArrayList<Records>) oos2.readObject();
        oos2.close();
        fos2.close();
    }

    private void ReadDvdList() throws IOException, ClassNotFoundException {
        FileInputStream fos1 = new FileInputStream(DvdListFile);
        ObjectInputStream oos1 = new ObjectInputStream(fos1);
        dvdlist = (ArrayList<DVD>) oos1.readObject();
        oos1.close();
        fos1.close();
    }

    private void ReadUserList() throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream(UserListFile);
        ObjectInputStream oos = new ObjectInputStream(fos);
        userlist = (ArrayList<User>) oos.readObject();
        //System.out.print(userlist.get(0));

        oos.close();
        fos.close();
    }

    /**
     * 用户注册
     */
    public void regist() throws IOException {
        int id = 0;
        id = userlist.size() + 1;//用户id
        System.out.println("请输入用户名");
        String name = sc.next();
        for (int i = 0; i < userlist.size(); i++) {
            if (name.equals(userlist.get(i).getName())) {
                System.out.println("用户名已存在！");
                return;
            }
        }
        System.out.println("请输入密码");
        String password = sc.next();
        User user = new User(id, name, password, "用户");
        userlist.add(user);
        System.out.println(userlist);
        WriteManger();
    }

    /**
     * 用户登录
     */
    public void login() {
        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        int index = -1;
        //  userlist=

        User user = new User();
        for (int i = 0; i < userlist.size(); i++) {
            if (name.equals(userlist.get(i).getName())
                    && password.equals(userlist.get(i).getPassword())) {
                index = 1;
                user = userlist.get(i);
                break;
            }
        }
        if (index != -1) {
            if (user.getType().equals("管理员")) {
                am.info(dvdlist, infolist, recordslist);
            } else {
                um.info(user, dvdlist, infolist, recordslist);
            }
        } else {
            System.out.println("登录失败");
        }
    }


    public void WriteManger() throws IOException {

        /*    list.add(new User(1, "admin", "123", "管理员"));
            list.add(new User(2, "a", "123", "用户"));
            dvdlist.add(new DVD(1,"少林寺",2,"动作",0,0));
            dvdlist.add(new DVD(2,"新少林寺",2,"动作",0,0));
            infolist.add(new DVDinfo(1,1,"可借"));
            infolist.add(new DVDinfo(2,1,"可借"));
            infolist.add(new DVDinfo(3,2,"可借"));
            infolist.add(new DVDinfo(4,2,"可借"));*/
        FileOutputStream fos = new FileOutputStream(UserListFile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(userlist);
        oos.close();
        fos.close();
        FileOutputStream fos1 = new FileOutputStream(DvdListFile);
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        oos1.writeObject(dvdlist);
        oos1.close();
        fos1.close();
        FileOutputStream fos2 = new FileOutputStream(RecordListFile);
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        oos2.writeObject(recordslist);
        oos2.close();
        fos2.close();
        FileOutputStream fos3 = new FileOutputStream(InfoListFile);
        ObjectOutputStream oos3 = new ObjectOutputStream(fos3);
        oos3.writeObject(infolist);
        oos3.close();
        fos3.close();
    }
}







