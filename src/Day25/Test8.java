package Day25;

import java.util.*;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Test8 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add(new String("chenhao"));
        list.add(new String("zhangsan"));
        list.add(new String("zhangsan"));
        list.add(new String("chenhao"));
        list.add(new String("lisi"));
        list.add(new String("wangwu"));
        list.add(new String("zhaoliu"));
        list.add(new String("xiaoqiang"));
        list.add(new String("haha"));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        TreeMap<String,Integer>map=new TreeMap<>();
        for(int i=0;i<list.size();i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1);
            }else{
                map.put(list.get(i),1);
            }
        }
    Set<Map.Entry<String,Integer>>set=map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


        }
    }

