public class FabricaMexico implements FabricaArtefatos {
    public ComprovanteFiscal criarComprovante() { return new CFDI(); }
    public Pagamento criarPagamento() { return new SPEI(); }
    public TermoPrivacidade criarTermo() { return new TermoLFPDPPP(); }
}
