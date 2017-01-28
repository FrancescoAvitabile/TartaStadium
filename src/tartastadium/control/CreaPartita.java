/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tartastadium.control;

import tartastadium.file.FileManager;
import tartastadium.model.Biglietto;
import tartastadium.model.Partita;
import tartastadium.model.Sconto;
import tartastadium.model.stadio.Stadio;

/**
 *
 * @author LenovoG500
 */
public class CreaPartita implements Command{

    Partita partita;
    FileManager database;

    public CreaPartita( String squadraCasa, String squadraOspiti, Stadio stadio, Biglietto biglietto, Sconto sconto,FileManager database) {
        this.partita = new Partita(squadraCasa, squadraOspiti, stadio, biglietto, sconto);
        this.database = database;
        
    }
    
    
    
    @Override
    public String name() {
    return "Crea Nuovo Incontro";
    }

    @Override
    public void execute() {
        database.store();
    }
    
    
}
