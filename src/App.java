public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando programa...");

        // Corregido: "120" entre comillas porque en Pedido es String
        Pedido p1 = new Pedido("Gene", "cola", "120", "gene@");

        // Corregido: el nombre de la variable (service)
        PedidoService service = new PedidoService();
        service.registrar(p1);
    }
}

 