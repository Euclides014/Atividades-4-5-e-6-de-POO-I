package recursosHumanos;

public class Diarista extends Funcionario{
	
	public double valorHora;
	public double qtdHora;
	
	public Diarista(){
		
	}
	
	public Diarista(double valorHora, double qtdHora){
		super();
		this.valorHora = valorHora;
		this.qtdHora = qtdHora;
	}
	
	public double calcularSalario(){
		return this.valorHora * this.qtdHora;
	}
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQtdHora() {
		return qtdHora;
	}

	public void setQtdHora(double qtdHora) {
		this.qtdHora = qtdHora;
	}

}
