package aula011;

import com.utils.Teclado;

public class Teste {

	public static void main(String[] args) {
		
		// crie uma competição chamada “Correr é show”, que será realizada no dia 19/06/2026.
		Data d01 = new Data(19, 06, 2026);
		Competicao c01 = new Competicao("Correr é show", d01);
		
		// imprima as informações da competição (o nome e a data).
		c01.imprimeData();
		System.out.println("\n------------------");
		
		//crie um Nadador da categoria “borboleta”, chamado “Cielo” com 36 anos. imprima as informações deste nadador.
		Nadador n01 = new Nadador("Cielo", 36, "Borboleta");
		n01.imprimeInfo();
		System.out.println("\n------------------");
		
		
		/* crie um corredor de peso 68, chamado “Josenildo”, que possui 91 anos e vai correr a competição “Correr é show” (lembre-se, você já criou esta competição).
			altere o mês da competição deste corredor para o mês 2. imprima a data desta competição.*/
		Corredor run01 = new Corredor("Josenildo", 91, 68, c01);
		d01.setMes(02);
		run01.imprimeInfo();
		System.out.println("\n------------------");
		
		/* crie uma corredora de peso 60, chamada “Petrolina”, que possui 100 anos e que vai correr a corrida “São Silvestre”, que ocorrerá no dia 31/12/2026. 
		 * imprima as informações desta corredora*/
		Corredor run02 = new Corredor("Petrolina", 100, 60, new Competicao("São Silvestre", new Data(31, 12, 2026)));
		run02.imprimeInfo();
		System.out.println("\n------------------");
		
		/* 	declare um Atleta a (não instancie, só declare). Peça para o usuário digitar via	Teclado 1 para criar um Nadador e 2 para criar um Corredor. De acordo com a
			opção do usuário, diga que este atleta é um Nadador ou um Corredor, e peça o que for necessário via teclado (nome, idade, categoria, peso, etc.).
			se o atleta for um Nadador, altere a categoria dele para “livre”. Se o atleta for um Corredor, altere o peso dele para 89.*/
		
		Atleta a01 = null;
		int opcao = Teclado.leInt("Escolha uma opção: 1 - para Nadador ou 2 - para Corredor");
		
			if( opcao == 1) {
				a01 = new Nadador();
				a01.setNome(Teclado.leString("Informe o nome do nadador: "));
				a01.setIdade(Teclado.leInt("Informe a idade do nadador: "));
				Nadador nadador01 = (Nadador) a01;
					nadador01.setCategoria(Teclado.leString("Informe a categoria do nadador"));
					nadador01.setCategoria("Livre");
			}
			else if( opcao == 2){
				a01 = new Corredor();
				a01.setNome(Teclado.leString("Informe o nome do corredor: "));
				a01.setIdade(Teclado.leInt("Informe a idade do corredor: "));
				Corredor corredor01 = (Corredor) a01;
					corredor01.setPeso(Teclado.leDouble("Informe o peso do corredor"));
					corredor01.setPeso(89);
					Data d001 = new Data(Teclado.leInt("Informe a data da competição. Dia: "), Teclado.leInt("Mes:"), Teclado.leInt("Ano:"));
					corredor01.setCompeticao(new Competicao(Teclado.leString("Informe o nome da competição: "), d001));
			}
		/* 	crie um objeto do tipo InformacoesAtleta. Chame o método
			imprimeExclusivosAtleta passando este atleta. Em seguida, chame o
			método imprimeInformacoes passando este mesmo atleta.*/
		InformacoesAtletas info01 = new InformacoesAtletas(a01);
			info01.imprimeInformacoesAtleta(a01);
		
		
		
	}

}
