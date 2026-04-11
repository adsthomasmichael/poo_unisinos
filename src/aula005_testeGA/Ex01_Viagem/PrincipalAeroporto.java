package aula005_testeGA.Ex01_Viagem;

import com.utils.Teclado;

public class PrincipalAeroporto {

	public static void main(String[] args) {
		/* Crie uma classe PrincipalAeroporto. Nesta classe, crie o método main. No main, faça o que se pede:
			◦ crie um aeroporto, com as informações necessárias vindas pelo Teclado;
			◦ crie uma viagem com 5 lugares, com destino a Florianópolis, que custa R$500,00;
			◦ tente efetuar a compra de 7 passagens para 7 passageiros diferentes. Imprima as informações das
			passagens compradas com sucesso ou uma mensagem de erro para cada compra não efetuada. */
	
	Aeroporto aeroporto01 = new Aeroporto(Teclado.leString("Informe o nome do Aeroporto: "));
	Viagem viagem01 = new Viagem("Florianopolis", "Santa Catarina", 500.00, 5);
	
	Passageiro passageiro01 = new Passageiro("Luis Eduardo", 10);
	Passageiro passageiro02 = new Passageiro("Michael Thomas", 42);
	Passageiro passageiro03 = new Passageiro("Tatiani Jardim", 51);
	Passageiro passageiro04 = new Passageiro("Luiz Donaldo", 83);
	Passageiro passageiro05 = new Passageiro("D'Ale", 9);
	Passageiro passageiro06 = new Passageiro("Angola", 4);
	Passageiro passageiro07 = new Passageiro("Zeca PAgodinho", 74);
	
	int contador = 0;
	viagem01.setLugaresVendidos(contador);
	
		if (aeroporto01.compraPassagem(passageiro01, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro01.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
		if(aeroporto01.compraPassagem(passageiro02, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro02.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
		if(aeroporto01.compraPassagem(passageiro03, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro03.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
		if(aeroporto01.compraPassagem(passageiro04, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro04.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
		if(aeroporto01.compraPassagem(passageiro05, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro05.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
		if(aeroporto01.compraPassagem(passageiro06, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro06.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
		
		if(aeroporto01.compraPassagem(passageiro07, viagem01) != null) {
			contador++;
			System.out.println("Compra realizada com sucesso!\n");
			passageiro07.imprimeInfo();
			viagem01.imprimeInfo();
		}
		else {
			System.out.println("Não foi possivel realizar a compra da sua passagem.");
		}
	
	
	
	
	
	
	}
	
	

}
