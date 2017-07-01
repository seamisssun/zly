package Day21.Shopping;

import java.util.*;

/**
 * Created by Administrator on 2017/6/16.
 */
public class Shopping {
    Scanner sc=new Scanner(System.in);
    public void add(ArrayList<commodity>com,TreeMap<commodity,Integer> map){
        System.out.println("请输入需要商品的编号");
        int id=sc.nextInt();
        for(int i=0;i<com.size();i++){
            if(id==com.get(i).getId()){
                if(map.containsKey(com.get(i))){
                    map.put(com.get(i),map.get(com.get(i))+1);
                }else{
                    map.put(com.get(i),i);
                }
            }
        }
    }
    public void print(TreeMap<commodity,Integer>map){
        Set<Map.Entry<commodity,Integer>> inte=map.entrySet();
        for (Map.Entry<commodity,Integer> it:inte){
            double top=it.getKey().getPrice()*it.getValue();
            System.out.println(it.getKey()+",数量"+it.getValue()+",总价"+top);
        }
    }

    public void del(TreeMap<commodity,Integer>map,ArrayList<commodity>com){
        print(map);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的商品的编号：");
        int id=sc.nextInt();
        for(int i=0;i<map.size();i++){
            if(id==com.get(i).getId()){
                if(map.containsKey(com.get(i))){
                    map.remove(com.get(i));
                    System.out.println("修改成功");
                }else{
                    System.out.println("购物车中没有此商品");
                }
            }
        }
    }
    public void mod(TreeMap<commodity,Integer>map,ArrayList<commodity>com){
        System.out.println("请输入需要修改的商品编号");
        int id=sc.nextInt();
        System.out.println("请输入需要的商品数量");
        int count=sc.nextInt();
        for(int i=0;i<com.size();i++){
            if(id==com.get(i).getId()){
                if(map.containsKey(com.get(i))){
                    map.put(com.get(i),count);
                }else{
                    System.out.println("购物车中没有此商品");
                }
            }
        }
    }
    }











