public abstract class ContratacaoFrete {

    protected abstract Frete criarFrete();

    public void contratar(String cliente, double valorCarga) {
        Frete frete = criarFrete();
        double valor = frete.calcularValor(valorCarga);
        System.out.println("===== Resumo da contratação =====");
        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + cliente);
        System.out.printf("Valor do frete: R$ %.2f%n", valor);
        System.out.println("Documentos: " + String.join(", ", frete.getDocumentos()));
        System.out.println();
    }
}
