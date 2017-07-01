package C10;

import java.util.Scanner;

public class Test6 {

	/**
	 * 自定义长度为5的数组并初始化，在数组中查找一个数， 如果这个数在数组中返回下标，若不在则插入到数
	 * 组的末尾。 (要求用静态方法实现)
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
			System.out.println("请输入第"+(i+1)+"个元素");
			arr[i]=sc.nextInt();
		}
		System.out.println("请输入要查找的数");
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


