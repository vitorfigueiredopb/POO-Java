import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome_completo, primeiro_nome, ultimo_nome;
		
		nome_completo = "Vitor Figueiredo da Silva";
		System.out.println("Nome Completo: " + nome_completo);
		
		primeiro_nome = nome_completo.substring(0, nome_completo.indexOf(" "));
		ultimo_nome = nome_completo.substring(nome_completo.lastIndexOf(" "));
		
		System.out.println("Primeiro e último nome: " + primeiro_nome + ultimo_nome);
		
		teclado.close();
	}
	
}
