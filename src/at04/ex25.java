import java.util.Scanner;
public class Exercicio24 {
	//24. Faça um programa que calcule o valor total investido por um colecionador em sua
	//coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
	//quantidade de CDs e o valor para em cada um.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos CDs você tem ?");
		int cds =  entrada.nextInt();
		float soma = 0;
		
		for(int i=1;i<=cds;i++) {
			System.out.println("Qual o valor do CD?");
			float valor = entrada.nextFloat();
			soma = soma+valor;
		}
		System.out.println("O valor total é "+soma);
		System.out.println("A media é "+(soma/cds));
		entrada.close();
	}

}
