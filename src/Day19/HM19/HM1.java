package Day19.HM19;

import java.util.Scanner;

/**从命令行得到5个整数，放入一个整型数组，然后打印输出，要求：如果输入数据不为整数，要捕获Integer.parseInt()
 * 产生的异常，显示“请输入整数”，捕获输入数参数不足5个的异常（数组越界），显示“请输入至少5个整数”。
 * Created by Administrator on 2017/6/14.
 */
public class HM1 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("请输入第" + (i + 1) + "个元素");
                String a = sc.next();
                arr[i]=Integer.parseInt(a);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("请输入5个整数");
        }
        catch (NumberFormatException e){
            System.out.println("请输入整数");

        }
    }
}