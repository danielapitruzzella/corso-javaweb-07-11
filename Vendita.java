import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vendita extends RegistroVendite {
    
    private Cliente cliente;
    private Giocattoli acquisto;
    private LocalDateTime dataAcquisto;

    public Vendita(Cliente c, Giocattoli g, LocalDateTime data){
        this.cliente=c;
        this.acquisto=g;
        this.dataAcquisto=data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setAcquisto(Giocattoli acquisto) {
        this.acquisto = acquisto;
    }
    public LocalDateTime getDataAcquisto() {
        return dataAcquisto;
    }
    public void setDataAcquisto(LocalDateTime dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }


    
    public void registraAcquisto(){
        
    }


}
