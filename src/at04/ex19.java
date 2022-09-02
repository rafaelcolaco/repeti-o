import java.util.Scanner;
public class Exercicio18 {
	//Altere o programa de cálculo dos números primos, informando, caso o número não seja
	//primo, por quais número ele é divisível.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		
		
		if ((numero%2)==0|| (numero%3)==0) {
				System.out.println(numero+" não é primo");
				System.out.print("Os Divisores de "+numero+" são ");
				
				for(int i=1;i<=numero;i++) {
					if ((numero%i)==0)
						System.out.println(i+"|");
				}
			
			
		}else 
			System.out.println("é primo");
			
		
		entrada.close();	
}
}