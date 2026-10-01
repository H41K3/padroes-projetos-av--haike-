public class Main {
    public static void main(String[] args) {
        ContratacaoFrete rodoviaria = new ContratacaoRodoviaria();
        ContratacaoFrete aerea = new ContratacaoAerea();
        ContratacaoFrete maritima = new ContratacaoMaritima();

        rodoviaria.contratar("Oswaldo Cargas", 5000);
        aerea.contratar("Lamine Airline", 1000);
        maritima.contratar("Titanic Containers", 10000);
    }
}
