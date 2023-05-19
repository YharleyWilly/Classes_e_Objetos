package questao2empresa_vendedor;

import java.util.Arrays;

public class Empresa {
	
	private Vendedor [] vetVendedor;
	private int quantVendedor;
	
	public Empresa(int tamanho) {

		this.vetVendedor = new Vendedor[tamanho];
		this.quantVendedor = 0;
		
	}
	
	public Vendedor[] getVetVendedor() {
		return vetVendedor;
		
	}
	public void setVetVendedor(Vendedor[] vetVendedor) {
		this.vetVendedor = vetVendedor;
		
	}
	public int getQuantVendedor() {
		return quantVendedor;
		
	}
	public void setQuantVendedor(int quantVendedor) {
		this.quantVendedor = quantVendedor;
		
	}
	
	public String toString() {
		return "Empresa [vetVendedor=" + (vetVendedor != null ? Arrays.asList(vetVendedor) : null) + ", quantVendedor="
				+ quantVendedor + "]";
	}

	//a) Incluir vendedores no arquivo (vetor).
	public boolean incluirVendedor(Vendedor novoVendedor) {
		if(vetVendedor.length == quantVendedor) {
			return false;
			
		}else {
			this.vetVendedor[this.quantVendedor] = novoVendedor;
			this.quantVendedor++;
			return true;	
		}
	
	}
	
	//b) Consultar o total de vendedor de um determinado tipo mercadoria.
	public int totalVendedorTipo(char tipoMercadoria) {
		
		if(tipoMercadoria == 'p' || tipoMercadoria == 'P') {
			int quantPerecivel = 0;
			
			for(int i = 0; i < quantVendedor; i++) {
				if(vetVendedor[i].getTipoMercadoria() == 'p' || vetVendedor[i].getTipoMercadoria() == 'P')
					quantPerecivel++;
				
			}
			return quantPerecivel;
			
		}else {
			int quantNaoPerecivel = 0;
			
			for(int i = 0; i < quantVendedor; i++) {
				if(vetVendedor[i].getTipoMercadoria() == 'n' || vetVendedor[i].getTipoMercadoria() == 'N')
					quantNaoPerecivel++;
				
			}
			return quantNaoPerecivel;
		}
	
	}
	
	//c) Excluir um vendedor do arquivo procurando pelo nome.
	public boolean removerVendedor(String nomeVendedor) {
		if(this.quantVendedor == 0) {
			return false;
			
		}else {
			for(int i = 0; i < this.quantVendedor; i++) {
				if(this.vetVendedor[i].getNomeVendedor().equals(nomeVendedor)) {
					
					if(i == this.vetVendedor.length-1) {
						this.vetVendedor[i] = null;
						this.quantVendedor--;
						
					}else {
						this.vetVendedor[i] = this.vetVendedor[this.quantVendedor-1];
						this.vetVendedor[this.quantVendedor-1] = null;
						this.quantVendedor--;
						
					}
					
					return true;
				}
				
			}
			return false;
		}
		
	}
}
