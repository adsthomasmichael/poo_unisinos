package aula007;

import com.utils.Teclado;

public class PrincipalLocadora {

	public static void main(String[] args) {
		/*Crie uma locadora com as informações necessárias vindas pelo teclado;
		  crie um veículo do tipo SUV com 3 vagas, modelo "Toyota Hilux", a R$350,00 por diária; */
		
		Locadora locadora01 = new Locadora(Teclado.leString("Informe o nome da locadora: "));
		Veiculo veiculo01 = new Veiculo("Toyota Hilux SUV", "EXU-1323", 350);
		
		/* tente efetuar a locação para 5 clientes diferentes, usando as duas versões
			sobrecarregadas de alugarVeiculo (pelo menos uma chamada de cada).
			Imprima as informações dos contratos realizados com sucesso ou uma
			mensagem de erro para cada locação não efetuada.*/
		
		Cliente[] clientes = {
				new Cliente("Michael Thomas", 2345678, 42, true),
				new Cliente("Luís Eduardo", 2313432, 18, false),
				new Cliente("Tatiani Jardim", 75249882, 51, true),
				new Cliente("D'Ale", 25242322, 22, false),
				new Cliente("Angolinha", 40506070, 67, true),
		};
		
		for (Cliente c : clientes) {
			Contrato contrato = locadora01.alugarVeiculo(c, veiculo01);
			if(contrato != null) {
				contrato.exibirInformacoes();
				locadora01.exibirInformacoes();
				System.out.println("------------------------------------------\n");
			}
			else {
				System.out.println("Locação para cliente "+ c.getNome() + " não realizada. Veículo indisponível.\n");
			}
		}
		
		
		
	}

}
