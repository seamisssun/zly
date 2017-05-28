package C5;

public class test7 {

	/**判断一个数组{1,2,3,1,0}中是否存在相同的元素，如果存在相同的元素则 输出“重复”，否则
	 * 输出“不重复”。

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
		if(index!=-1){System.out.println("重复");}
		else{System.out.println("不重复");}
	}

}
