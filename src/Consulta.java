import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Consulta {

    public Conversor buscaMoeda(String moeda) throws IOException, InterruptedException {


        URI url = URI.create("https://v6.exchangerate-api.com/v6/23e9c3883e26a50da86cf20f/latest/" + moeda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Conversor.class);

    }


}
