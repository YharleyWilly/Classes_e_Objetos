package questao1locadorafilmes;

import java.util.Arrays;

/*1) Faça um programa para cadastrar dados de uma locadora de filmes, onde cada registro será composto pelos 
seguintes campos: código do filme, título do filme e gênero (A – ação, T – terror, D – drama). O programa 
deverá conter as seguintes operações:
a) Incluir filmes no arquivo (vetor).
b) Consultar o total de filmes de um determinado gênero.
c) Excluir um filme do arquivo procurando pelo nome.
*/

public class Locadora {
	
	private Filme[] vetFilmes;
	private int quantFilmes;
	
	public Locadora(int tamanho) {
		this.vetFilmes = new Filme [tamanho];
		this.quantFilmes = 0;
	}

	public Filme[] getVetFilmes() {
		return vetFilmes;
	}

	public void setVetFilmes(Filme[] vetFilmes) {
		this.vetFilmes = vetFilmes;
	}

	public int getQuantFilmes() {
		return quantFilmes;
	}

	public void setQuantFilmes(int quantFilmes) {
		this.quantFilmes = quantFilmes;
	}

	public String toString() {
		return "Locadora [vetFilmes=" + (vetFilmes != null ? Arrays.asList(vetFilmes) : null) + ", quantFilmes="
				+ quantFilmes + "]";
	}
	
	//inserir um filme no vetor vetFilmes
	public boolean inserirFilme(Filme filme) {
		if(this.vetFilmes.length == this.quantFilmes) {
			return false;
		}else {
			this.vetFilmes[this.quantFilmes] = filme;
			this.quantFilmes++;
			return true;
		}
	}
	
	//pesquisar a quantidade de filmes de um determinado genero
	public int pesquisarQtdeGenero(char genero) {
		int qtde = 0;
		for (int i = 0; i < this.quantFilmes; i++) {
			if (this.vetFilmes[i].getGeneroFilme() == genero) {
				qtde++;
			}
		}
		return qtde;
	}
	
	// remover um filme do vetFilmes
		public boolean removerFilme(String titulo) {
			if(quantFilmes == 0) {
				return false;
			}else {
				for(int i = 0; i < quantFilmes; i++) {
					if(vetFilmes[i].getTituloFilme().equals(titulo)) {			
						
						//Verifica se o filme está na última posição
						if(i == this.vetFilmes.length - 1) {
							vetFilmes[i] = null;
							quantFilmes--;
							
						//Se não estiver na última posição, o filme será deletado e na posição dele será sobrescrito o filme da última pos
						}else {
							vetFilmes[i] = vetFilmes[this.quantFilmes - 1];
							vetFilmes[this.quantFilmes - 1] = null;
							quantFilmes--;
						}
						return true;
					}
				}
				return false;
			}	
		}
}