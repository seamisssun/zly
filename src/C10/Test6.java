package C10;

import java.util.Scanner;

public class Test6 {

	/**
	 * �Զ��峤��Ϊ5�����鲢��ʼ�����������в���һ������ ���������������з����±꣬����������뵽��
	 * ���ĩβ�� (Ҫ���þ�̬����ʵ��)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		int []arr1=new int[arr.length+1];
		int index=-1;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"��Ԫ��");
			arr[i]=sc.nextInt();
		}
		System.out.println("������Ҫ���ҵ���");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(a==arr[i]){index=i;
				break;
			}
		}
		if(index!=-1){
			System.out.println(index);
		}else{for(int i=0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
		
		arr1[arr.length]=a;
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]);
			}
		}
//		System.out.println(index);
		
			
		}
	}


