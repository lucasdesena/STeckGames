/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import stecgames.modelo.ClienteFisico;
import stecgames.modelo.ClienteJuridico;
import stecgames.modelo.Vendas;

/**
 *
 * @author Pedro
 */
public class VendasDAO {
    public static ArrayList listarVendas() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Vendas> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM vendas ";

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Vendas V = new Vendas();
            
            V.setIdVendas(rs.getInt("idVendas"));
            V.setValor(rs.getFloat("Valor")); 
            
            lista.add(V);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }     
    public static void atualizar(Vendas V) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE vendas " +
              " SET "
                + "Valor";
                

        preparedStatement = conn.prepareStatement(SQL);

      
        preparedStatement.setFloat(1, V.getValor());
        

        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close(); 
    }
    public static void excluir(Vendas V) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM clientejuridico " +
              " WHERE idVendas = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, V.getIdVendas());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
     public static void inserir(Vendas V) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        PreparedStatement  preparedStatement2 = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO vendas (idVendas, Valor, idClienteComprador, FormaPagamento, CompraConcluida, TipoCliente) VALUES (?, ?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, V.getIdVendas());
        preparedStatement.setFloat(2, V.getValor());
        preparedStatement.setInt(3, V.getIdClienteComprador());
        preparedStatement.setString(4, V.getFormaPagamento());
        preparedStatement.setString(5, V.getCompraConcluida());
        preparedStatement.setString(6, V.getTipoCliente());
        
        preparedStatement.executeUpdate(); 
        
        // Fechar conexao
        conn.close();
        
    }
}