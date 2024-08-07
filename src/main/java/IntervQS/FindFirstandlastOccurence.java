package IntervQS;

public class FindFirstandlastOccurence {	
	
	public static void main(String[] args) {
		String s1 = "amazonaanazzz";
		printfirstandlast(s1);
	}
	
	public static void printfirstandlast(String s){
		 int firstindex=0;
		 int lastindex=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				firstindex=i;
				break;
			}
		}
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				lastindex=i;
			}
		}
		System.out.println(firstindex);
		System.out.println(lastindex);
	}

}
