package teste;

import Produto.Computador;
import recursosHumanos.Diarista;
import recursosHumanos.Funcionario;
import recursosHumanos.vendedor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario a = new Funcionario();
		a.setCpf(12345678);
		a.setSalarioBruto(2500);
		a.setDesconto(150);
		
		System.out.print("Salario de funcionario: " + a.calcularSalario());
		
		vendedor v = new vendedor(12345678, 600, 0,25.9);
		System.out.println("Salario vendedor: " + v.calcularSalario());
		
		Funcionario f1;
		f1 = new vendedor(12345678, 1100, 95.69, 650);
		f1.calcularSalario();
		System.out.println("Salario vendedor: " + f1.calcularSalario());
		
		f1 = new Diarista(100, 4);
		f1.calcularSalario();
		System.out.println("Salario diarista: " + f1.calcularSalario());
		
		Computador pc1 = new Computador();
		pc1.setCod_barra(12345678);
		pc1.setPreco(1300);
		pc1.setQuantidade(3);
		
		
		pc1.calcprecovendar();
		System.out.println("O codigo de barra está: " + pc1.autenticaCodigo(12345697));
		System.out.println("O preço de venda do computador é: " + pc1.calcprecovendar());

	}

}
