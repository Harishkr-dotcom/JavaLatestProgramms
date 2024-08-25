package IntervQS;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123-456-789";
		StringBuilder sb = new StringBuilder();
		char[] cha = s.toCharArray();
		for(int i=0; i<cha.length;i++) {
			if(Character.isDigit(cha[i])) {
				sb.append(cha[i]);
			}
		}
		System.out.println(sb.toString());
		if(sb.length()==9) {
			System.out.println("it has 9 digits");
		}
	}

}
