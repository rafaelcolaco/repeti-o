package at04;
import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero");
		int numero = input.nextInt();
		input.close();
		if(numero % 2 == 0)
        System.out.println("N�o � primo");
		else
		System.out.println("primo");
	}
}
