package at04;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Seu usuário");
		String usuario = input.nextLine();
		System.out.print("Sua senha");
		String senha = input.nextLine();
		while (usuario.equals(senha)) {
		System.out.println("Senha não pode ser igual ao usuário");
		System.out.print("Seu usuário");
		usuario = input.nextLine();
		System.out.print("Sua senha");
		senha = input.nextLine();
		}
		input.close();
	}
}
