package at04;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma nota entre 0 e 10");
		float nota = input.nextFloat();
		while (nota < 0 || nota > 10) {
		System.out.print("Digite uma nota entre 0 e 10");
		nota = input.nextFloat();
		}
		input.close();
	}
}
