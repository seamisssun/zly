package Day25;

import java.util.*;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Test10 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer>map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        Random random=new Random();
        for(int i=0;i<50;i++){
            int r=random.nextInt(5)+30;
            if(map.containsKey(r)){
                map.put(r,map.get(r)+1);
            }else{
                map.put(r,1);
            }
        }
        int maxkey=map.firstKey();
        int max=map.get(maxkey);
        Set<Map.Entry<Integer,Integer>>set=map.entrySet();
        for(Map.Entry<Integer,Integer> entry:set){
            if(entry.getValue()>max){
                max=entry.getValue();
                maxkey=entry.getKey();
            }
            System.out.println(entry);



        }
        System.out.println(maxkey+" "+max);




        }

    }

