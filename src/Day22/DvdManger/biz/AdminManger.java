package Day22.DvdManger.biz;

import Day22.DvdManger.entity.DVD;
import Day22.DvdManger.entity.DVDinfo;
import Day22.DvdManger.entity.Records;
import Day22.DvdManger.entity.User;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/17.
 */
public class AdminManger {
    Scanner sc = new Scanner(System.in);

    public void info(List<DVD> list1, List<DVDinfo> list2, List<Records> list3) {
        boolean flag = true;
        while (flag) {
            System.out.println("进入管理员界面");
            System.out.println("1 用户管理");
            System.out.println("2 DVD管理");
            System.out.println("3 记录管理");
            System.out.println("0 返回上一层");
            System.out.println("请选择");
            String key = sc.next();
            switch (key) {
                case "1":
                    break;
                case "2":
                    dvdmangerinfo(list1, list2, list3);
                    break;
                case "3":
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("选择错误");
                    break;
            }

        }
    }

//    public void usermangerinfo(User user){
//        boolean flag = false;
//        while (flag) {
//            System.out.println("1 查看");
//            System.out.println("2 查找用户");
//            System.out.println("3 修改用户信息");
//            String key = sc.next();
//            switch (key) {
//                case "1":
//                    queryalluser(list);
//                    break;
//                case "2":
//                    queryuser(list);
//                    break;
//                case "3":
//                    mod(list);
//                    break;
//            }
//        }
//
//    }

    public void queryalluser(List<User> list) {
        for (User user : list) {
            System.out.println(user.toString());
        }
    }

    public void queryuser(List<User> list) {
        System.out.println("请输入要查找的用户名");
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                index = i;
                System.out.println(list.get(i));
                break;

            } else {
                System.out.println("没有找到此用户");
            }
        }

    }

    public void mod(List<User> list) {
        System.out.println("请输入要修改的用户名");
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                index = i;
                break;
            } else {
                System.out.println("未找到要修改的数据");
            }
            System.out.println("请输入更改的类型");
            String type = sc.next();
            list.get(index).setType(type);

        }

    }

    public void dvdmangerinfo(List<DVD> list1, List<DVDinfo> list2, List<Records> list3) {
        boolean flag = true;
        while (flag) {
            System.out.println("1 查询所有");
            System.out.println("2 名字查询");
            System.out.println("3 类型查询");
            System.out.println("4 添加");
            System.out.println("5 修改");
            System.out.println("6 移除");
            System.out.println("0 返回上层");
            System.out.println("请选择：");
            String key = sc.next();
            switch (key) {
                case "1":
                    queryall(list1);
                    break;
                case "2":
                    queryname(list1);
                    break;
                case "3":
                    querytype(list1);
                    break;
                case "4":
                    add(list1, list2);
                    break;
                case "5":modm(list1);
                    break;
                case "6":
                    del(list1, list2, list3);
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    return;
            }
        }


    }

    public void queryall(List<DVD> list) {
        for (DVD dvd : list) {
            System.out.println(dvd.toString());
        }

    }

    public int queryname(List<DVD> list) {
        //System.out.println("请输入要查找的DVD名称");
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                index = i;
                break;
            } else {
                System.out.println("未找到此DVD");
            }
        }
        return index;

    }

    public int  querytype(List<DVD> list) {
        System.out.println("请输入要查找的DVD类型");
        String type = sc.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (type.equals(list.get(i).getType())) {
                index = i;
                break;
            } else {
                System.out.println("未找到此DVD");
            }
            System.out.println(list.get(index).toString());
        }
        return index;

    }

    public void add(List<DVD> list1, List<DVDinfo> list2) {
        int id = 0;
        id = list1.get(list1.size() - 1).getId() + 1;
        System.out.println("请输入名称");
        String name = sc.next();
        int count = 0;
        try {
            System.out.println("请输入数量");
            count = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list1.size(); i++) {
            if (name.equals(list1.get(i).getName())) {
                list1.get(i).setCount(list1.get(i).getCount() + count);
                int id1 = 0;
                id1 = list2.get(list2.size() - 1).getId() + 1;
                for (int j = 0; j < count; j++) {
                    list2.add(new DVDinfo(id1, list1.get(i).getId(), "可借"));
                }
                return;
            }
        }
        System.out.println("请输入类型");
        String type = sc.next();
        list1.add(new DVD(id, name, count, type, 0, 0));
        int id1 = 0;
        id1 = list2.get(list2.size() - 1).getId() + 1;
        for (int i = 0; i < count; i++) {
            list2.add(new DVDinfo(id1, id, "可借"));
            id1++;

        }

    }

    public void modm(List<DVD> list) {
        int index = queryname(list);
        if (index == -1) {
            System.out.println("未找到要修改的信息");
        } else {

//            System.out.println("请输入需要更改的ID");
//            int id1=sc.nextInt();
//            list.get(index).setId(id1);
            System.out.println("请输入要更改的名称");
            String name1 = sc.next();
            list.get(index).setName(name1);
//            System.out.println("请输入要更改的数量");
//            int count1=sc.nextInt();
//            list.get(index).setCount(count1);
            System.out.println("请输入要更改的类型");
            String type1 = sc.next();
            list.get(index).setType(type1);
//            System.out.println("请输入要更改的次数");
//            int discount1=sc.nextInt();
//            list.get(index).setDiscount(discount1);
//            System.out.println("请输入要更改的借出数量");
//            int haslended1=sc.nextInt();
//            list.get(index).setHaslended(haslended1);


        }


    }

    public void del(List<DVD> list1, List<DVDinfo> list2, List<Records> list3) {
        System.out.println("请输入要删除的DVD名称");
        int index = queryname(list1);
        int bid = list1.get(index).getId();
        int biid = list2.get(list1.get(index).getId()).getId();


        if (index == -1) {
            System.out.println("未找到需要删除的DVD");
        } else {
            list1.remove(index);
            System.out.println(list1);
        }
        for (int i = 0; i < list2.size(); i++) {
            if (bid == list2.get(i).getBid()) {
                list2.remove(i);
                System.out.println(list2);
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            if (biid == list3.get(i).getBiid()) {
                list3.remove(i);
                System.out.println(list3);
            }
        }


    }


}







