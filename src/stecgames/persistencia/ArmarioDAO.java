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
import java.util.Date;
import stecgames.modelo.Armarios;
import stecgames.modelo.Produtos;

/**
 *
 * @author Daniel
 */
public class ArmarioDAO {
        public static void inserir(Armarios a) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO armarios (cod_armario, qtd_maxima, qtd_ocupada) VALUES (?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, a.getCodArmario());
        preparedStatement.setInt(2, a.getQtdMaxima());
        preparedStatement.setInt(3, a.getQtdOcupada());
        
        preparedStatement.executeUpdate(); 
        
        // Fechar conexao
        conn.close();
        
    }
    
/*public static ArrayList pesquisar(int recebeAux) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Produtos> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "SELECT * FROM produtos WHERE codigo like ? ";
        
        
        
        
        preparedStatement = conn.prepareStatement(SQL);
        String codAux = "%" + recebeAux + "%";
        preparedStatement.setString(1, codAux);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Produtos p = new Produtos();
            
            p.setNome(rs.getString("nome"));
            p.setMarca(rs.getString("marca"));
            
            
            lista.add(p);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }*/
        
        public static Armarios buscar(int codArmario) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Armarios a = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM armarios " +
                " WHERE cod_armario = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, codArmario);
        
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            a = new Armarios();
            
            a.setCodArmario(rs.getInt("cod_armario"));
            a.setQtdMaxima(rs.getInt("qtd_maxima"));
            a.setQtdOcupada(rs.getInt("qtd_ocupada"));
            
            
         } 
        
        // Fechar conexao
        conn.close();
        
        return a;
    }
 
   
    public static ArrayList listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Armarios> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM armarios " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Armarios a = new Armarios();
            
            a.setCodArmario(rs.getInt("cod_armario"));
            a.setQtdMaxima(rs.getInt("qtd_maxima"));
            a.setQtdOcupada(rs.getInt("qtd_ocupada"));
            
            //se quiser pegar a hora tambem
            //p.setDtCadastro(rs.getTimestamp("dt_cadastro")); 
            
            
            lista.add(a);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
   
    
    public static void atualizar(Armarios a) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE armarios " +
              " SET qtd_maxima = ?, " +
              " qtd_ocupada = ? " + 
              " WHERE cod_armario = ? ";
                

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, a.getQtdMaxima());
        preparedStatement.setInt(2, a.getQtdOcupada());
        preparedStatement.setInt(3, a.getCodArmario());
        
       
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
        
    }

    
    
    
    public static void excluir(Armarios a) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM armarios " +
              " WHERE cod_armario = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, a.getCodArmario());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
   
}
