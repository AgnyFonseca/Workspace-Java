package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.println("Entre com o caminho: ");
		String path = sc.nextLine();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			int flag = 0;
			
			while (flag != 2) {
				System.out.print("Entre com o nome: ");
				String nome = sc.nextLine();
				System.out.print("Entre com o endereco: ");
				String endereco = sc.nextLine();
				System.out.print("Entre com o genero: ");
				String sexo = sc.nextLine();
				System.out.print("Entre com o idade: ");
				int idade = sc.nextInt();
				
				list.add(new Pessoa(nome, endereco, sexo, idade));
				
				System.out.print("Deseja continuar? SIM = [1] - NÃO = [2] : ");
				flag = sc.nextInt();
				sc.nextLine();
			}
			
			for (Pessoa pessoa : list) {
				bw.write(pessoa.getNome() + "," + pessoa.getEndereco() + "," + pessoa.getSexo() + "," + pessoa.getIdade());
				bw.newLine();
			}
		
		} catch (IOException e) {
			System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
		}
		
		sc.close();
	}

}
