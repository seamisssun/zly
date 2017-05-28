package C6;

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{2,5,6,8,9};
		int a=5;
	}
	public static int []mun(int[] arr,int a){
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(a==arr[i]){index=i;
			break;}}
			if(index!=-1){int []arr1=new int[arr.length-1];
			for(int i=0;i<arr.length;i++){
			if(i<index){arr1[i]=arr[i];}
			if(i<index){
			arr1[i-1]=arr[i];
		}
		
		
			}	
		}
			return arr1;
	}
	
}
