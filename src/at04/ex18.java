import java.util.Scanner;
public class Exercicio31 {
	//31. Fa�a um programa que leia dez conjuntos de dois valores, o primeiro representando o
	//n�mero do aluno e o segundo representando a sua altura em cent�metros. Encontre o aluno
	//mais alto e o mais baixo. Mostre o n�mero do aluno mais alto e o n�mero do aluno mais
	//baixo, junto com suas alturas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numeroalto= 0;
		int numerobaixo=0;
		double alto = 0;
		double baixo = 0;
		
		
	
		for (int i=1;i<=2;i++) {
			
			System.out.println("Qual  o seu Numero");
			int numero = entrada.nextInt();
			System.out.println("Qual sua altura em cent�metros?");
			double altura = entrada.nextDouble();
			
			
			
			if(i==1) {
				 numeroalto =numero;
				numerobaixo = numero;
				 alto = altura;
				 baixo = altura;
			
			}else if(altura>alto) {
				 alto = altura;
				 numeroalto =numero;
			
			}else if (altura<baixo) {
				baixo = altura;
				numerobaixo=numero;
			}
			
		}
		entrada.close();
		System.out.println("O altura  do mais alto � "+ alto +" e o numero � "+numeroalto);
		System.out.println("O altura  do mais baixo � "+ baixo +" e o numero � "+numerobaixo);
		
		
	}

}
