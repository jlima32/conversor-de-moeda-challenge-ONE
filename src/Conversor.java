import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Conversor {
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void  Converter(String moeda, String moedaConversao, String mensagem) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Consulta consulta = new Consulta();
        Conversor consultaMoeda = consulta.buscaMoeda(moeda);
        double moedaFinal = consultaMoeda.getConversionRates().get(moedaConversao);
        System.out.println("Digite o valor que deseja converter: ");
        double valor = leitura.nextDouble();
        double valorConvertido = converterValor(valor,moedaFinal);
        System.out.println("----------------------------");
        System.out.println(mensagem);
        System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
    }

    public double converterValor(double moedaInicial, double moedaFinal){

        return moedaInicial * moedaFinal;
    }

}
