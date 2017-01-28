/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tartastadium.control;

import tartastadium.file.FileManager;
import tartastadium.model.Biglietto;
import tartastadium.model.Sconto;

/**
 *
 * @author LenovoG500
 */
public class CreaBiglietto implements Command{
    
    Biglietto biglietto;
    FileManager database;

    public CreaBiglietto(double prezzo , Sconto sconto, FileManager database) {
        this.biglietto = new Biglietto(prezzo,sconto);
        this.database = database;
    }
    
    @Override
    public void execute() {
        database.store();
    }

    @Override
    public String name() {
        return "Crea nuovo ticket";
    }
    
}
