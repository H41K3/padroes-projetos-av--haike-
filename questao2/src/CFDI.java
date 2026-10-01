public class CFDI implements ComprovanteFiscal {
    public String descrever(double valor) {
        return String.format("CFDI com IVA de 16%% (imposto: R$ %.2f)", valor * 0.16);
    }
}
