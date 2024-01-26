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
public class CadastroJogos {
    private int idCadastroJogos;
    private String Nome;
    private String Tipo;
    private int Quantidade;
    private float Valor;

    public CadastroJogos() {
    }

    public int getIdCadastroJogos() {
        return idCadastroJogos;
    }

    public void setIdCadastroJogos(int idCadastroJogos) {
        this.idCadastroJogos = idCadastroJogos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
}
