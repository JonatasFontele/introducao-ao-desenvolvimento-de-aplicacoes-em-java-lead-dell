package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExemploMapa {

	public static void main(String[] args) {
		// Declarando a lista:
		List<String> listaDeClientes = new ArrayList<String>();

		// Usando a classe Scanner:
		Scanner scanner = new Scanner(System.in);

		// Recebendo os dados da entrada:
		System.out.print("Digite um nome: ");
		String nome = scanner.nextLine();

		// Enviando um objeto String ao método add():
		listaDeClientes.add(nome);

		// Circundando as linhas com um laço de repetição:
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite um nome: ");
			listaDeClientes.add(nome);
		}

		// Usando o método System.out.println():
		System.out.println(listaDeClientes);

		// Fazendo a chamada do método remove():
		System.out.print("Informe um nome a ser removido: ");
		nome = scanner.nextLine();
		listaDeClientes.remove(nome);

		// Usando o foreach:
		for (String nomeCliente : listaDeClientes) {
			System.out.println("Nome do cliente: " + nomeCliente);
		}


		// Utilizando a classe HashMap:
		Map<String, String> mapa = new HashMap<String, String>();

		// Fazendo a entrada de dados:
		System.out.print("Informe o CPF: ");
		String cpf = scanner.nextLine();
		System.out.print("Informe o nome: ");
		String nomeMapa = scanner.nextLine();

		// Adicionando o cliente à lista:
		mapa.put(cpf, nomeMapa);

		// Circundando as instruções de recepção de dados:
		for (int i = 0; i < 3; i++) {
			System.out.print("Informe o CPF: ");
			cpf = scanner.nextLine();
			System.out.print("Informe o nome: ");
			nomeMapa = scanner.nextLine();
			mapa.put(cpf, nomeMapa);
		}

		// Exibindo as informações do mapa:
		System.out.println(mapa);

		// Buscando um cliente:
		System.out.print("Infome um CPF para busca: ");
		String cpfBusca = scanner.nextLine();
		String nomeClienteBuscado = mapa.get(cpfBusca);
		if (nomeClienteBuscado != null)
			System.out.print("Encontramos o cliente: " + nomeClienteBuscado + ", para o CPF " + cpfBusca);
		else
			System.out.print("Nenhum cliente encontrado com o CPF " + cpfBusca);

		// Removendo um item do mapa:
		System.out.print("Informe o CPF para remoção: ");
		String cpfRemocao = scanner.nextLine();
		mapa.remove(cpfRemocao);

	}

}
