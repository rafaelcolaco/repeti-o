import java.util.Scanner;
public class Exercicio22 {
//Numa elei��o existem tr�s candidatos. Fa�a um programa que pe�a o n�mero total de
//votantes. Pe�a para cada votante votar e ao final mostrar o n�mero de votos de cada candidato.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o numero total de votantes");
		int votantes = entrada.nextInt();
		int candidato1 =0;
		int candidato2 = 0;
		int candidato3 = 0;
		
		for (int i=1;i<=votantes;i++) {
			System.out.println("Qual seu voto? 1,2 ou 3");
			int voto = entrada.nextInt();
			
			if(voto==1)
				candidato1= candidato1 + 1;
			
			else if(voto==2)
				candidato2= candidato2 + 1;
			
			else if(voto==3)
				candidato3= candidato3 + 1;
			
			else
				System.out.println("numero invalido");
		}
		System.out.println("O numero de votos do candidato 1 � "+candidato1);
		System.out.println("O numero de votos do candidato 2 � "+candidato2);
		System.out.println("O numero de votos do candidato 3 � "+candidato3);
		entrada.close();	
	}

}
