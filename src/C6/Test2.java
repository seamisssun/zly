package C6;
import java.util.*;
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{10,37,40,55,21,45};
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ���ҵ���");
		int a=sc.nextInt();
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(a==arr[i]){index=i;break;}
		}
		if(index!=-1){
			System.out.println("�±�Ϊ"+index);	
		}
		else{int []arr1=new int[arr.length+1];
			for(int i=0;i<arr.length;i++){
				arr1[i]=arr[i];
				}arr1[arr.length]=a;
				for(int i=0;i<arr1.length;i++){
					System.out.print(arr1[i]+" ");
				}
				System.out.println();
				System.out.println("�±�Ϊ��"+index);
			}
		}
	}


