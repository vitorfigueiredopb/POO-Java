import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		
		if ((idade >= 5) && (idade <= 10)) {
			System.out.println ("A categoria para sua idade é: Infantil!");
		} else if ((idade >= 11) && (idade <= 15)) {
			System.out.println ("A categoria para sua idade é: Juvenil!");
		} else if ((idade >= 16) && (idade <= 20)) {
			System.out.println ("A categoria para sua idade é: Júnior!");
		} else if ((idade >= 21) && (idade <= 25)) {
			System.out.println ("A categoria para a sua idade é: Profissional!");
		} else {
			System.out.println ("Desculpe, mas não existe nenhuma categoria para a sua idade!");
		}
		
		teclado.close();
	}

}
