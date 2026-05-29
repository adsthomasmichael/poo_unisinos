package aula014;

import com.utils.Teclado;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class turma {
	
	public static void main(String[] args) throws Exception {
	/* 	Crie um programa que solicite ao usuário o nome do aluno (String), a disciplina em
		que está matriculado (String), e a sua nota (float). Salve cada uma dessas
		informações em linhas separadas de um arquivo texto.*/
	
		Path caminho = Path.of("alunos.txt");
		
		String nome = Teclado.leString("Informe o nome do aluno: ");
		String disciplina = Teclado.leString("Informe a discilina: ");
		double nota = Teclado.leDouble("Informe o nota do aluno: ");
		
		try (BufferedWriter writer = Files.newBufferedWriter(caminho)){
			
			writer.write("Nome: "+ nome);
			writer.newLine();
			writer.write("Disciplina: " + disciplina);
			writer.newLine();
			writer.write(("Nota: ")+ Double.toString(nota));
		}
		
		System.out.println("Arquivo escrito com sucesso.");
		
		
	
	}

}
