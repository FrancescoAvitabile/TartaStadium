/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tartastadium.model.stadio;

import java.util.ArrayList;

/**
 *
 * @author LenovoG500
 */
public class Settore {
    
    
    String nome;
    ArrayList<Posto> posti;

    public Settore(String nome, ArrayList<Posto> posti) {
        this.nome = nome;
        this.posti = posti;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Posto> getPosti() {
        return posti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosti(ArrayList<Posto> posti) {
        this.posti = posti;
    }

    @Override
    public String toString() {
        return "Settore{" + "nome=" + nome + ", posti=" + posti + '}';
    }
    
    
}
