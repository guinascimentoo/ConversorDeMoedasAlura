package principal.moedas;

public class ConverterParaMoedas {

	public void converterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.15;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		System.out.println("Você tem $: " + moedaDolar + " Dolares");
		
	}

	public void converterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.51;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		System.out.println("Você tem $: " + moedaEuro + " Euros");
		
	}

	public void converterReaisParaLibraEsterlina(double valorRecebido) {
		double moedaLibraEsterlina = valorRecebido / 6.41;
		moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100d) / 100;
		System.out.println("Você tem $: " + moedaLibraEsterlina + " Libras");
	}

	public void converterReaisParaPesoArgentino(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.0059;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		System.out.println("Você tem $: " + moedaPesoArgentino + " Pesos argentinos");
	}

	public void converterReaisParaPesoChileno(double valorRecebido) {
		double moedaPesoChileno = valorRecebido /0.0054;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		System.out.println("Você tem $: " + moedaPesoChileno + " Pesos chilenos");
	}
}
