/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tartastadium.model;

/**
 *
 * @author LenovoG500
 */
public class Biglietto {
    
    double prezzo;
    Sconto sconto;
    double prezzoScontato;

    public Biglietto(double prezzo, Sconto sconto) {
        this.prezzo = prezzo;
        this.sconto = sconto;
        this.prezzoScontato = sconto.sconta(prezzo);
    }

    
    
    
    
    public double getPrezzo() {
        return prezzo;
    }

    public Sconto getSconto() {
        return sconto;
    }

    public double getPrezzoScontato() {
        return prezzoScontato;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setSconto(Sconto sconto) {
        this.sconto = sconto;
    }

    public void setPrezzoScontato(double prezzoScontato) {
        this.prezzoScontato = prezzoScontato;
    }

    @Override
    public String toString() {
        return "Biglietto{" + "prezzo=" + prezzo + ", sconto=" + sconto + ", prezzoScontato=" + prezzoScontato + '}';
    }
    
    
    
}
