package Day20.HM20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/15.
 */
public class HM1 {
    public static void main(String[] args) {
    String []name={"chenhao","zhangsan","zhangsan","chenhao","lisi","wangwu","zhaoliu","xiaoqiang","haha"};
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<name.length;i++){

            if(map.containsKey(name[i])){
                int count=map.get(name[i]);
                map.put(name[i],map.get(name[i])+1);
            }else{
                map.put(name[i],1);
            }

        }
        Set<Map.Entry<String,Integer>>set=map.entrySet();
        for(Map.Entry<String,Integer>entry:set){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
    }
}
