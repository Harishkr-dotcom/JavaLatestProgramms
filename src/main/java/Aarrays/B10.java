package Aarrays;

public class B10 {
	public static void main(String[] args) {
		int[] arr={1,0,5,94,0,6};
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				arr[count]=arr[i];
				count++;
			}
		}
		for(int j=count; j<arr.length;j++){
			arr[j]=0;
			count++;
		}
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		
		int[] arr1={1,0,5,94,0,6};
		int count1=arr1.length-1;
		for(int i=arr1.length-1; i>=0; i--){
			if(arr1[i]!=0){
				arr1[count1]=arr1[i];
				count1--;
			}
		}
		for(int j=count1;j>=0;j--){
			arr1[count1]=0;
			count1--;
		}
		
		for(int j=0;j<arr.length;j++){
			System.out.print(arr1[j]+" ");
		}
	}

}
