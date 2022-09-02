import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva um Numero");
		int numero = entrada.nextInt();
		
		System.out.print("Os numero primos de "+1+" até "+numero+" sao ");
		
		for(int i=1;i<=numero;i++) {
		if ((i%2)==0 || (i%3)==0) {
			
				
		}else {if ((numero%i)==0)
					System.out.print("|"+i);
			}			
		}
	entrada.close();
	}
}