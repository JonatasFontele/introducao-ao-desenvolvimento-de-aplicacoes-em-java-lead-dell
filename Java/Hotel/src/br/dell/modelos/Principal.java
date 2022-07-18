package br.dell.modelos;

import javax.swing.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

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

        String[] botoes1 = {"Ok", "Pesquisar", "Cancelar"};

        // A melhor maneira de correlacionar é usando um dicionário (Map) e um quarto só pode ter um hóspede e vice-versa, não importando a ordem da lista.
        Map<Integer, Hospede> listaHospedes = new HashMap<>();

        while(true){
            try {
                int option = JOptionPane.showOptionDialog(null, campos, "Cadastrar hóspede", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, botoes1, botoes1[0]);
                if (option == 0) {

                    Hospede hospede = new Hospede();
                    hospede.setCPF(Long.parseLong(((JTextField) campos[1]).getText()));
                    hospede.setRG(Long.parseLong(((JTextField) campos[3]).getText()));
                    if (validaNome(((JTextField) campos[5]).getText()))
                        hospede.setNome(((JTextField) campos[5]).getText());
                    else {
                        System.err.println("Does not match ^[a-zA-Z\\s]+ regex");
                        JOptionPane.showMessageDialog(null, "Digite um nome válido");
                        continue;
                    }
                    hospede.setIdade(Integer.parseInt(((JTextField) campos[7]).getText()));
                    hospede.setEndereco(((JTextField) campos[9]).getText());

                    Quarto quarto = new Quarto(Integer.parseInt(((JTextField) campos[11]).getText()), hospede);

                    listaHospedes.put(quarto.getNumero(), quarto.getHospede());

                    cpfField.setText("");
                    rgField.setText("");
                    nomeField.setText("");
                    idadeField.setText("");
                    enderecoField.setText("");
                    numeroField.setText("");

                    Object retorno[] = {"CPF:", hospede.getCPF(), "RG:", hospede.getRG(), "Nome:", hospede.getNome(), "Idade:",
                            hospede.getIdade(), "Endereço:", hospede.getEndereco(), "Número do quarto:", quarto.getNumero()};

                    JOptionPane.showMessageDialog(null, retorno, "Hóspede cadastrado com sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else if (option == 1) {
                    String quarto_option = JOptionPane.showInputDialog("Pesquisar quarto");
                    if (quarto_option == null) {
                        continue;
                    }
                    Hospede quarto_hospede = listaHospedes.get(Integer.parseInt(quarto_option));
                    if (quarto_hospede == null) {
                        JOptionPane.showMessageDialog(null, "Quarto vazio", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
                        continue;
                    }
                    Object retorno2[] = {"CPF:", quarto_hospede.getCPF(), "RG:", quarto_hospede.getRG(), "Nome:", quarto_hospede.getNome(), "Idade:",
                            quarto_hospede.getIdade(), "Endereço:", quarto_hospede.getEndereco()};
                    JOptionPane.showMessageDialog(null, retorno2, "Atual hóspede", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int option3 = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?", "Nada foi cadastrado", JOptionPane.YES_NO_OPTION);
                    if (option3 == JOptionPane.YES_OPTION)
                        break;
                }
            } catch (NumberFormatException | InputMismatchException exception) {
                System.err.println(exception);
                JOptionPane.showMessageDialog(null, "Digite um valor válido");
            } catch (Exception exception) {
                System.err.println(exception);
                JOptionPane.showMessageDialog(null, "Houve um problema com o valor digitado");
            }

        }
    }
    public static boolean validaNome(String nome) {
        String expression = "^[a-zA-Z\\s]+";
        return nome.matches(expression);
    }
}
