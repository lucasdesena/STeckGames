/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

/**
 *
 * @author Gustavo
 */
public class TurmaCurso {
    
    private int Cod;
    private String nome;
    private int IdadeMin;
    private int IdadeMax;
    private String Periodo;
    private double ValorMat;
    private double ValorMens;
    private int QtdParcelas;
    private String Observacao;

    public TurmaCurso() {
    }

    public TurmaCurso(int Cod, String nome, int IdadeMin, int IdadeMax, String Periodo, double ValorMat, double ValorMens, int QtdParcelas, String Observacao) {
        this.Cod = Cod;
        this.nome = nome;
        this.IdadeMin = IdadeMin;
        this.IdadeMax = IdadeMax;
        this.Periodo = Periodo;
        this.ValorMat = ValorMat;
        this.ValorMens = ValorMens;
        this.QtdParcelas = QtdParcelas;
        this.Observacao = Observacao;
    }

    /**
     * @return the Cod
     */
    public int getCod() {
        return Cod;
    }

    /**
     * @param Cod the Cod to set
     */
    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the IdadeMin
     */
    public int getIdadeMin() {
        return IdadeMin;
    }

    /**
     * @param IdadeMin the IdadeMin to set
     */
    public void setIdadeMin(int IdadeMin) {
        this.IdadeMin = IdadeMin;
    }

    /**
     * @return the IdadeMax
     */
    public int getIdadeMax() {
        return IdadeMax;
    }

    /**
     * @param IdadeMax the IdadeMax to set
     */
    public void setIdadeMax(int IdadeMax) {
        this.IdadeMax = IdadeMax;
    }

    /**
     * @return the Periodo
     */
    public String getPeriodo() {
        return Periodo;
    }

    /**
     * @param Periodo the Periodo to set
     */
    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    /**
     * @return the ValorMat
     */
    public double getValorMat() {
        return ValorMat;
    }

    /**
     * @param ValorMat the ValorMat to set
     */
    public void setValorMat(double ValorMat) {
        this.ValorMat = ValorMat;
    }

    /**
     * @return the ValorMens
     */
    public double getValorMens() {
        return ValorMens;
    }

    /**
     * @param ValorMens the ValorMens to set
     */
    public void setValorMens(double ValorMens) {
        this.ValorMens = ValorMens;
    }

    /**
     * @return the QtdParcelas
     */
    public int getQtdParcelas() {
        return QtdParcelas;
    }

    /**
     * @param QtdParcelas the QtdParcelas to set
     */
    public void setQtdParcelas(int QtdParcelas) {
        this.QtdParcelas = QtdParcelas;
    }

    /**
     * @return the Observacao
     */
    public String getObservacao() {
        return Observacao;
    }

    /**
     * @param Observacao the Observacao to set
     */
    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
        
    
    
    
    
    
    
}
