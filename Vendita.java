import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vendita {
    
    private Cliente cliente;
    private Giocattoli giocattolo;
    private int quantita;
    private double prezzoUnitario;
    private LocalDateTime dataAcquisto;

    public Vendita(Cliente c, Giocattoli g, int q, double p, LocalDateTime data){
        this.cliente=c;
        this.giocattolo=g;
        this.quantita=q;
        this.prezzoUnitario=p;
        this.dataAcquisto=data;

    }

    public Giocattoli getGiocattoli(){
        return giocattolo;
    }    
    public Cliente getCliente() {
        return cliente;
    }
    public int getQuantita(){
        return quantita;
    }
    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }
    public LocalDateTime getDataAcquisto() {
        return dataAcquisto;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setGiocattolo(Giocattoli giocattolo) {
        this.giocattolo = giocattolo;
    }
    public void setQuantita(int quantita){
        this.quantita = quantita;
    }
    public void setPrezzo(double prezzoUnitario){
        this.prezzoUnitario=prezzoUnitario;
    }
    public void setDataAcquisto(LocalDateTime dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    
   @Override
    public String toString(){
        return "Vendita{" +
                "giocattolo=" + giocattolo +
                ", cliente=" + cliente +
                ", quantita=" + quantita +
                ", prezzoUnitario=" + prezzoUnitario +
                ", dataAcquisto='" + dataAcquisto + '\'' +
                '}';
    }

}
