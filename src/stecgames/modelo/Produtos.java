/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Produtos {
    private int codigo;
    private String nome;
    private String marca;
    private int qntEstoque;
    private int qntMinima;
    private String unidMedida;
    private float valorUnidade;
    private Date dtCadastro;
    private String tipo;
    private int numPedido;
    private int codA;
    private int codP;
    
    public Produtos() {
        
          dtCadastro = new Date();
    }

    public int getCodP() {
        return codP;
    }

    public void setCodP(int codP) {
        this.codP = codP;
    }
    
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Produtos(int codigo) {
        this.codigo = codigo;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the qntEstoque
     */
    public int getQntEstoque() {
        return qntEstoque;
    }

    /**
     * @param qntEstoque the qntEstoque to set
     */
    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    /**
     * @return the qntMinima
     */
    public int getQntMinima() {
        return qntMinima;
    }

    /**
     * @param qntMinima the qntMinima to set
     */
    public void setQntMinima(int qntMinima) {
        this.qntMinima = qntMinima;
    }

    /**
     * @return the unidMedida
     */
    public String getUnidMedida() {
        return unidMedida;
    }

    /**
     * @param unidMedida the unidMedida to set
     */
    public void setUnidMedida(String unidMedida) {
        this.unidMedida = unidMedida;
    }

    /**
     * @return the valorUnidade
     */
    public float getValorUnidade() {
        return valorUnidade;
    }

    /**
     * @param valorUnidade the valorUnidade to set
     */
    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    /**
     * @return the dtCadastro
     */
    public Date getDtCadastro() {
        return dtCadastro;
    }

    /**
     * @param dtCadastro the dtCadastro to set
     */
    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the codA
     */
    public int getCodA() {
        return codA;
    }

    /**
     * @param codA the codA to set
     */
    public void setCodA(int codA) {
        this.codA = codA;
    }
    
    
}
