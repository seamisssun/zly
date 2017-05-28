package C7;

public class HM2 {

	/**
	 * 设计一个方法，能够找出在两个数组中最大的一个数，并将其在main方法中打印。
	 * 两个数组分别为{21,54,2,63,87,15,9,50}、{11,100,27,94,56}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{21,54,2,63,87,15,9,50};
		int []arr2=new int[]{11,100,27,94,56};
		max(arr);
		max(arr2);
		if(max(arr)>max(arr2)){System.out.println(max(arr));
			
		}else{System.out.println(max(arr2));}
		

	}
	public static int max(int []arr){
		int max=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max){max=arr[i];}
	}return max;
	
	}

}
