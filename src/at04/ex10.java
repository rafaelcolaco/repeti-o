package at04;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a base");
		int base = input.nextInt();
		System.out.print("Digite o expoente");
		int expoente = input.nextInt();
		input.close();
		int result = base;
		for (int i = 1; i < expoente; i++) {
			result *= base;
		}
		System.out.println(result);

	}

}
