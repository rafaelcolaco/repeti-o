import java.util.Scanner;
public class Exercicio21 {
	//21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
	//verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
	//dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas pessoas estão na turma?");
		int pessoas = entrada.nextInt();
		int soma = 0;
		
		for (int i=1;i<=pessoas;i++) {
			System.out.println("Digite a Idade");
			int idade = entrada.nextInt();
			soma = (idade+soma);
			
		}	
		float media = soma/pessoas;
		
		if(media>0 && media<=25)
			System.out.println("É uma turma jovem pois a media é "+(media));
		
		else if(media>=26 && media<=60)
			System.out.println("É uma turma Adulta pois a media é "+(media));
		
		else 
			System.out.println("É uma turma Idosa pois a media é "+(media));
		
		entrada.close();
	}

}
