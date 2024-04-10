public class Historico {

    private String moeda;
    private String moedaConversao;
    private String mensagem;
    private double valor;
    private double valorConvertido;

    public Historico(String moeda, String moedaConversao, String mensagem, double valor, double valorConvertido) {
        this.moeda = moeda;
        this.moedaConversao = moedaConversao;
        this.mensagem = mensagem;
        this.valor = valor;
        this.valorConvertido = valorConvertido;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getMoedaConversao() {
        return moedaConversao;
    }

    public String getMoeda() {
        return moeda;
    }

    public double getValor() {
        return valor;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }
}
