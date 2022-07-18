package br.dell.modelos;

/**
 * Classe representando as informações de um hóspede
 *
 * @author Jonatas Fontele
 * @version 0.1
 */

public class Hospede {
	
	private long CPF;
	private long RG;
	private String nome;
	private int idade;
	private String endereco;
	
	//Getters & setters
	public long getCPF() {
		return CPF;
	}
	
	public void setCPF(long CPF) {
		this.CPF = CPF;
	}
	
	public long getRG() {
		return RG;
	}
	
	public void setRG(long RG) {
		this.RG = RG;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//Constructors

	/**
	 * Construtor para inicializar o objeto hospede vazio
	 */
	public Hospede() {
		
	}

	/**
	 * Construtor para inicializar o objeto hospede a partir de cpf, rg, nome, idade e endereço
	 * @param CPF
	 * @param RG
	 * @param nome do hóspede
	 * @param idade
	 * @param endereco residência do hóspede
	 */
	public Hospede(long CPF, long RG, String nome, int idade, String endereco) {
		this.CPF = CPF;
		this.RG = RG; 
		this.nome = nome; 
		this.idade = idade; 
		this.endereco = endereco;
	}

}
