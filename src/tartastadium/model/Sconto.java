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
public class Sconto {
    
    String nome;
    int percentuale;

    public Sconto(String nome, int percentuale) {
        this.nome = nome;
        this.percentuale = percentuale;
    }

    public String getNome() {
        return nome;
    }

    public int getPercentuale() {
        return percentuale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPercentuale(int percentuale) {
        this.percentuale = percentuale;
    }

    @Override
    public String toString() {
        return "Sconto{" + "nome=" + nome + ", percentuale=" + percentuale + '}';
    }
    
    public double sconta(double prezzo){
        
        return prezzo - ( 100/percentuale);
    }
    
    
}
