import java.util.Scanner;
public class Exercicio24 {
	//24. Fa�a um programa que calcule o valor total investido por um colecionador em sua
	//cole��o de CDs e o valor m�dio gasto em cada um deles. O usu�rio dever� informar a
	//quantidade de CDs e o valor para em cada um.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos CDs voc� tem ?");
		int cds =  entrada.nextInt();
		float soma = 0;
		
		for(int i=1;i<=cds;i++) {
			System.out.println("Qual o valor do CD?");
			float valor = entrada.nextFloat();
			soma = soma+valor;
		}
		System.out.println("O valor total � "+soma);
		System.out.println("A media � "+(soma/cds));
		entrada.close();
	}

}
