package C5;
import java.util.*;
public class Test4 {

	/**��һ�����У�8��4��2��1��23��344��12ѭ��������е�ֵ��������������ֵ�ĺ�
		    ������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ����������

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{8,4,2,1,23,344,12};
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ���ҵ���");
		int a=sc.nextInt();
		int sum=0;
		int index=-1;
		for(int i=0;i<arr.length;i++){sum+=arr[i];
			System.out.print(arr[i]+" ");
			
		}System.out.println("������ֵ�ĺͣ�"+sum);
		for(int i=0;i<arr.length-1;i++){
			if(a==arr[i]){index=i;break;}
		}
		if(index!=-1){
			System.out.println(index);}
			else{
				System.out.println("�޴���");}
		}
	}


