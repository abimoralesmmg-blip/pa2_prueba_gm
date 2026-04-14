public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando programa...");

        Pedido p1 = new Pedido("Gene", "cola", "120", "gene@");

        PedidoService service = new PedidoService();
        service.registrar(p1);
    }
}

 