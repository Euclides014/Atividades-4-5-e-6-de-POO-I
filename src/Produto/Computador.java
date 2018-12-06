package Produto;

public class Computador extends Produto implements Autenticacao {

	
	public double calcprecovendar(){
		double v_compra = this.preco;
		double v_lucro = this.preco * 0.3;
		return v_compra + v_lucro;
		
	}
	
	@Override
	public boolean autenticaCodigo(long codbarra) {
		if (codbarra == cod_barra){
			return true;
			
		}else{
			return false;
		}
		
	}
	
}


