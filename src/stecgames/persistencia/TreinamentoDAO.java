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
import stecgames.modelo.TurmaTreinamento;
import stecgames.persistencia.ConnectionFactory;

/**
 *
 * @author Gustavo
 */
public class TreinamentoDAO {
        public static void inserir(TurmaTreinamento c) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        PreparedStatement  preparedStatement2 = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO tb_turmatreinamentos (Codigo, Empresa, Conteudo, CargaHoraria, DataInicio, DataTermino, ValorTreinamento, Parcelas, Observacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, c.getCod());
        preparedStatement.setString(2, c.getEmpresa());
        preparedStatement.setString(3, c.getConteudo());
        preparedStatement.setInt(4, c.getCargaHoraria());
        preparedStatement.setString(5, c.getDataInicio());
        preparedStatement.setString(6, c.getDataTermino());
        preparedStatement.setDouble(7, c.getValorTreinamento());
        preparedStatement.setInt(8, c.getParcelas());
        preparedStatement.setString(9, c.getObservacao());
        
       
      
        
        preparedStatement.executeUpdate(); 
        
        // Fechar conexao
        conn.close();
        
    }
    
 /*public static boolean buscar(Filme f) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "SELECT * FROM filmes " +
                " WHERE titulo = ? AND codigo = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, f.getTitulo());
        preparedStatement.setInt(2, f.getCodigo());
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            conn.close();
            return true;
         }else{
            conn.close();
            return false;
        } 
    }*/
 
   
    public static ArrayList listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<TurmaTreinamento> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_turmatreinamentos " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            TurmaTreinamento c = new TurmaTreinamento();
            
            c.setCod(rs.getInt("Codigo"));
            c.setEmpresa(rs.getString("Empresa"));
            c.setConteudo(rs.getString("Conteudo"));
            c.setCargaHoraria(rs.getInt("CargaHoraria"));
            c.setDataInicio(rs.getString("DataInicio"));
            c.setDataTermino(rs.getString("DataTermino"));
            c.setValorTreinamento(rs.getDouble("ValorTreinamento"));
            c.setParcelas(rs.getInt("Parcelas"));
            c.setObservacao(rs.getString("Observacao"));
            
            
            
            lista.add(c);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
   
    
    public static void atualizar(TurmaTreinamento c) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE tb_turmatreinamentos " +
              " SET Empresa = ?, " +
              " Conteudo = ?, " +
              " CargaHoraria = ?, " +
              " DataInicio = ?, " + 
              " DataTermino = ?, " + 
              " ValorTreinamento = ?, " +
              " Parcelas = ?, " +
              " Observacao = ? " +  
              " WHERE Codigo = ? ";
                

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, c.getEmpresa());
        preparedStatement.setString(2, c.getConteudo());
        preparedStatement.setInt(3, c.getCargaHoraria());
        preparedStatement.setString(4, c.getDataInicio());
        preparedStatement.setString(5, c.getDataTermino());
        preparedStatement.setDouble(6, c.getValorTreinamento());
        preparedStatement.setInt(7, c.getParcelas());
        preparedStatement.setString(8, c.getObservacao());
        preparedStatement.setInt(9, c.getCod());
        
        
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
        
    }

    
    
    
    public static void excluir(TurmaTreinamento c) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM tb_turmatreinamentos " +
              " WHERE Codigo = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, c.getCod());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    } 
   
}
