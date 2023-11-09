import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
 
    private List<Giocattoli> giocattoli_disponibili = new ArrayList<>();

    public Inventario(List giocattoli_disponibili){
        this.giocattoli_disponibili=giocattoli_disponibili;
    }



    public void addItem(Giocattoli giocattolo){
        for(int i=0; i<giocattoli_disponibili.size();i++){
            if(giocattoli_disponibili.get(i)==null){
                giocattoli_disponibili.add(giocattolo);
            }
            break;
        }
    }

    public void removeItem(Giocattoli giocattolo){
        for(int i = 0; i<giocattoli_disponibili.size(); i++){
            if((giocattoli_disponibili.get(i))!=null && giocattoli_disponibili.contains(giocattolo) ){
                giocattoli_disponibili.remove(giocattolo);
            }
            break;
        }
    }
    public void modifyItem(Giocattoli giocattolo, String codiceGiocattolo){

        for(int i =0; i< giocattoli_disponibili.size(); i++ ){
            if(codiceGiocattolo.equalsIgnoreCase(giocattoli_disponibili.get(i).getCodiceGiocattolo())){
                giocattoli_disponibili.set(i, giocattolo);
            }
        }

    }
    
}
