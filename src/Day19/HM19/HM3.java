package Day19.HM19;

import java.util.Scanner;

/**
 * 在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，如果存在，则返回这个字符在字符数组中
 * 第一次出现的位置（下标），否则，返回-1。要搜索的字符数组和字符都以参数形式传递给该方法，如果传入的数组
 * 为null，就抛出IllegalArgumentException异常。
 * Created by Administrator on 2017/6/14.
 */
public class HM3 {
    public static void main(String[] args) {


        char a = 's';
        char[] arr1=new char[]{'s','d'};
        Method.find(arr1, a);
        char[] arr2=new char[]{'a','d'};
        Method.find(arr2, a);

        char[] arr = null;
       try{
           Method.find(arr, a);
       }catch (IllegalArgumentException e){
           e.printStackTrace();
       }


    }
}

class Method {
    public static void find(char[] arr, char a) {
        int index = -1;
        if (arr == null) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (a == arr[i]) {
                    index = i;
                    break;

                }
            }

        }
        System.out.println(index);

    }
}
