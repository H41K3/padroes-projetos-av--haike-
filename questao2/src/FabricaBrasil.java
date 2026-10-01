public class FabricaBrasil implements FabricaArtefatos {
    public ComprovanteFiscal criarComprovante() { return new NFSe(); }
    public Pagamento criarPagamento() { return new Pix(); }
    public TermoPrivacidade criarTermo() { return new TermoLGPD(); }
}
