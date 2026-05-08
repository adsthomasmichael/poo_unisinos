package aula011;

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
	}

}
