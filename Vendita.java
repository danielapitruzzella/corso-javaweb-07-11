import java.util.ArrayList;
import java.util.List;

public class Vendita extends RegistroVendite {
    
    private Cliente cliente;
    private Giocattoli giocattolo;

    public Vendita(Cliente c, Giocattoli g){
        this.cliente=c;
        this.giocattolo=g;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public List<Giocattoli> getGiocattoli() {
        return giocattoli;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setGiocattolo(Giocattoli giocattolo) {
        this.giocattolo = giocattolo;
    }


    Giocattoli g1 = new Giocattoli("Giocattolo1", "12", 30.50, 012);
    Cliente c1 = new Cliente(null, null, null);
    List <Giocattoli> giocattoli = new ArrayList<>();
    
    public void registraAcquisto(){
        
    }


}
