import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial");
		int valor0 = entrada.nextInt();
		System.out.println("Digite o valor Final");
		int valor = entrada.nextInt();
		
		if (valor0>valor)
			System.out.println("ERRO voce digitou o valor inicial maior que o final");
			
		else
			System.out.println("Voce quer a tabuada de que numero?");
			int num = entrada.nextInt();
		
			for(int i=valor0;i<=valor;i++) {
				System.out.println(num+"X"+i+" = "+(num*i));
			
			}
		entrada.close();
	}

}
