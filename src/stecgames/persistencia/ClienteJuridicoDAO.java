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
import stecgames.modelo.ClienteJuridico;

/**
 *
 * @author Pedro
 */
public class ClienteJuridicoDAO {
    public static ArrayList listarClienteJuridico() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<ClienteJuridico> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM clientejuridico ";

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            ClienteJuridico CJ = new ClienteJuridico();
            
            CJ.setIdClienteJuridico(rs.getInt("idClienteJuridico"));
            CJ.setCNPJ(rs.getString("CNPJ"));
            CJ.setIE(rs.getString("IE"));
            CJ.setRazao(rs.getString("Razao"));
            CJ.setEndereco(rs.getString("Endereco"));
            CJ.setNumero(rs.getString("Numero"));
            CJ.setComplemento(rs.getString("Complemento"));
            CJ.setCEP(rs.getString("CEP"));
            CJ.setTelefone(rs.getString("Telefone"));
            CJ.setBairro(rs.getString("Bairro"));
            CJ.setCidade(rs.getString("Cidade"));
            CJ.setUF(rs.getString("UF"));
            
            lista.add(CJ);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
    public static void inserir(ClienteJuridico CJ) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO clientejuridico (idClienteJuridico, CNPJ, IE, Razao, Endereco, Numero, Complemento, CEP, Telefone, Bairro, Cidade, UF, TipoCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, CJ.getIdClienteJuridico());
        preparedStatement.setString(2, CJ.getCNPJ());
        preparedStatement.setString(3, CJ.getIE());
        preparedStatement.setString(4, CJ.getRazao());
        preparedStatement.setString(5, CJ.getEndereco());
        preparedStatement.setString(6, CJ.getNumero());
        preparedStatement.setString(7, CJ.getComplemento());
        preparedStatement.setString(8, CJ.getCEP());
        preparedStatement.setString(9, CJ.getTelefone());
        preparedStatement.setString(10, CJ.getBairro());
        preparedStatement.setString(11, CJ.getCidade());
        preparedStatement.setString(12, CJ.getUF());
        preparedStatement.setString(13, CJ.getTipoCliente());
        
        preparedStatement.executeUpdate(); 
        
        // Fechar conexao
        conn.close();
        
    }
    
    public static void atualizar(ClienteJuridico CJ) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE clientejuridico " +
              " SET "
                + "CNPJ, "
                + "IE, "
                + "Razao, "
                + "Endereco, "
                + "Numero, "
                + "Complemento, "
                + "CEP, "
                + "Telefone, "
                + "Bairro, "
                + "Cidade, "
                + "UF";               

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, CJ.getCNPJ());
        preparedStatement.setString(2, CJ.getIE());
        preparedStatement.setString(3, CJ.getRazao());
        preparedStatement.setString(4, CJ.getEndereco());
        preparedStatement.setString(5, CJ.getNumero());
        preparedStatement.setString(6, CJ.getComplemento());
        preparedStatement.setString(7, CJ.getCEP());
        preparedStatement.setString(8, CJ.getTelefone());
        preparedStatement.setString(9, CJ.getBairro());
        preparedStatement.setString(10, CJ.getCidade());
        preparedStatement.setString(11, CJ.getUF());

        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close(); 
    }
    
    public static void excluir(ClienteJuridico CJ) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM clientejuridico " +
              " WHERE idClienteJuridico = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, CJ.getIdClienteJuridico());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
    public static ClienteJuridico buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ClienteJuridico cj = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM clientejuridico " +
                " WHERE idClienteJuridico = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
        
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            cj = new ClienteJuridico();
            
            cj.setIdClienteJuridico(rs.getInt("idClienteJuridico"));
            cj.setCNPJ(rs.getString("CNPJ"));
            cj.setIE(rs.getString("IE"));
            cj.setRazao(rs.getString("Razao"));
            cj.setEndereco(rs.getString("Endereco"));
            cj.setNumero(rs.getString("Numero"));
            cj.setComplemento(rs.getString("Complemento"));
            cj.setCEP(rs.getString("CEP"));
            cj.setTelefone(rs.getString("Telefone"));
            cj.setBairro(rs.getString("Bairro"));
            cj.setCidade(rs.getString("Cidade"));
            cj.setUF(rs.getString("UF"));
            cj.setTipoCliente(rs.getString("TipoCliente"));
         } 
        
        // Fechar conexao
        conn.close();
        
        return cj;
    }
}
