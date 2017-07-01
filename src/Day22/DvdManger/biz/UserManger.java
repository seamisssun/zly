package Day22.DvdManger.biz;

import Day22.DvdManger.entity.DVD;
import Day22.DvdManger.entity.DVDinfo;
import Day22.DvdManger.entity.Records;
import Day22.DvdManger.entity.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/17.
 */
public class UserManger {
    AdminManger am;
    Scanner sc=new Scanner(System.in);
    public void info(User user,List<DVD>list1,List<DVDinfo>list2,List<Records>list3){
        boolean flag=true;
        while (flag){
        System.out.println("进入用户界面");
        System.out.println("1 查看所有");
        System.out.println("2 名字查询");
        System.out.println("3 类型查询");
        System.out.println("4 借");
        System.out.println("5 还");
        System.out.println("6 查看用户信息");
        System.out.println("7 查看借还记录");
        System.out.println("0 返回上层");
            String key=sc.next();
            switch (key){
                case "1": queryall(list1);
                    break;
                case "2":queryname(list1);
                    break;
                case "3":querytype(list1);
                    break;
                case "4":lend(user, list1, list2, list3);
                    break;
                case "5":back(user, list1, list2, list3);
                    break;
                case "6":uersinfo(user);
                    break;
                case "7":
                    break;
                case "0":
                    flag=false;
                    break;
                default:

                    return;


            }



        }
    }
    public void queryall(List<DVD>list){
        for(DVD dvd:list){
            System.out.println(dvd.toString());
        }

    }
    public void lend(User user,List<DVD>list1,List<DVDinfo>list2,List<Records>list3){
        System.out.println("请输入要租借的DVD名称");
        String name=sc.next();
        int index=-1;
        for(int i=0;i<list1.size();i++){
        if(name.equals(list1.get(i).getName())){
            index=i;
            break;
        }
        }
        if(index!=-1){
            if(list1.get(index).getCount()>0){
        int bid=list1.get(index).getId();
                for(int i=0;i<list2.size();i++){
                    if(bid==list2.get(i).getBid()){
                    if(list2.get(i).getState().equals("可借")){
                        list2.get(i).setState("借出");
                        System.out.println(list1);
                        int count=list1.get(index).getCount();
                        list1.get(index).setCount(count - 1);
                        int discount=list1.get(index).getDiscount();
                        list1.get(index).setDiscount(discount+1);
                        int haslended=list1.get(index).getHaslended();
                        list1.get(index).setHaslended(haslended + 1);
                        System.out.println(list1);
                        int id=0;
                        if(list3.size()>0){
                            id=list3.get(list3.size()-1).getId()+1;
                        }else{
                            id=1;
                        }
                        int uid=user.getId();
                        int biid=list2.get(i).getId();
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
                        String lendTime=sdf.format(new Date());
                        list3.add(new Records(id,uid,biid,lendTime, null));
                        System.out.println(list3);
                        break;

                    }
                    }
                }

            }else{
                System.out.println("此DVD无库存");
            }
        }else{
            System.out.println("未找到需要的DVD");
        }
    }
    public void back(User user,List<DVD>list1,List<DVDinfo>list2,List<Records>list3){
        System.out.println("请输入要归还的DVD名称");
        String name=sc.next();
        int index=-1;
        for(int i=0;i<list1.size();i++){
            if(name.equals(list1.get(i).getName())){
                index=i;
                break;
            }
        }
        if(index!=-1){
           int bid=list1.get(index).getId();
            for(int i=0;i<list2.size();i++){
                if(bid==list2.get(i).getId()){
                   list2.get(i).getState().equals("借出");
                    list2.get(i).setState("可借");
                    System.out.println("list2");
                    int count=list1.get(index).getCount();
                    list1.get(index).setCount(count + 1);
                    int discount=list1.get(index).getDiscount();

                    int haslended=list1.get(index).getHaslended();
                    list1.get(index).setHaslended(haslended-1);
                    System.out.println(list1);
                    int id=0;
                    id=0;
                    if(list3.size()>0){
                        id=list3.get(list3.size()-1).getId()+1;
                    }else{
                        id=1;
                    }int uid=user.getId();
                    int biid=list2.get(i).getId();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
                    String returnTime=sdf.format(new Date());
                    list3.add(new Records(id,uid,biid,null, returnTime));
                    System.out.println(list3);
                    break;
                }
            }


        }else{
            System.out.println("未找到要归还的DVD");
        }
    }
    public void uersinfo(User user){
        System.out.println(user.toString());

    }
    public void queryrecords(User user,List<Records>list){


    }
    public int queryname(List<DVD>list){
        //System.out.println("请输入要查找的DVD名称");
        String name=sc.next();
        int index=-1;
        for(int i=0;i<list.size();i++){
            if(name.equals(list.get(i).getName())){
                index=i;
                break;
            }else{
                System.out.println("未找到此DVD");
            }
        }return index;

    }
    public void querytype(List<DVD>list){
        System.out.println("请输入要查找的DVD类型");
        String type=sc.next();
        int index=-1;
        for(int i=0;i<list.size();i++){
            if(type.equals(list.get(i).getType())){
                index=i;
                break;
            }else{
                System.out.println("未找到此DVD");
            }
        }System.out.println(list.get(index).toString());

    }


}
