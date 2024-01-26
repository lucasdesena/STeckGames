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
import java.util.ArrayList;
import stecgames.modelo.CadastroJogos;

/**
 *
 * @author Pedro
 */
public class CadastroJogosDAO {
    public static ArrayList listarCadastroJogos() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<CadastroJogos> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM cadastrojogos ";

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            CadastroJogos CJ = new CadastroJogos();
            
            CJ.setIdCadastroJogos(rs.getInt("idCadastroJogos"));
            CJ.setNome(rs.getString("Nome"));
            CJ.setTipo(rs.getString("Tipo"));
            CJ.setQuantidade(rs.getInt("Quantidade"));
            CJ.setValor(rs.getFloat("Valor"));
            
            lista.add(CJ);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
    public static void inserir(CadastroJogos CJ) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        PreparedStatement  preparedStatement2 = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO cadastrojogos (idCadastroJogos, Nome, Quantidade, Tipo, Valor) VALUES (?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, CJ.getIdCadastroJogos());
        preparedStatement.setString(2, CJ.getNome());
        preparedStatement.setInt(3, CJ.getQuantidade());
        preparedStatement.setString(4, CJ.getTipo());
        preparedStatement.setFloat(5, CJ.getValor());
        
        preparedStatement.executeUpdate(); 
        
        // Fechar conexao
        conn.close();
        
    }
    
    public static void atualizar(CadastroJogos CJ) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE cadastrojogos " +
              " SET "
                + "Nome = ?, "
                + "Tipo = ?, "
                + "Quantidade = ?, "
                + "Valor = ?"
                + "where idCadastroJogos = ?";
      
                

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, CJ.getNome());
        preparedStatement.setString(2, CJ.getTipo());
        preparedStatement.setInt(3, CJ.getQuantidade());
        preparedStatement.setFloat(4, CJ.getValor());
        preparedStatement.setInt(5, CJ.getIdCadastroJogos());

        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close(); 
    }
    
    public static void excluir(CadastroJogos CJ) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM cadastrojogos " +
              " WHERE idCadastroJogos = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, CJ.getIdCadastroJogos());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
    
     public static CadastroJogos buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        CadastroJogos cj = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM cadastrojogos " +
                " WHERE idCadastroJogos = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
        
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            cj = new CadastroJogos();
            
            cj.setIdCadastroJogos(rs.getInt("idCadastroJogos"));
            cj.setNome(rs.getString("Nome"));
            cj.setTipo(rs.getString("Tipo"));
            cj.setQuantidade(rs.getInt("Quantidade"));
            cj.setValor(rs.getFloat("Valor"));
         } 
        
        // Fechar conexao
        conn.close();
        
        return cj;
     }
     
     
}
