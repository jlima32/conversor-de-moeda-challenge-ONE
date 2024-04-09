import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Consulta consulta = new Consulta();

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("***********************");
            System.out.println("Seja bem-vindo ao conversor de moeda");
            System.out.println("1) Dólar para Real Brasileiro");
            System.out.println("2) Real Brasileiro para Dólar");
            System.out.println("3) Euro para Real Brasileiro");
            System.out.println("4) Real Brasileiro para Euro");
            System.out.println("5) Peso Argentino para Real Brasileiro");
            System.out.println("6) Real Brasileiro para Peso Argentino");
            System.out.println("7) Sair");

            System.out.println("Escolha uma opção válida:");
            Scanner leitura = new Scanner(System.in);
            opcao = leitura.nextInt();

            if(opcao == 1){
                String moeda = "USD";
                String moedaConversao = "BRL";
                Conversor novaMoeda = consulta.buscaMoeda(moeda);
                System.out.println("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                double moedaFinal = novaMoeda.getConversionRates().get(moedaConversao);
                double valorConvertido = consulta.converteMoeda(valor,moedaFinal);

                System.out.println("----------------------------");
                System.out.println("Convertendo Dólar para Real");
                System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
            }else if (opcao == 2){
                String moeda = "BRL";
                String moedaConversao = "USD";
                Conversor novaMoeda = consulta.buscaMoeda(moeda);
                System.out.println("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                double moedaFinal = novaMoeda.getConversionRates().get(moedaConversao);
                double valorConvertido = consulta.converteMoeda(valor,moedaFinal);

                System.out.println("----------------------------");
                System.out.println("Convertendo Real para Dólar");
                System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
            }else if (opcao == 3){
                String moeda = "EUR";
                String moedaConversao = "BRL";
                Conversor novaMoeda = consulta.buscaMoeda(moeda);
                System.out.println("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                double moedaFinal = novaMoeda.getConversionRates().get(moedaConversao);
                double valorConvertido = consulta.converteMoeda(valor,moedaFinal);

                System.out.println("----------------------------");
                System.out.println("Convertendo Euro para Real");
                System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
            }else if (opcao == 4){
                String moeda = "BRL";
                String moedaConversao = "EUR";
                Conversor novaMoeda = consulta.buscaMoeda(moeda);
                System.out.println("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                double moedaFinal = novaMoeda.getConversionRates().get(moedaConversao);
                double valorConvertido = consulta.converteMoeda(valor,moedaFinal);

                System.out.println("----------------------------");
                System.out.println("Convertendo Real para Euro");
                System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
            }else if (opcao == 5){
                String moeda = "ARS";
                String moedaConversao = "BRL";
                Conversor novaMoeda = consulta.buscaMoeda(moeda);
                System.out.println("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                double moedaFinal = novaMoeda.getConversionRates().get(moedaConversao);
                double valorConvertido = consulta.converteMoeda(valor,moedaFinal);

                System.out.println("----------------------------");
                System.out.println("Convertendo Peso Argentino para Real");
                System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
            }else if (opcao == 6){
                String moeda = "BRL";
                String moedaConversao = "ARS";
                Conversor novaMoeda = consulta.buscaMoeda(moeda);
                System.out.println("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                double moedaFinal = novaMoeda.getConversionRates().get(moedaConversao);
                double valorConvertido = consulta.converteMoeda(valor,moedaFinal);

                System.out.println("----------------------------");
                System.out.println("Convertendo Real para Peso Argentino");
                System.out.println(valor +" [" + moeda + "] corresponde ao valor final de " + valorConvertido + " [" + moedaConversao + "]");
            }

        }

        }

    }
