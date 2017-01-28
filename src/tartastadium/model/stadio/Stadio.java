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
public class Stadio {
    String nome;
    int capienza;
    ArrayList<Settore> settori;

    public Stadio(String nome, int capienza, ArrayList<Settore> settori) {
        this.nome = nome;
        this.capienza = capienza;
        this.settori = settori;
    }

    public String getNome() {
        return nome;
    }

    public int getCapienza() {
        return capienza;
    }

    public ArrayList<Settore> getSettori() {
        return settori;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public void setSettori(ArrayList<Settore> settori) {
        this.settori = settori;
    }

    @Override
    public String toString() {
        return "Stadio{" + "nome=" + nome + ", capienza=" + capienza + ", settori=" + settori + '}';
    }
    
    
    
    
    
}
