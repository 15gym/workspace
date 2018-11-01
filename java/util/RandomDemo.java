import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		int value = r.nextInt();
		System.out.println(value);

		System.out.println("-------------");

		for(int i = 0; i < 10; i++) {
			value = r.nextInt(10);
			System.out.println(value);
		}
	}
}
