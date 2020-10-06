import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		int i = 1;
		int quantidade = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.print("Digite a idade da pessoa "+ i + ": ");
			idade = teclado.nextInt();
			if ((idade >= 0) && (idade <= 12)) {
				quantidade += 1;
			}
		}
		
		System.out.print("\nA quantidade de pessoas com idade entre 0 e 12 anos é: " + quantidade);
		
		teclado.close();
	}
}
