import java.util.Arrays;

class StringDemo {
	public static void main(String[] args) {
		String str1 = "AAA";
		String str2 = "BBB";
		System.out.println("str1.length() = " + str1.length());

		//문자열 결합
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		System.out.println("str1 + str2 = " + str3);
		System.out.println("str1.concat(str2) = " + str4);

		//문자 추출
		String s = "ABCDE";
		char ch = s.charAt(0);
		System.out.println("str.charAt(0) = " + ch);

		//문자 검색
		int index = s.indexOf("BCD");
		System.out.println("str.indexOf(\"BCD\") = " + index);

		//문자열 자르기
		String str = "ABCDEFG";
		String sub1 = str.substring(2);
		System.out.println("str.substring(2) = " + sub1);
		String sub2 = str.substring(2, 5);
		System.out.println("str.substring(2, 5) = " + sub2);

		//문자열 비교
		str1 = "AAA";
		str2 = "AAA";
		System.out.println("str1.equals(str2) = " + str1.equals(str2));
		if(str1.equals(str2)) {
			System.out.println("문자열이 같습니다");
		}

		System.out.println(str1 == str2);

		str2 = new String("AAA");
		str1 = new String("AAA");
		System.out.println(str1 == str2);

		//valueOf
		System.out.println("valueOf----------------");
		String s1 = String.valueOf(10);
		String s2 = String.valueOf('A');
		String s3 = String.valueOf(10.3333);
		String s4 = String.valueOf(true);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("-----------------------");

		s1 = "" + 10 + 1;
		s2 = "" + 'A' + 'B';
		s3 = "" + 10.3333 + 0.1;
		s4 = "" + true;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-----------------------");

		//format
		System.out.println("format-----------------");
		String format = "%s : %d와 %d를 나눈 값은 %f입니다.";
		int i = 10;
		int j = 3;
		double value = i/(double)j;
		String name = "홍길동";

		String result = String.format(format, name, i, j, value);
		System.out.println(result);

		//문자열 분리
		String split = "AAA:BBB:CCC:DDD";
		String[] arr = split.split(":");
		System.out.println(Arrays.toString(arr));

		//공백제거 (문자열 중간의 공백은 대상이 아님)
		str1 = "AAA";
		str2 = "  AAA";
		System.out.println("AAA.equals(  AAA.trim) : " 
				+ str1.equals(str2.trim()));

		//문자열 변환
		str = "한글은";
		char[] arr1 = str.toCharArray();
		System.out.println(Arrays.toString(arr1));
		byte[] arr2 = str.getBytes();
		System.out.println(Arrays.toString(arr2));
	}
}
