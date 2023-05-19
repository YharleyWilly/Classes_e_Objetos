package questao1locadorafilmes;

import java.util.Scanner;

public class MenuPrincipal {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		char opcao;
		
		// instancia o vetor
		Locadora locadora;
		
		System.out.println("Quantos filmes deseja cadastrar: ");
		int tam = scan.nextInt();
		locadora = new Locadora (tam);
		
		if(tam == 0) {
			System.out.println("FIM");
			
		}else {
		
			do {
				System.out.println("1.Cadastrar um filme na locadora)\n" 
			                     + "2.Mostrar todos os filmes da locadora\n"
			                     + "3.Excluir um filme da locadora (Vetor)\n"
						         + "4.Finalizar operações");		
				opcao = scan.next().charAt(0);
				
				switch (opcao) {
				
				case '1':
					cadastrarFilmes(locadora);
					break;
					
				case '2':
					System.out.println(locadora.toString());
					break;
						
				case '3':
					excluirFilmes(locadora);
					break;
					
				case '4':
					System.out.println("fim de programa");
					break;
					
				default:
					System.out.println("opção inválida. Tente novamente.");
				
				}
			} while (opcao != '4');
		}

	}

	static void cadastrarFilmes(Locadora t) {
		
		Filme filme = new Filme();
		
		System.out.println("Digite a código do filme:");
		filme.setCodFilme(scan.nextInt());
			
		System.out.println("Digite o título do filme:");
		filme.setTituloFilme(scan.next());
		
		System.out.println("Digite o genero do filme:");
		filme.setGeneroFilme(scan.next().charAt(0));
		
		if (t.inserirFilme(filme)) {
			System.out.println("operação realizada com sucesso.");
			
		} else {
			System.out.println("operação não realizada. Arquivo cheio.");
		}
	}

	static void excluirFilmes(Locadora t) {	
		String titulo;
		
		System.out.println("Digite o título do filme:");
		titulo = scan.next();
		
		if (t.removerFilme(titulo)) {
			System.out.println("operação realizada com sucesso.");
			
		} else {
			System.out.println("operação não realizada. Filme não encontrado.");
		}
	}
}
