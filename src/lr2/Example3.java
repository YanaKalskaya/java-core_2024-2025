package lr2;
import java.util.Scanner;

public class Example3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число, для проверки, что оно делится на 4 и не меньше 10: ");
		int num = in.nextInt();
		if (num%4 == 0 && num >= 10) {
			System.out.println("Введенное число соответствует данным критериям");
		} else {
			System.out.println("Введенное число не соответствует данным критериям");
		}
		in.close();
	}
}
