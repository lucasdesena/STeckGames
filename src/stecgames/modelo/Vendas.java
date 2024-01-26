/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

/**
 *
 * @author Pedro
 */
public class Vendas {
    private int idVendas;
    private float Valor;
    private int idClienteComprador;
    private String FormaPagamento;
    private String CompraConcluida;
    private String TipoCliente;

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getIdClienteComprador() {
        return idClienteComprador;
    }

    public void setIdClienteComprador(int idClienteComprador) {
        this.idClienteComprador = idClienteComprador;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }

    public String getCompraConcluida() {
        return CompraConcluida;
    }

    public void setCompraConcluida(String CompraConcluida) {
        this.CompraConcluida = CompraConcluida;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    
}
