package string_;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "    test    ";
		String str2 = "test      ";
		System.out.println("111"+str1+"111");
		System.out.println("111"+str2+"111");
		System.out.println(str1.equals(str2));
		
		System.out.println("---------------------");
		//trim은 맨 처음과 마지막의 공백을 처리해준다.
		String s1 = str1.trim();
		String s2 = str2.trim();
		System.out.println("111"+s1+"111");
		System.out.println("111"+s2+"111");
		System.out.println(s1.equals(s2));
		
		System.out.println("-----------------------");
		// split은 해당 문자열 기준으로 나눠서 구분해 배열에 저장한다
		String addr = "01234/서울/노원구/동일로 1234";
		String[] s = addr.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println("-----------");
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("------------------------");
		// replace는 replace("변경하고싶은 문자열", "변경할 문자열");
		// 해당 문자열을 변경할 때 사용한다
		String phone = "010-1234-1234";
		String replace = phone.replace("-", "aaa");
		System.out.println(replace);
		
		// charAt(index번호)는 index번호에 문자열을 출력
		System.out.println(phone.charAt(3));
	}
}
