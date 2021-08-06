package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Estudante> list = new ArrayList<>();
		
		System.out.println("Entre com o caminho: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			int idadeMaisVelho = 0;
			String nomeMaisVelho = "";
			
			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String nome = fields[0];
				int idade = Integer.parseInt(fields[1]);
				int numIdentidade = Integer.parseInt(fields[2]);

				list.add(new Estudante(nome, idade, numIdentidade));
				
				if (idade > idadeMaisVelho) {
					idadeMaisVelho = idade;
					nomeMaisVelho = nome;
				}
				
				line = br.readLine();
			}
			System.out.println("Quantidade de alunos registrados: " + list.size());
			System.out.println("Estudante " + nomeMaisVelho + " idade " + idadeMaisVelho + " é o(a) mais velho(a) do arquivo.");

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		sc.close();
	}

}
