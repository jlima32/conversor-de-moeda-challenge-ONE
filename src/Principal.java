import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Consulta consulta = new Consulta();
        Conversor novaMoeda = consulta.buscaMoeda();

        double valorMoeda = novaMoeda.getConversionRates().get("BRL");


        System.out.println(valorMoeda);

        }

    }
