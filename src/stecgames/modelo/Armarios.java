/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

/**
 *
 * @author Daniel
 */
public class Armarios {
    private int codArmario;
    private int qtdMaxima;
    private int qtdOcupada;

    
    public Armarios() {
    }

    public Armarios(int codArmario) {
        this.codArmario = codArmario;
    }

    /**
     * @return the codArmario
     */
    public int getCodArmario() {
        return codArmario;
    }

    /**
     * @param codArmario the codArmario to set
     */
    public void setCodArmario(int codArmario) {
        this.codArmario = codArmario;
    }

    /**
     * @return the qtdMaxima
     */
    public int getQtdMaxima() {
        return qtdMaxima;
    }

    /**
     * @param qtdMaxima the qtdMaxima to set
     */
    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    /**
     * @return the qtdOcupada
     */
    public int getQtdOcupada() {
        return qtdOcupada;
    }

    /**
     * @param qtdOcupada the qtdOcupada to set
     */
    public void setQtdOcupada(int qtdOcupada) {
        this.qtdOcupada = qtdOcupada;
    }

    
    
    
    

  
   
    
    
}
