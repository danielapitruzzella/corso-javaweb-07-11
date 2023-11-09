import java.util.List;

public class Cliente {
    
    private String nome, cognome,username, password, email;
    private static Integer codiceClienteProgressivo=1;
    private final String codiceCliente; 
    private Permessi permesso=Permessi.USER_BASE;
    
    //private List carello_giocattoli;

    public Cliente(String n, String c, String u, String p, String e){
        this.nome=n;
        this.cognome=c;
        this.email=e;
        this.username=u;
        this.password=p;
        codiceCliente = "ID_"+ codiceClienteProgressivo.toString();
        codiceClienteProgressivo++;
    }
    public Cliente(String n, String c, String u, String p, String e, Permessi per){
        this(n, c, u, p, e);
        this.permesso=per;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getCodiceCliente() {
        return codiceCliente;
    }
  
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
    public void setEmail(String email) {
        this.email = email;
    }

    

}