package br.dell.modelos;

import javax.swing.*;
import java.util.InputMismatchException;

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

        while(true){
            int option = JOptionPane.showConfirmDialog(null, campos, "Cadastrar hóspede", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                /*
                 * for (Object campo : campos) { if (campo instanceof JTextField) {
                 * System.out.println(((JTextField) campo).getText()); } }
                 */

                try {
                    Hospede hospede = new Hospede();
                    hospede.setCPF(Long.parseLong(((JTextField) campos[1]).getText()));
                    hospede.setRG(Long.parseLong(((JTextField) campos[3]).getText()));
                    if(validaNome(((JTextField) campos[5]).getText()))
                        hospede.setNome(((JTextField) campos[5]).getText());
                    else {
                        System.err.println("Does not match ^[a-zA-Z\\s]+ regex");
                        JOptionPane.showMessageDialog(null, "Digite um nome válido");
                        continue;
                    }
                    hospede.setIdade(Integer.parseInt(((JTextField) campos[7]).getText()));
                    hospede.setEndereco(((JTextField) campos[9]).getText());

                    Quarto quarto = new Quarto(Integer.parseInt(((JTextField) campos[11]).getText()), hospede);

                    Object retorno[] = { "CPF:", hospede.getCPF(), "RG:", hospede.getRG(), "Nome:", hospede.getNome(), "Idade:",
                            hospede.getIdade(), "Endereço:", hospede.getEndereco(), "Número do quarto:", quarto.getNumero() };

                    JOptionPane.showMessageDialog(null, retorno, "Hóspede cadastrado com sucesso", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }catch (NumberFormatException | InputMismatchException exception) {
                    System.err.println(exception);
                    JOptionPane.showMessageDialog(null, "Digite um valor válido");
                }catch (Exception exception) {
                    System.err.println(exception);
                    JOptionPane.showMessageDialog(null, "Houve um problema com o valor digitado");
                }

            } else {
                //JOptionPane.showMessageDialog(null, "Nada foi cadastrado", "Cadastramento cancelado", JOptionPane.PLAIN_MESSAGE, iconCancel);
                int option2 =JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?", "Nada foi cadastrado", JOptionPane.YES_NO_OPTION);
                if (option2 == JOptionPane.YES_OPTION)
                    break;
            }

        }
    }
    public static boolean validaNome(String nome) {
        String expression = "^[a-zA-Z\\s]+";
        return nome.matches(expression);
    }
}
