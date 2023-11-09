/*
 * Progetto Giocattoli
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main{
    /*public static void main(String[] args) {
        
        List <Vendita> vendite = new ArrayList<>();

       // Inventario.addItem(new Giocattoli("giocatto", null, 0, 0))
        //Inventario.addItem(new Giocattoli("giocatto", null, 0, 0))

        System.out.println("HELLO WORLD");

        System.out.println();

    }*/
    public static void main(String[] args) {
        DbManager dbManager = new DbManager();
        dbManager.connect();
    }
}