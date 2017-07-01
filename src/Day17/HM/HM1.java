package Day17.HM;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/6/12.
 */
public class HM1 {
    public static void main(String []args){
        String []arr={"abc", "yb", "xiaoqianga", "laifu", "wangcai", "oye"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else if(o1.length()<o2.length()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });System.out.println(Arrays.toString(arr));
    }
}
