package enumeradores;

import java.util.Date;

public class TestePedidos {
    public static void main(String[] args) {

        Pedidos primeiro_pedido = new Pedidos(01, new Date(), StatusPedidos.LIBERADO);
        System.out.println(primeiro_pedido);
        System.out.println("-----------------------");

        StatusPedidos pedido1 = StatusPedidos.PENDENTE;
        //convertendo um enum e string
        StatusPedidos pedido2 = StatusPedidos.valueOf("PENDENTE");

        System.out.println(pedido1 + " | " + pedido2);
        

    }
}
