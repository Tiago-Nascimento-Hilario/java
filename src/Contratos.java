import java.util.Date;

/**
 * ContratoPorHora
 */
public class Contratos {

    private Date data;
    private Double valorPorHora;
    private Integer hora;

    public Contratos(Date data, Double valorPorHora, Integer hora){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public Date getDate(){
        return data;
    } 
    public void setDate(Date data){
        this.data = data;
    }

    public Double getValorPorHora(){
        return valorPorHora;
    }
    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public Integer getHora(){
        return  hora;
    }
    public void setHora(Integer hora){
        this.hora = hora;
    }

    public Double valorTotal(){
        return valorPorHora * hora;
    }
    
}