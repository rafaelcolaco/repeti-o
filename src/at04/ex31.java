import java.util.Scanner;
public class Exercicio30 {
	//30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
	//mais baixo, a mais gordo e o mais magro, para isto voc� deve fazer um programa que
	//pergunte a cada um dos clientes da academia seu c�digo, sua altura e seu peso. O final da
	//digita��o de dados deve ser dada quando o usu�rio digitar 0 (zero) no campo c�digo. Ao
	//encerrar o programa tamb�m deve ser informados os c�digos e valores do clente mais alto,
	//do mais baixo, do mais gordo e do mais magro, al�m da m�dia das alturas e dos pesos dos
	//clientes.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		boolean chave = true; 
		int K=0;
		double gordo =0;
		double magro =0;
		double alto=0;
		double baixo = 0;
		double mediap =0;
		double mediaA = 0;
		int codalto = 0;
		int codmagro = 0;
		int codbaixo =0;
		int codgordo = 0;
		int codigo = 0;	
		double altura=0;
		double peso =0;
		int valor = 0;		
				
		while(chave==true) {
			System.out.println("Digite seu codigo");
			 codigo = entrada.nextInt();
			System.out.println("Digite sua altura");
			altura = entrada.nextDouble();
			System.out.println("Digite seu peso");
			 peso = entrada.nextDouble();
			 entrada.nextLine();
			System.out.println("Digite 1-para continuar 0- para encerar o programa");
			valor = entrada.nextInt(); 
			
			K=(K+1);
		
		if(valor==0)
			chave=false;
		else {
			
			if(altura<baixo) {
				mediaA = altura + altura;
				codbaixo = codigo;
				baixo = altura;
			
			}else if(altura>alto) {
				mediaA = altura + altura;
				codalto = codigo;
				alto = altura;
		
			}else if(peso<magro){
				codmagro = codigo;
				mediap = mediap+peso;
				magro = peso;
			
			}else if(peso>gordo) {
				codgordo = codigo;
				mediap = mediap+peso;
				gordo = peso;
			}
		}
		
		
		
		
	}
		entrada.close();
		System.out.println("A pessoa mais alta  tem a altura : "+alto +"e seu codigo �"+codalto);
		System.out.println("A pessoa mais baixa  tem a altura : "+baixo +"e seu codigo �"+codbaixo);
		System.out.println("A pessoa mais magra  tem o peso : "+magro+"e seu codigo �"+codmagro);
		System.out.println("A pessoa mais gorda  tem o peso : "+gordo+"e seu codigo �"+codgordo);
		System.out.println("A media de pesos � "+(mediap/K));
		System.out.println("A media da altura � "+(mediaA/K));

}
}