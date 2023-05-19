package questao1locadorafilmes;

/*1) Faça um programa para cadastrar dados de uma locadora de filmes, onde cada registro será composto pelos 
seguintes campos: código do filme, título do filme e gênero (A – ação, T – terror, D – drama). O programa 
deverá conter as seguintes operações:
a) Incluir filmes no arquivo (vetor).
b) Consultar o total de filmes de um determinado gênero.
c) Excluir um filme do arquivo procurando pelo nome.
*/

public class Filme {
	
	private int codFilme;
	private String tituloFilme;
	private char generoFilme;
	
	public Filme() {
		
		this.codFilme = 0;
		this.tituloFilme = "";
		this.generoFilme = ' ';
	}
	
	public int getCodFilme() {
		return codFilme;
	}

	public String getTituloFilme() {
		return tituloFilme;
	}

	public char getGeneroFilme() {
		return generoFilme;
	}
	
	public void setTituloFilme(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}

	public void setGeneroFilme(char generoFilme) {
		this.generoFilme = generoFilme;
	}

	public void setCodFilme(int codFilme) {
		this.codFilme = codFilme;
	}

	public String toString() {
		return "Filme [codFilme=" + codFilme + ", tituloFilme=" + tituloFilme + ", generoFilme=" + generoFilme + "]";
	}
}
