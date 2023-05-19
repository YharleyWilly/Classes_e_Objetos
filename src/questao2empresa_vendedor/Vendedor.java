package questao2empresa_vendedor;

/*2) Faça um programa para cadastrar dados de uma empresa, onde cada registro será composto pelos seguintes campos: código de vendedor, 
nome de vendedor e tipo de mercadoria (P – perecível, N – não perecível). O programa deverá conter as seguintes operações:
a) Incluir vendedores no arquivo (vetor).
b) Consultar o total de vendedor de um determinado tipo mercadoria.
c) Excluir um vendedor do arquivo procurando pelo nome.
*/
 
public class Vendedor {
	
	private int codVendedor;
	private String nomeVendedor;
	private char tipoMercadoria;
	
	public Vendedor() {
		
		this.codVendedor = 0 ;
		this.nomeVendedor = " ";
		this.tipoMercadoria = ' ';
	}

	public int getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(int codVendedor) {
		this.codVendedor = codVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public char getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(char tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}

	public String toString() {
		return "Vendedor [codVendedor=" + codVendedor + ", nomeVendedor=" + nomeVendedor + ", tipoMercadoria="
				+ tipoMercadoria + "]";
	}
	
}
