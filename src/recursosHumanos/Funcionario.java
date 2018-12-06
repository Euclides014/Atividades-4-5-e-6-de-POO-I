package recursosHumanos;

public class Funcionario {
	
	public long cpf;
	public double salarioBruto;
	public double desconto;
	
	public Funcionario(){
		
	}
	
	public Funcionario(long cpf, double salarioBruto, double desconto){
		this.cpf = cpf;
		this.salarioBruto = salarioBruto;
		this.desconto = desconto;
		}
	
	public double calcularSalario(){
		double salario;
		salario = salarioBruto - desconto;
		return salario;
	}
		
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	

}
