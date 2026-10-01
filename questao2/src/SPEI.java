public class SPEI implements Pagamento {
    public String descrever(double valor) {
        return String.format("Pagamento via SPEI de R$ %.2f", valor);
    }
}
