package Day25;



import java.util.*;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test1 {
    public static void main(String[] args) {
        String[] ch = new String[]{"chenhao", "zhangsan", "zhangsan", "chenhao", "lisi", "wangwu", "zhaoliu", "xiaoqiang", "haha"};
        TreeMap<String, Integer> map = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() > 0) {
                    return 1;
                } else if (o1.length() - o2.length() < 0) {
                    return -1;
                } else {
                    return o1.compareTo(o2);

                }
            }
        });



        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);

            } else {
                map.put(ch[i], 1);
            }
        }
        Set<Map.Entry<String,Integer>>set=map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }


    }




    }

