/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

/**
 *
 * @author Fulvio
 */
public class Campanha {
    private int id_campanhas;
    private String nome;
    private String tipo;
    private String valor;
    private String descricao;
    private String link;

    public Campanha() {
    }

    public Campanha(int id_campanhas, String nome, String tipo, String valor, String descricao, String link) {
        this.id_campanhas = id_campanhas;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.link = link;
    }

    public int getId_campanhas() {
        return id_campanhas;
    }

    public void setId_campanhas(int id_campanhas) {
        this.id_campanhas = id_campanhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

   
    
    
}
