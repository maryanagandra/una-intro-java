/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class SomaDoisNumeros {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero inteiro: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite o segundo numero inteiro: ");
		int num2 = scanner.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos dois numeros é: " + soma);
		
		scanner.close();
	}
}