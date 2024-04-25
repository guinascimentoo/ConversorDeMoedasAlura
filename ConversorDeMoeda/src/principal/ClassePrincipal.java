package principal;

import principal.moedas.ConverterParaMoedas;
import principal.moedas.ConverterParaReal;

public class ClassePrincipal {

	public static void main(String[] args) {
		ConverterParaReal cpr = new ConverterParaReal();
		ConverterParaMoedas cpm = new ConverterParaMoedas();
		
		String options = JOptionPane.showInputDialog(null, "Digite 1 para iniciar", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { "Conversor de Moedas"}).toString();
		
		switch (options) {
		case "Conversor de Moedas":
			String input = JOptionPane.showInputDialog("Insira um valor: ");

			if (checkout(input)) {
				double valorRecebido = Double.parseDouble(input);
				moedas.ConverterParaMoedas(valorRecebido);

				int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

				if (JOptionPane.OK_OPTION == resposta) {
					moedas.ConverterParaMoedas(valorRecebido);
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
			break;
	}
	}
	public static boolean checkout(String input) {
		try {
			double value = Double.parseDouble(input);
			if (value >= 0 || value < 0)
				;
			return true;
		} catch (NumberFormatException exc) {
			return false;
		}
	}
}