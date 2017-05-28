package C4;

public class HM2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{2,5,6,5,8};
		//int []arr2;
		int index=-1;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length;j++)
				if(i!=j){
			if(arr[i]==arr[j]){index=i;}
		
				}
		}
		int []arr1=new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++){
			if(i>=index){arr1[i]=arr[i+1];}
			if(i<index){arr1[i]=arr[i];}
			
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");}
	}

}
