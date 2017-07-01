package Day17.HM;

/**
 * Created by Administrator on 2017/6/12.
 */
public class HM3 {
    public static void main(String[] args) {
        String str="hohroireoirejuirgpjuirgeioufuiewoi";

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.substring(i,(i+1)).indexOf('u')!=-1){
                count++;
            }
        }System.out.println(count+"次");
    }
    }

