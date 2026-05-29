package aula014;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class leitorDearquivo {

	public static void main(String[] args) throws IOException {
		
		
		/* 	Crie um programa que leia o arquivo criado anteriormente e mostre os dados na tela,
			identificando o nome e valor de cada informação. Ex: Nome: <nome> \n Disciplina:
			<disciplina> \n, etc. */
		
		Path caminho = Path.of("alunos.txt");
		String conteudo = Files.readString(caminho);
		
		System.out.println(conteudo);
		
		
		
		
		
		
		
	}

}
