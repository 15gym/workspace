
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("AAA");
		str.append("BBB");
		System.out.println(str.toString());

		str.insert(3, " : ");
		System.out.println(str.toString());
		
		str.reverse();
		System.out.println(str.toString());

		str.deleteCharAt(4);
		System.out.println(str.toString());

		str.delete(3, str.length());
		System.out.println(str.toString());
	}
}
