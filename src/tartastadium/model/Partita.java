/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tartastadium.model;

import tartastadium.model.stadio.Stadio;

/**
 *
 * @author LenovoG500
 */
public class Partita {
    
    String squadraCasa;
    String squadraOspiti;
    Stadio stadio;
    Biglietto biglietto;
    Sconto sconto;

    public Partita(String squadraCasa, String squadraOspiti, Stadio stadio, Biglietto biglietto, Sconto sconto) {
        this.squadraCasa = squadraCasa;
        this.squadraOspiti = squadraOspiti;
        this.stadio = stadio;
        this.biglietto = biglietto;
        this.sconto = sconto;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public String getSquadraOspiti() {
        return squadraOspiti;
    }

    public Stadio getStadio() {
        return stadio;
    }

    public Biglietto getBiglietto() {
        return biglietto;
    }

    public Sconto getSconto() {
        return sconto;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public void setSquadraOspiti(String squadraOspiti) {
        this.squadraOspiti = squadraOspiti;
    }

    public void setStadio(Stadio stadio) {
        this.stadio = stadio;
    }

    public void setBiglietto(Biglietto biglietto) {
        this.biglietto = biglietto;
    }

    public void setSconto(Sconto sconto) {
        this.sconto = sconto;
    }

    @Override
    public String toString() {
        return "Partita{" + "squadraCasa=" + squadraCasa + ", squadraOspiti=" + squadraOspiti + ", stadio=" + stadio + ", biglietto=" + biglietto + ", sconto=" + sconto + '}';
    }
    
    
    
    
    
}
