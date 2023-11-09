import java.util.ArrayList;
import java.util.List;

public abstract class RegistroVendite {
    
    List <Vendita> registro_vendite = new ArrayList<>();
    public RegistroVendite(List registro_vendite){
        this.registro_vendite=registro_vendite;
    }


    public void addItem(Vendita vendite){
        for(int i=0; i<registro_vendite.size();i++){
            if(registro_vendite.get(i)==null){
                registro_vendite.add(vendite);
            }
            break;
        }
    }

    public void removeItem(Vendita vendite){
        for(int i = 0; i<registro_vendite.size(); i++){
            if((registro_vendite.get(i))!=null && registro_vendite.contains(vendite) ){
                registro_vendite.remove(vendite);
            }
            break;
        }
    }
    public void modifyItem(Vendita vendite, String codicevendite){

        for(int i =0; i< registro_vendite.size(); i++ ){
            if(codicevendite.equalsIgnoreCase(registro_vendite.get(i).getCodiceGiocattolo)){
                registro_vendite.set(i, vendite);
            }
        }

    }
    public List<Vendita> getRegistro_vendite() {
        return registro_vendite;
    }
    
    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < registro_vendite.size(); i++){
            if(registro_vendite.get(i) != null){
                result += registro_vendite.get(i).toString() + "\n";
            }
        }
        return result;
    }

}
