package C10;
import java.util.*;
public class Test3 {

	/**���ģ�	����һ����������a[10]�����Ӽ�������һ��������n��n<=10����
  		�������Ӽ�������n����������a[10](��n��5���������Ӽ���ȡ5��������������)��������¼���n�����е����ֵ����Сֵ���������
  		(Ҫ��̬����ʵ��findMax() findMin())
 		����֪ʶ�㣺����Ķ���ͳ�ʼ���������Ӧ�ã������ĵ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������10��ֵ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("�������"+(i+1)+"��Ԫ��");
			arr[i]=sc.nextInt();
		}
		System.out.println("���ֵ"+findMax(arr));
		System.out.println("��Сֵ"+findMin(arr));
	}
	public static int findMax(int []arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		}return max;
	}
	public static int findMin(int []arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				arr[i]=min;
			}
			
		}return min;
	}

}
