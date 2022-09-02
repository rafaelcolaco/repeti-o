package at04;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um nome");
		String nome = input.nextLine();
		while (nome.length() < 3) {
		System.out.println("nome invalido");
		System.out.print("Digite um nome");
		nome = input.nextLine();
		}
		System.out.print("Digite a idade");
		int idade = input.nextInt();
		while (idade < 0 || idade > 150) {
		System.out.println("Idade invalida");
		System.out.print("Digite a idade");
		idade = input.nextInt();
		}
		System.out.print("Digite o salário");
		float salario = input.nextFloat();
		while (salario <= 0) {
		System.out.println("Salario invalido");
		System.out.print("Digite o salário");
		salario = input.nextFloat();
		}
		System.out.print("Digite o primeiro caractere do sexo");
		char sexo = input.next().charAt(0);
		while (sexo != 'm' && sexo != 'f') {
		System.out.println("caractere invalido");
		System.out.print("Digite o primeiro caractere do sexo");
		sexo = input.next().charAt(0);
		}
		System.out.println("Digite o primeiro caractere do seu estado civil");
		char estadocivil = input.next().charAt(0);
		while (estadocivil != 's' && estadocivil != 'c' && estadocivil != 'v' && estadocivil != 'd') {
		System.out.println("Caractere invalido");
		System.out.println("Digite o primeiro caractere do seu estado civil");
		estadocivil = input.next().charAt(0);
		}
		input.close();
	}

}
