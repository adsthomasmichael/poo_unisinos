package aula011;

public class InformacoesAtletas {
	/* 	Crie uma classe chamada InformacoesAtletas. Esta classe possui um método
		public void imprimeExclusivosAtleta(Atleta a). Se o atleta for um
		Nadador, imprima a mensagem: “É um nadador, e sua categoria é X”, onde X deve
		ser substituído pela categoria do Nadador. Se o atleta for um Corredor, imprima a
		mensagem “É um corredor, e o peso deste corredor é X”, onde X deve ser
		substituído pelo peso do corredor. DICA: use o instanceof visto em aula. Crie o
		método public void imprimeInformacoes Atleta(Atleta a), que recebe
		um Atleta a por parâmetro e imprime as informações dele.*/


	public InformacoesAtletas(Atleta atleta) {
	}

	public void imprimeExclusivosAtleta( Atleta a) {
		
			if( a instanceof Nadador) {
				Nadador n = (Nadador) a;
				System.out.printf("É um nadador e sua categoria é %S", n.getCategoria());
			}
			else if( a instanceof Corredor) {
				Corredor c = (Corredor) a;
				System.out.printf("É um corredor e seu peso é %.2fKg.", c.getPeso());
			}
		
	}
	
	public void imprimeInformacoesAtleta( Atleta a) {
		
		System.out.println("=== INFO ATLETA ===");
			if (a instanceof Nadador) {
				Nadador n = (Nadador) a;
				n.imprimeInfo();
			}
			else if( a instanceof Corredor) {
				Corredor c = (Corredor) a;
				c.imprimeInfo();
			}
		
	
	
	}

}
