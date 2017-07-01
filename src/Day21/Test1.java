package Day21;

import java.util.*;

/**
 * Created by Administrator on 2017/6/16.
 */
public class Test1 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer>map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        Random random=new Random();
   for(int i=0;i<50;i++){
       int a=random.nextInt(6)+30;
       if(map.containsKey(a)){

           map.put(a,map.get(a)+1);
       }else{
           map.put(a,1);
       }
   }
        int maxKey=map.firstKey();
        int max=map.get(maxKey);
        Set<Map.Entry<Integer,Integer>>set=map.entrySet();
        for(Map.Entry<Integer,Integer>entry:set){
            if(entry.getValue()>max){
                max=entry.getValue();
                maxKey=entry.getKey();
            }
            System.out.println(entry);
        }
        System.out.println(maxKey+" "+max);



    }
}
