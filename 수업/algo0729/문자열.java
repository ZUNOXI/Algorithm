package algo0729;

public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World 0_0, Wellcome to hell 8_8";
		
		char[] ch_arr = str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				System.out.println(c + " 는 숫자입니다");
			}
		}
	}

}
