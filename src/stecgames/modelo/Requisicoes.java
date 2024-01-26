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
public class Requisicoes {
    private int codigoRequisicao;
    private String nomeProduto;
    private String marcaProduto;
    private int qtdProduto;
    private String setor;

    public Requisicoes() {
    }
    
    
    
    public Requisicoes(int codigoRequisicao) {
        this.codigoRequisicao = codigoRequisicao;
    }
    
    
    /**
     * @return the codigoRequisicao
     */
    public int getCodigoRequisicao() {
        return codigoRequisicao;
    }

    /**
     * @param codigoRequisicao the codigoRequisicao to set
     */
    public void setCodigoRequisicao(int codigoRequisicao) {
        this.codigoRequisicao = codigoRequisicao;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the marcaProduto
     */
    public String getMarcaProduto() {
        return marcaProduto;
    }

    /**
     * @param marcaProduto the marcaProduto to set
     */
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    /**
     * @return the qtdProduto
     */
    public int getQtdProduto() {
        return qtdProduto;
    }

    /**
     * @param qtdProduto the qtdProduto to set
     */
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    
    
    
}
