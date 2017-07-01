package Day25;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test2 {
    public static void main(String[] args) {
        Random random=new Random();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<51;i++){
            int a=random.nextInt(5)+30;
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }else{
                hm.put(a,1);
            }

        }

    }


}
