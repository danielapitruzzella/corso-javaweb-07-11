public class Cliente {
    
    private String nome;
    private String id;
    private String email;

    public Cliente(String n, String i, String e){
        this.nome=n;
        this.id=i;
        this.email=e;
    }
    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}