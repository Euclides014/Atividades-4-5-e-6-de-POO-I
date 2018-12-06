package recursosHumanos;

public class vendedor extends Funcionario{
	
	public double comissao;
	
	public vendedor(long cpf, double salarioBruto, double desconto, double comissao){
		super(cpf, salarioBruto, desconto);
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario(){
		double 
		salario = salarioBruto + comissao - desconto;
		return salario;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
