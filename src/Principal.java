import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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
                conversor.converter("USD", "BRL", "Dólar para Real");
            }else if (opcao == 2){
                conversor.converter("BRL", "USD", "Real para Dólar");
            }else if (opcao == 3){
                conversor.converter("EUR", "BRL", "Euro para Real");
            }else if (opcao == 4){
                conversor.converter("BRL", "EUR", "Real para Euro");
            }else if (opcao == 5){
                conversor.converter("ARS", "BRL", "Peso Argentino para Real");
            }else if (opcao == 6){
                conversor.converter("BRL", "ARS", "Real para Peso Argentino");
            }else if (opcao == 8){
                conversor.mostrarHistorico();
            }

        }

    }

}
