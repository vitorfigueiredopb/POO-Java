import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		
		if ((idade >= 5) && (idade <= 10)) {
			System.out.println ("A categoria para sua idade �: Infantil!");
		} else if ((idade >= 11) && (idade <= 15)) {
			System.out.println ("A categoria para sua idade �: Juvenil!");
		} else if ((idade >= 16) && (idade <= 20)) {
			System.out.println ("A categoria para sua idade �: J�nior!");
		} else if ((idade >= 21) && (idade <= 25)) {
			System.out.println ("A categoria para a sua idade �: Profissional!");
		} else {
			System.out.println ("Desculpe, mas n�o existe nenhuma categoria para a sua idade!");
		}
		
		teclado.close();
	}

}
