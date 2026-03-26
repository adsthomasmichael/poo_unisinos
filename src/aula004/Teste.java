package aula004;

import com.utils.*;

public class Teste {

	public static void main(String[] args) {
	
	//Instanciando Funcionario 1:
	String nome = Teclado.leString("Digite o nome do funcionario 1: ");
	String endereco = Teclado.leString("Informe o endereço do funcionario 1: ");
	char sexo = Teclado.leChar("Informe o sexo do funcionario 1: ");
	
	FuncionarioCaixa funcionario = new FuncionarioCaixa( nome, endereco, sexo);
	
	//Imprimindo resultados das operações:	
	System.out.println(funcionario.soma(2, 2));
	System.out.println(funcionario.subtrai(5, 4));
	System.out.println(funcionario.multiplica(2, 3));
	System.out.println(funcionario.divide(6, 3));
	System.out.println(funcionario.soma(7, 2));
	System.out.println(funcionario.multiplica(8, 3));
	
		
	//Instanciando Funcionario 2:
	String nome2 = Teclado.leString("Digite o nome do funcionario 2: ");
	String endereco2 = Teclado.leString("Informe o endereço do funcionario 2: ");
	char sexo2 = Teclado.leChar("Informe o sexo do funcionario 2: ");
	
	FuncionarioCaixa funcionario2 = new FuncionarioCaixa( nome2, endereco2, sexo2);
	
	//Instanciando Empresa 1:
	String nomeEmpresa = Teclado.leString("Digite o nome da empresa: ");
	
	Empresa empresa1 = new Empresa(  nomeEmpresa,funcionario , funcionario2 );
	
	empresa1.imprimeInfo();
		
		
	}

}
