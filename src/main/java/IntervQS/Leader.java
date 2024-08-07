package IntervQS;


public class Leader {
	public static void main(String[] args) {
		 int arr[] = new int[]{16, 17, 4, 3, 5, 2};
		 Leader.printleader(arr);
	}
	
	public static void printleader(int [] arr) {
		int max_right = arr[arr.length-1];
		System.out.println(max_right);
		for(int i= arr[arr.length-2];i>=0;i--) {
			if(max_right<arr[i]) {
				max_right = arr[i];
				System.out.println(max_right);
			}
		}
	}

}
