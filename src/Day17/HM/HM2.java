package Day17.HM;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Created by Administrator on 2017/6/12.
 */
public class HM2 {
    public static void main(String []args)throws ParseException{

        String d1="2015年02月17日";
        String d2="2015年03月29日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");

        Date date1=sdf.parse(d1);
        Date date2=sdf.parse(d2);
        long days=(date2.getTime()-date1.getTime()+1000000)/(3600*24*1000);
        System.out.print(d1+"和"+d2+"之间一共有："+days+"天");
        }
    }
    

