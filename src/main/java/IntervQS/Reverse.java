package IntervQS;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="I Love Java Coding";
		char[] arr = s.toCharArray();
		StringBuffer br = new StringBuffer();
		for(int i=arr.length-1; i>=0; i--) {
			if(Character.isAlphabetic(arr[i])) {
				br.append(arr[i]);
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(Character.isWhitespace(arr[i])) {
				br.insert(i, " ");
			}
		}
		System.out.println(br.toString());
	}

}
