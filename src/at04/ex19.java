import java.util.Scanner;
public class Exercicio18 {
	//Altere o programa de c�lculo dos n�meros primos, informando, caso o n�mero n�o seja
	//primo, por quais n�mero ele � divis�vel.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		
		
		if ((numero%2)==0|| (numero%3)==0) {
				System.out.println(numero+" n�o � primo");
				System.out.print("Os Divisores de "+numero+" s�o ");
				
				for(int i=1;i<=numero;i++) {
					if ((numero%i)==0)
						System.out.println(i+"|");
				}
			
			
		}else 
			System.out.println("� primo");
			
		
		entrada.close();	
}
}