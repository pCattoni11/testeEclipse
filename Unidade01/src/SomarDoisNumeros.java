import java.util.Scanner;
public class SomarDoisNumeros {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("Resultado: " + soma);
	}
}
