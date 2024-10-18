package lr2;
import java.util.Scanner;

public class Example2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число, для проверки, что при его делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1: ");
		int num = in.nextInt();
		if (num%5 == 2 && num%7 == 1) {
			System.out.println("Введенное число соответствует данным критериям");
		} else {
			System.out.println("Введенное число не соответствует данным критериям");
		}
		in.close();
	}
}


