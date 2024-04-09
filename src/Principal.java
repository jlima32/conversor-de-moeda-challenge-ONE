import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Conversor conversor = new Conversor();
        Menu menu = new Menu();
        int opcao = 0;

        while (opcao != 7) {

            menu.exibirMenu();

            Scanner leitura = new Scanner(System.in);
            opcao = leitura.nextInt();

            if(opcao == 1){
                conversor.Converter("USD", "BRL", "Convertendo Dólar para Real");
            }else if (opcao == 2){
                conversor.Converter("BRL", "USD", "Convertendo Real para Dólar");
            }else if (opcao == 3){
                conversor.Converter("EUR", "BRL", "Convertendo Euro para Real");
            }else if (opcao == 4){
                conversor.Converter("BRL", "EUR", "Convertendo Real para Euro");
            }else if (opcao == 5){
                conversor.Converter("ARS", "BRL", "Convertendo Peso Argentino para Real");
            }else if (opcao == 6){
                conversor.Converter("BRL", "ARS", "Convertendo Real para Peso Argentino");
            }

        }

    }

}
