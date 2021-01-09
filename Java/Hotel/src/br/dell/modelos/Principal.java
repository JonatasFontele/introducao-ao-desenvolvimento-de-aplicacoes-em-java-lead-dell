package br.dell.modelos;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		JTextField cpfField = new JTextField();
		JTextField rgField = new JTextField();
		JTextField nomeField = new JTextField();
		JTextField idadeField = new JTextField();
		JTextField enderecoField = new JTextField();
		JTextField numeroField = new JTextField();

		Object campos[] = { "CPF:", cpfField, "RG:", rgField, "Nome:", nomeField, "Idade:", idadeField, "Endereço:",
				enderecoField, "Número do quarto:", numeroField };

		ImageIcon iconAccept = new ImageIcon("src/imagens/accept.png");
		ImageIcon iconCancel = new ImageIcon("src/imagens/cancel.png");

		int option = JOptionPane.showConfirmDialog(null, campos, "Cadastrar hóspede", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			/*
			 * for (Object campo : campos) { if (campo instanceof JTextField) {
			 * System.out.println(((JTextField) campo).getText()); } }
			 */
			Hospede hospede = new Hospede();

			hospede.setCPF(Long.parseLong(((JTextField) campos[1]).getText()));
			hospede.setRG(Long.parseLong(((JTextField) campos[3]).getText()));
			hospede.setNome(((JTextField) campos[5]).getText());
			hospede.setIdade(Integer.parseInt(((JTextField) campos[7]).getText()));
			hospede.setEndereco(((JTextField) campos[9]).getText());

			Quarto quarto = new Quarto(Integer.parseInt(((JTextField) campos[11]).getText()), hospede);

			Object retorno[] = { "CPF:", hospede.getCPF(), "RG:", hospede.getRG(), "Nome:", hospede.getNome(), "Idade:",
					hospede.getIdade(), "Endereço:", hospede.getEndereco(), "Número do quarto:", quarto.getNumero() };

			JOptionPane.showMessageDialog(null, retorno, "Hóspede cadastrado com sucesso", JOptionPane.PLAIN_MESSAGE,
					iconAccept);
		} else
			JOptionPane.showMessageDialog(null, null, "Cadastramento cancelado", JOptionPane.PLAIN_MESSAGE, iconCancel);
	}
}
