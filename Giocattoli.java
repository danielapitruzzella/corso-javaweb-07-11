public class Giocattoli {


    private static Integer codiceGiocattoloProgressivo=1;
    private final String codiceGiocattolo;
    private String nome;
    private double prezzo;
    private int eta;
    private int quantita; 

    public Giocattoli(String n, String i, double p, int e, int q){
        this.nome=n;
        this.prezzo=p;
        this.eta=e;
        this.quantita=q;
        codiceGiocattolo= nome.toUpperCase() + "_PROD_" + codiceGiocattoloProgressivo.toString();
        codiceGiocattoloProgressivo++;
    }
    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public int getEta() {
        return eta;
    }
    public int getQuantita() {
        return quantita;
    }
    public String getCodiceGiocattolo() {
        return codiceGiocattolo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public void decQuantita(int quantita){
        quantita--;
    }
    @Override
    public String toString() {
       
        String descrizione = "";
        descrizione+= "Nome: "+ this.getNome();
        descrizione+= "Id: " + this.getId();
        descrizione+= "Prezzo: "+ this.getPrezzo() +" euro";
        descrizione+= "Eta' consigliata: " + this.getEta();
        return descrizione ;

    }
}
