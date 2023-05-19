package questao2empresa_vendedor;

public class Teste {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(2);
		
		Vendedor vendedor1 = new Vendedor();
		
		vendedor1.setCodVendedor(1);
		vendedor1.setNomeVendedor("Yharley");
		vendedor1.setTipoMercadoria('p');
		
		Vendedor vendedor2 = new Vendedor();
		
		vendedor2.setCodVendedor(2);
		vendedor2.setNomeVendedor("Jhordan");
		vendedor2.setTipoMercadoria('n');
		
		empresa.incluirVendedor(vendedor1);
		empresa.incluirVendedor(vendedor2);
		
		System.out.println(empresa.toString());
		
		empresa.removerVendedor("Yharley");
		
		System.out.println(empresa.toString());
		
		
		
		
		
		
	}
	
}
