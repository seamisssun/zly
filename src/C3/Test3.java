package C3;

public class Test3 {

	/**������ż���±�ĺͣ��Լ�����ż��Ԫ�صĺ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[]{1,2,3,4,5,6,7};
		int sum1=0;
		/*int sum=0;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){sum+=arr[i];}
		}
		System.out.println(sum);*/
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){sum1+=arr[i];}
		}
		System.out.println(sum1);
	}

}
