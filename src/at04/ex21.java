import java.util.Scanner;
public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas são?");
		int QUAN = entrada.nextInt(); //quantidade de notas
		float soma = 0;
		
		for(int i=1;i<=QUAN;i++) {
			System.out.println("Digite a nota");
			float nota = entrada.nextFloat();
			soma = soma + nota;
		}
		System.out.println("A média é "+(soma/QUAN));
		entrada.close();
	}

}
