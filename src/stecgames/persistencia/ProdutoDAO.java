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
public class ProdutoDAO {
        public static void inserir(Produtos p) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO produtos (codigo, nome, marca, qnt_estoque, qnt_minima, unid_medida, valor_unidade, tipo, dt_cadastro, num_pedido, codA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, p.getCodigo());
        preparedStatement.setString(2, p.getNome());
        preparedStatement.setString(3, p.getMarca());
        preparedStatement.setInt(4, p.getQntEstoque());
        preparedStatement.setInt(5, p.getQntMinima());
        preparedStatement.setString(6, p.getUnidMedida());
        preparedStatement.setFloat(7, p.getValorUnidade());
        preparedStatement.setString(8, p.getTipo());
        
        // Nao existe tipo de dado java.util.Date no 
        //JDBC entao temos que fazer uma conversao
        Timestamp dataAux = new Timestamp(
                p.getDtCadastro().getTime());
        preparedStatement.setTimestamp(9, dataAux); 
        
        preparedStatement.setInt(10, p.getNumPedido());
        preparedStatement.setInt(11, p.getCodA());
        
        /*Timestamp dataAux = new Timestamp(p.getDtCadastro().getTime());
        preparedStatement.setTimestamp(7, dataAux);*/
        
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
        
        public static Produtos buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Produtos p = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM produtos " +
                " WHERE codigo = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
        
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            p = new Produtos();
            
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setMarca(rs.getString("marca"));
            p.setValorUnidade(rs.getFloat("valor_unidade"));
            p.setQntEstoque(rs.getInt("qnt_estoque"));
            p.setQntMinima(rs.getInt("qnt_minima"));
            p.setUnidMedida(rs.getString("unid_medida"));
            p.setValorUnidade(rs.getFloat("valor_unidade"));
            p.setTipo(rs.getString("tipo"));
            p.setDtCadastro(rs.getDate("dt_cadastro"));
            p.setNumPedido(rs.getInt("num_pedido"));
            
         } 
        
        // Fechar conexao
        conn.close();
        
        return p;
    }
        
        public static Produtos buscarIdP(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Produtos p = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM produtos " +
                " WHERE codPedido = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
        
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            p = new Produtos();
            
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setMarca(rs.getString("marca"));
            p.setValorUnidade(rs.getFloat("valor_unidade"));
            p.setQntEstoque(rs.getInt("qnt_estoque"));
            p.setQntMinima(rs.getInt("qnt_minima"));
            p.setUnidMedida(rs.getString("unid_medida"));
            p.setValorUnidade(rs.getFloat("valor_unidade"));
            p.setTipo(rs.getString("tipo"));
            p.setDtCadastro(rs.getDate("dt_cadastro"));
            p.setNumPedido(rs.getInt("num_pedido"));
           
            
         } 
        
        // Fechar conexao
        conn.close();
        
        return p;
    }
 
 
   
    public static ArrayList listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Produtos> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM produtos " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Produtos p = new Produtos();
            
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setMarca(rs.getString("marca"));
            p.setQntEstoque(rs.getInt("qnt_estoque"));
            p.setQntMinima(rs.getInt("qnt_minima"));
            p.setUnidMedida(rs.getString("unid_medida"));
            p.setValorUnidade(rs.getFloat("valor_unidade"));
            p.setTipo(rs.getString("tipo"));
            p.setDtCadastro(rs.getDate("dt_cadastro"));
            
            //se quiser pegar a hora tambem
            //p.setDtCadastro(rs.getTimestamp("dt_cadastro")); 
            
            
            lista.add(p);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
   
    
    public static void atualizar(Produtos p) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE produtos " +
              " SET nome = ?, " +
              " marca = ?, " +
              " qnt_estoque = ?, " +
              " qnt_minima = ?, " + 
              " unid_medida = ?, " + 
              " valor_unidade = ?, " +
              " tipo = ?, " +
              " dt_cadastro = ?, " +  
              " num_pedido = ?, " + 
              " codPedido = ? " +
              " WHERE codigo = ? ";
                

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, p.getNome());
        preparedStatement.setString(2, p.getMarca());
        preparedStatement.setInt(3, p.getQntEstoque());
        preparedStatement.setInt(4, p.getQntMinima());
        preparedStatement.setString(5, p.getUnidMedida());
        preparedStatement.setFloat(6, p.getValorUnidade());
        preparedStatement.setString(7, p.getTipo());
        
         Timestamp dataAux = new Timestamp(
                p.getDtCadastro().getTime());
        preparedStatement.setTimestamp(8, dataAux); 
        
        preparedStatement.setInt(9, p.getNumPedido());
        preparedStatement.setInt(10, p.getCodP());
        preparedStatement.setInt(11, p.getCodigo());
        
       
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
        
    }

    
    
    
    public static void excluir(Produtos p) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM produtos " +
              " WHERE codigo = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, p.getCodigo());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
   
}
