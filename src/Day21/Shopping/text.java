package Day21.Shopping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/6/16.
 */
public class text {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shopping shop=new Shopping();

        ArrayList<commodity> com = new ArrayList<>();

        com.add(new commodity(0, "金罐王老吉", 5));
        com.add(new commodity(1, "可口可乐", 3.5));
        com.add(new commodity(2, "七喜", 3));
        com.add(new commodity(3, "贝纳颂咖啡", 7.8));
        com.add(new commodity(4, "味全优酪乳", 7));
        com.add(new commodity(5, "百岁山矿泉水", 3));
//        System.out.println(com);
        TreeMap<commodity,Integer>map=new TreeMap<>(new Comparator<commodity>() {
            @Override
            public int compare(commodity o1, commodity o2) {
                return o1.getId()-o2.getId();
            }
        });
        while(true){
            System.out.println("1  查看商品列表");
            System.out.println("2  添加商品");
            System.out.println("3  删除商品");
            System.out.println("4  修改商品");
            System.out.println("5  查看购物车");
            System.out.println("6  退出");
            int key=sc.nextInt();
            switch(key){
                case 1:  System.out.println(com);
                    break;
                case 2:
                    shop.add(com,map);
                    break;
                case 3:
                    shop.del(map,com);
                    break;
                case 4:shop.mod(map,com);
                    break;
                case 5:shop.print(map);
                    break;
                case 6:
                    return;



            }
        }
        
    }

}