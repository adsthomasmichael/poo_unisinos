package aula005_testeGA.Ex02_Aquario;

import com.utils.Teclado;

public class PrincipalAquario {

	public static void main(String[] args) {
		/*  Crie a classe PrincipalAquario. Esta classe possui apenas o método main. Neste método, faça o que se pede:
			◦ crie um objeto do tipo Pessoa com um aquário sem peixes. Todas as informações necessárias devem ser solicitadas via Teclado pelo usuário; */
	
	Aquario aquario01 = new Aquario();
	aquario01.setTamanho(Teclado.leDouble("Informe o tamanho do aquario, em m²: "));
		
	String nome = Teclado.leString("Informe o nome da pessoa: ");
	Pessoa pessoa01 = new Pessoa (nome, aquario01);
	
	
		/* Coloque dois peixes no aquário desta pessoa:
			▪ Peixe 1: Nome = Flick; Cor = azul (135, 206, 250); Raça = beta;
			▪ Peixe 2: Nome = Losh; Cor = verde (0, 255, 127); Raça = bagre */
	
	Cor cor01 = new Cor("azul", 135, 206, 250);
	Cor cor02 = new Cor("verde", 0, 255, 127);
	
	Peixe peixe01 = new Peixe("Flick", cor01, "beta");
	Peixe peixe02 = new Peixe("Losh", cor02, "bagre");
	
	pessoa01.getAquario().setPeixe01(peixe01);
	pessoa01.getAquario().setPeixe02(peixe02);
	
	
	}

}
