package classes;

import javax.swing.JOptionPane;
 
public class MercadinhoUI {
	
	public static void main(String args[]) {
	    // Lista de produtos e seus respectivos pre�os
		String produtos[] = {"", "Macarr�o", "Arroz", "Batata", "Caf�", "Leite", "Feij�o"};
		double precos [] = {0, 1.99, 2.75, 3.80, 4.00, 2.99, 3.50};

		//Obter o c�digo do produto de 1 a 6
		String codigoProdutoStr = JOptionPane.showInputDialog(null, "Informe o c�digo do produto:");
		int codigoProduto = Integer.parseInt(codigoProdutoStr);

		//Se o c�digo do produto estiver correto, solicitar a quantidade do produto
		if (codigoProduto > 0 && codigoProduto < produtos.length) {
				System.out.println("Produto:" + produtos[codigoProduto]);

				//Obter a quantidade do produto
				String quantidadeStr = JOptionPane.showInputDialog(null, "Informe a quantidade do produto");
				int quantidade = Integer.parseInt(quantidadeStr);

				//Calcula valor total
				double total = precos[codigoProduto] * quantidade;
				JOptionPane.showMessageDialog(null,
						"Produto: " + produtos[codigoProduto] + "\n"
						+ "Valor unit�rio: R$ " + precos[codigoProduto] + "\n"
						+ "Quantidade: " + quantidade + "\n"
						+ "--------------------------------------" + "\n"
						+ "TOTAL: R$ " + total);

		} else {
			JOptionPane.showMessageDialog(null, "Produto n�o encontrado!");
		}
	}
}