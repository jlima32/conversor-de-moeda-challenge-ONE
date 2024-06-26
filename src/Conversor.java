import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Conversor {
    List<Historico> historico = new ArrayList<>();
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void  converter(String moeda, String moedaConversao, String mensagem) throws IOException, InterruptedException {
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

        Historico consultaRealizada = new Historico(moeda, moedaConversao, mensagem, valor, valorConvertido);
        historico.add(consultaRealizada);

    }

    public double converterValor(double moedaInicial, double moedaFinal){

        return moedaInicial * moedaFinal;
    }

    public void mostrarHistorico(){
        System.out.println("Histórico de Conversões");
        if(historico.size() > 0){

            for (Historico h : historico){
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("Conversão de: " + h.getMoeda() + " | Valor a converter: " + h.getValor() + " | Para: " + h.getMoedaConversao() + " | Resultado da Conversão: " + h.getValorConvertido());

            }
        }else{
            System.out.println("Nenhuma Conversão efetuada");
        }
    }

}
