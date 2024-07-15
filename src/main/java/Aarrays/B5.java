package Aarrays;

public class B5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,5,7,8,10};
		int evencout=0;
		int oddcout=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencout += 1;
			}
			else {
				oddcout +=1;
			}
		}
		System.out.println(evencout);
		System.out.println(oddcout);

	}

}
