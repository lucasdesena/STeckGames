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
import stecgames.modelo.Requisicoes;

/**
 *
 * @author Daniel
 */
public class RequisicaoDAO {
    public static void inserir(Requisicoes req) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        PreparedStatement  preparedStatement2 = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO requisicoes (codigoRequisicao, nomeProduto, marcaProduto, qntProduto, setor) VALUES (?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, req.getCodigoRequisicao());
        preparedStatement.setString(2, req.getNomeProduto());
        preparedStatement.setString(3, req.getMarcaProduto());
        preparedStatement.setInt(4, req.getQtdProduto());
        preparedStatement.setString(5, req.getSetor());
        
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
    }
        
        public static Produtos buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Produtos p = null;
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
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
            
         } 
        
        // Fechar conexao
        conn.close();
        
        return p;
    }
 */
   
    public static ArrayList listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Requisicoes> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM requisicoes " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Requisicoes r = new Requisicoes();
            
            r.setCodigoRequisicao(rs.getInt("codigoRequisicao"));
            r.setNomeProduto(rs.getString("nomeProduto"));
            r.setMarcaProduto(rs.getString("marcaProduto"));
            r.setQtdProduto(rs.getInt("qntProduto"));
            r.setSetor(rs.getString("setor"));
            
            
            //se quiser pegar a hora tambem
            //p.setDtCadastro(rs.getTimestamp("dt_cadastro")); 
            
            
            lista.add(r);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
   
    /*
    public static void atualizar(Produtos p) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "UPDATE produtos " +
              " SET nome = ?, " +
              " marca = ?, " +
              " qnt_estoque = ?, " +
              " qnt_minima = ?, " + 
              " unid_medida = ?, " + 
              " valor_unidade = ?, " +
              " tipo = ?, " +
              " dt_cadastro = ? " +  
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
        
        preparedStatement.setInt(9, p.getCodigo());
        
       
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
        
    }*/

    
    
    
    public static void excluir(Requisicoes r) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM requisicoes " +
              " WHERE codigoRequisicao = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, r.getCodigoRequisicao());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }

}
