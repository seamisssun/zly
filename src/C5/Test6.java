package C5;
import java.util.*;
public class Test6 {

	/** 歌手打分：在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一
	 * 个最低分，然后剩余的8位评委的分数进行平均，就是该选手的最终得分。输入每个评委的评分，求某选
	 * 手的得分。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个评委的打分");
			arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<arr.length;i++){int max=arr[i];
			if(max<arr[i]){max=arr[i];
			
			
		}
	}

}
