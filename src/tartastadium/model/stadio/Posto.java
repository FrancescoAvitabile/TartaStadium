/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tartastadium.model.stadio;

/**
 *
 * @author LenovoG500
 */
public class Posto {
    
    static final int stati[] = {0,1,2};
    
    int numeroPosto;
    int stato;

    public Posto(int numeroPosto, int stato) {
        this.numeroPosto = numeroPosto;
        this.stato = stato;
    }

    public static int[] getStati() {
        return stati;
    }

    public int getNumeroPosto() {
        return numeroPosto;
    }

    public int getStato() {
        return stato;
    }

    public void setNumeroPosto(int numeroPosto) {
        this.numeroPosto = numeroPosto;
    }

    public void setStato(int stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Posto{" + "numeroPosto=" + numeroPosto + ", stato=" + stato + '}';
    }
    
    
}
