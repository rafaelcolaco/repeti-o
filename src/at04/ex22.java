import java.util.Scanner;
public class Exercicio21 {
	//21. Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa devera
	//verificar se a m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e ent�o,
	//dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas pessoas est�o na turma?");
		int pessoas = entrada.nextInt();
		int soma = 0;
		
		for (int i=1;i<=pessoas;i++) {
			System.out.println("Digite a Idade");
			int idade = entrada.nextInt();
			soma = (idade+soma);
			
		}	
		float media = soma/pessoas;
		
		if(media>0 && media<=25)
			System.out.println("� uma turma jovem pois a media � "+(media));
		
		else if(media>=26 && media<=60)
			System.out.println("� uma turma Adulta pois a media � "+(media));
		
		else 
			System.out.println("� uma turma Idosa pois a media � "+(media));
		
		entrada.close();
	}

}
