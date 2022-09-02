package at04;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o numero da tabuada que deseja");
		int tabuada = input.nextInt();
		input.close();
		System.out.println("Tabuada de " + tabuada);
		int result = 0;
		for (int i = 0; i <= 10; i++) {
		result = tabuada * i;
		System.out.println(tabuada + " x " + i + " = " + result);
		}
	}
}
