package C4;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{2,5,9,6,10,6,3,1};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;}
			}
			System.out.print(arr[i]+" ");
		}
		
	}

}
