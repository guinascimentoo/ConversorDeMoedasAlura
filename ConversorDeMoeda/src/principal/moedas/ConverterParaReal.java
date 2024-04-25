package principal.moedas;

public class ConverterParaReal {

	public void converterDolaresParaReais(double valorRecebido){
        double moedaDolar = valorRecebido * 5.15;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        System.out.println("Você tem $: " + moedaDolar + " Reais");
    }

    public void converterEurosParaReais(double valorRecebido){
        double moedaEuro = valorRecebido * 5.51;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        System.out.println("Você tem $: " + moedaEuro + " Reais");
    }

    public void converterLibrasParaReais(double valorRecebido){
        double moedaLibra = valorRecebido * 6.41;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        System.out.println("Você tem $: " + moedaLibra + " Reais");
    }
    public void converterPesosArgentinosParaReais(double valorRecebido){
        double moedaPesoArgentino = valorRecebido * 0.0059;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        System.out.println("Você tem $: " + moedaPesoArgentino + " Reais");
    }

    public void converterPesosChilenosParaReais(double valorRecebido){
        double moedaPesoChileno = valorRecebido * 0.0054;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        System.out.println("Você tem $: " + moedaPesoChileno + " Reais");
    }
}
