package enumeradores;

import java.util.Date;

public class Pedidos {
    private Integer id;
    private Date momento;
    private StatusPedidos status;

    // construtor
    public Pedidos() {

    }

    // construtor
    public Pedidos(Integer id, Date momento, StatusPedidos status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    // métodos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedidos getStatus() {
        return status;
    }

    public void setStatus(StatusPedidos status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos [id=" + id + ", momento=" + momento + ", status=" + status + "]";
    }

    
}
