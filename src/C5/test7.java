package C5;

public class test7 {

	/**�ж�һ������{1,2,3,1,0}���Ƿ������ͬ��Ԫ�أ����������ͬ��Ԫ���� ������ظ���������
	 * ��������ظ�����

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{1,2,3,1,0};
		int index=-1;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){index=i;}
			}
			}
		if(index!=-1){System.out.println("�ظ�");}
		else{System.out.println("���ظ�");}
	}

}
