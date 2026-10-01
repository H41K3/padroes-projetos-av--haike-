public class Main {
    public static void main(String[] args) {
        new Assinatura("Cliente Brasil", 1000.00, new FabricaBrasil()).ativar();
        new Assinatura("Cliente México", 1000.00, new FabricaMexico()).ativar();
    }
}
