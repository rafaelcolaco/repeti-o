import java.util.Scanner;
public class Exercicio27 {
	//27. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora
	//possui uma loja de conveniências. Faça um programa que implemente uma caixa
	//registradora rudimentar. O programa deverá receber um número desconhecido de valores
	//referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para
	//indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o
	//valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
	//Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
	//compra. A saída deve ser conforme o exemplo abaixo:
	//public static void main(String[] args) {	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		boolean chave = true; 
		double produto = 1;
		int K = 0;
		
		while(chave==true) {
			
			if(produto!=0) {
				K=K+1;
			System.out.println("Digite o Valor do produto");
			 produto = entrada.nextDouble();
			 total = total+produto;
			 System.out.println("Produto"+ K +" = "+produto);
		
			}else
				chave=false;
	}
		System.out.println("Total = "+ total);
		System.out.println("Valor em dinheiro");
		double valor = entrada.nextDouble();
		System.out.println("Valor do troco é "+(valor-total) );
		entrada.close();
		
}
}
