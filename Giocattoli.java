public class Giocattoli {
    private String nome;
    private String id;
    private double prezzo;
    private int eta;

    public Giocattoli(String n, String i, double p, int e){
        this.nome=n;
        this.id=i;
        this.prezzo=p;
        this.eta=e;

    }
    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public int getEta() {
        return eta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub"
        String descrizione = "";
        descrizione+= "Nome: "+ this.getNome();
        descrizione+= "Id: " + this.getId();
        descrizione+= "Prezzo: "+ this.getPrezzo() +" euro";
        descrizione+= "Eta' consigliata: " + this.getEta();
        return descrizione ;

    }
}
