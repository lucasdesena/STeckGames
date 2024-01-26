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
public class TurmaTreinamento {
    
    private int Cod;
    private String Empresa;
    private String Conteudo;
    private int CargaHoraria;
    private String DataInicio;
    private String DataTermino;
    private double ValorTreinamento;
    private int Parcelas;
    private String Observacao;

    public TurmaTreinamento() {
    }

    public TurmaTreinamento(int Cod, String Empresa, String Conteudo, int CargaHoraria, String DataInicio, String DataTermino, double ValorTreinamento, int Parcelas, String Observacao) {
        this.Cod = Cod;
        this.Empresa = Empresa;
        this.Conteudo = Conteudo;
        this.CargaHoraria = CargaHoraria;
        this.DataInicio = DataInicio;
        this.DataTermino = DataTermino;
        this.ValorTreinamento = ValorTreinamento;
        this.Parcelas = Parcelas;
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
     * @return the Empresa
     */
    public String getEmpresa() {
        return Empresa;
    }

    /**
     * @param Empresa the Empresa to set
     */
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    /**
     * @return the Conteudo
     */
    public String getConteudo() {
        return Conteudo;
    }

    /**
     * @param Conteudo the Conteudo to set
     */
    public void setConteudo(String Conteudo) {
        this.Conteudo = Conteudo;
    }

    /**
     * @return the CargaHoraria
     */
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    /**
     * @param CargaHoraria the CargaHoraria to set
     */
    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    /**
     * @return the DataInicio
     */
    public String getDataInicio() {
        return DataInicio;
    }

    /**
     * @param DataInicio the DataInicio to set
     */
    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    /**
     * @return the DataTermino
     */
    public String getDataTermino() {
        return DataTermino;
    }

    /**
     * @param DataTermino the DataTermino to set
     */
    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    /**
     * @return the ValorTreinamento
     */
    public double getValorTreinamento() {
        return ValorTreinamento;
    }

    /**
     * @param ValorTreinamento the ValorTreinamento to set
     */
    public void setValorTreinamento(double ValorTreinamento) {
        this.ValorTreinamento = ValorTreinamento;
    }

    /**
     * @return the Parcelas
     */
    public int getParcelas() {
        return Parcelas;
    }

    /**
     * @param Parcelas the Parcelas to set
     */
    public void setParcelas(int Parcelas) {
        this.Parcelas = Parcelas;
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
