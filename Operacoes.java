/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Operacoes
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
		System.out.print("Digite o primeiro numero inteiro: ");
		int num1 = scanner.nextInt ();
		
		
		System.out.print("Digite o segundo numero inteiro: ");
		int num2 = scanner.nextInt();
		
		
		//Subtração
		int subtracao = num1 - num2;
		System.out.println("A subtração do primeiro pelo segundo é: " + subtracao);
		
		
		//Multiplicação
		int multiplicacao = num1 * num2;
		System.out.println("A multiplicação é: " + multiplicacao);
		
		
		//Divisão
		if (num2 != 0) {
		   int divisaoInteira = num1 / num2;
		   System.out.println("A divisão inteira é: " + divisaoInteira);
		   
		   double divisaoReal = (double) num1 / num2;
		   System.out.println("A divisão real é: " + divisaoReal);
		   
		} else {
		    System.out.println("Não dá para dividir por zero, burro!");
		}
		scanner.close();
	}
}
		
		
	
