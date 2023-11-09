import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    private List<Giocattoli> giocattoli_disponibili = new ArrayList<>();

    public void addItem(Giocattoli giocattolo){
        giocattoli_disponibili.add(giocattolo);
    }
    public void addCustomer(Cliente cliente){
        
    }
}
