package br.dell.modelos;

/**
 * Classe representando as informações de um quarto
 *
 * @author Jonatas Fontele
 * @version 0.1
 */

public class Quarto {
	
	private int numero;
	private Hospede hospede;
	
	//Getters & setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	//Constructors

	/**
	 * Construtor para inicializar o objeto hospede a partir de número e hóspede
	 * @param numero do quarto
	 * @param hospede objeto associado ao quarto
	 */
	public Quarto(int numero, Hospede hospede) {
		this.numero = numero;
		this.hospede = hospede;
	}
}
