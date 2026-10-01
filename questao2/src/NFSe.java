public class NFSe implements ComprovanteFiscal {
    public String descrever(double valor) {
        return String.format("NFS-e com ISS de 5%% (imposto: R$ %.2f)", valor * 0.05);
    }
}
