public class PedidoService {

    public void registrar(Pedido pedido){
        System.out.println("Registrar pedido");
        System.out.println("Cliente: "+ pedido.getCliente());
        System.out.println("Total: "+pedido.getTotal());
        System.out.println("Guardando en la base de datos");
    
        NotificacionMail n1= new NotificacionMail();
        n1.enviarMail ( pedido.getCorreo(),"se envio el pedido");
        }


}
