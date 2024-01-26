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

/**
 *
 * @author Pedro
 */
public class ClienteFisicoDAO {
    public static ArrayList listarClienteFisico() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<ClienteFisico> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM clientefisico ";

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            ClienteFisico CF = new ClienteFisico();
            
            CF.setIdClienteFisico(rs.getInt("idClienteFisico"));
            CF.setNome(rs.getString("Nome"));
            CF.setIdade(rs.getString("Idade"));
            CF.setCPF(rs.getString("CPF"));
            CF.setDataNasc(rs.getString("DataNasc"));
            CF.setSexo(rs.getString("Sexo"));
            CF.setEmail(rs.getString("Email"));
            CF.setTelefone(rs.getString("Telefone"));
            CF.setRG(rs.getString("RG"));
            CF.setDataCadastro(rs.getDate("DataCadastro"));
            CF.setPais(rs.getString("Pais"));
            CF.setCidade(rs.getString("Cidade"));
            CF.setBairro(rs.getString("Bairro"));
            CF.setComplemento(rs.getString("Complemento"));
            CF.setEstado(rs.getString("Estado"));
            CF.setCEP(rs.getString("CEP"));
            CF.setRua(rs.getString("Rua"));
            CF.setNumero(rs.getString("Numero"));        
            
            lista.add(CF);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
    public static void inserir(ClienteFisico CF) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        PreparedStatement  preparedStatement2 = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO clientefisico (idClienteFisico, Nome, Idade, CPF, DataNasc, Sexo, Email, Telefone, RG, DataCadastro, Pais, Cidade, Bairro, Complemento, Estado, CEP, Rua, Numero, TipoCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, CF.getIdClienteFisico());
        preparedStatement.setString(2, CF.getNome());
        preparedStatement.setString(3, CF.getIdade());
        preparedStatement.setString(4, CF.getCPF());
        preparedStatement.setString(5, CF.getDataNasc());
        preparedStatement.setString(6, CF.getSexo());
        preparedStatement.setString(7, CF.getEmail());
        preparedStatement.setString(8, CF.getTelefone());
        preparedStatement.setString(9, CF.getRG());
        Timestamp dataAux2 = new Timestamp(CF.getDataCadastro().getTime());
        preparedStatement.setTimestamp(10, dataAux2);
        preparedStatement.setString(11, CF.getPais());
        preparedStatement.setString(12, CF.getCidade());
        preparedStatement.setString(13, CF.getBairro());
        preparedStatement.setString(14, CF.getComplemento());
        preparedStatement.setString(15, CF.getEstado());
        preparedStatement.setString(16, CF.getCEP());
        preparedStatement.setString(17, CF.getRua());
        preparedStatement.setString(18, CF.getNumero());
        preparedStatement.setString(19, CF.getTipoCliente());
        
        
        preparedStatement.executeUpdate(); 
        
        // Fechar conexao
        conn.close();
        
    }
    
    public static void atualizar(ClienteFisico CF) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE clientefisico " +
              " SET "
                + "Nome, "
                + "Idade, "
                + "CPF, "
                + "DataNasc, "
                + "Sexo, "
                + "Email, "
                + "Telefone, "
                + "RG, "
                + "Pais, "
                + "Cidade, "
                + "Bairro, "
                + "Complemento, "
                + "Estado, "
                + "CEP, "
                + "Rua, "
                + "Numero";
                

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, CF.getNome());
        preparedStatement.setString(2, CF.getIdade());
        preparedStatement.setString(3, CF.getCPF());
        preparedStatement.setString(4, CF.getDataNasc());
        preparedStatement.setString(5, CF.getSexo());
        preparedStatement.setString(6, CF.getEmail());
        preparedStatement.setString(7, CF.getTelefone());
        preparedStatement.setString(8, CF.getRG());
        preparedStatement.setString(9, CF.getPais());
        preparedStatement.setString(10, CF.getCidade());
        preparedStatement.setString(11, CF.getBairro());
        preparedStatement.setString(12, CF.getComplemento());
        preparedStatement.setString(13, CF.getEstado());
        preparedStatement.setString(14, CF.getCEP());
        preparedStatement.setString(15, CF.getRua());
        preparedStatement.setString(16, CF.getNumero());

        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close(); 
    }
    public static void excluir(ClienteFisico CF) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM clientefisico " +
              " WHERE idClienteFisico = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, CF.getIdClienteFisico());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
    public static ClienteFisico buscar(int id) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ClienteFisico cf = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM clientefisico " +
                " WHERE idClienteFisico = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, id);
        
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            cf = new ClienteFisico();
            
            cf.setIdClienteFisico(rs.getInt("idClienteFisico"));
            cf.setNome(rs.getString("Nome"));
            cf.setEmail(rs.getString("Email"));
            cf.setIdade(rs.getString("Idade"));
            cf.setSexo(rs.getString("Sexo"));
            cf.setTelefone(rs.getString("Telefone"));
            cf.setCPF(rs.getString("CPF"));
            cf.setRG(rs.getString("RG"));
            cf.setDataNasc(rs.getString("DataNasc"));
            cf.setPais(rs.getString("Pais"));
            cf.setEstado(rs.getString("Estado"));
            cf.setCidade(rs.getString("Cidade"));
            cf.setCEP(rs.getString("CEP"));
            cf.setBairro(rs.getString("Bairro"));
            cf.setRua(rs.getString("Rua"));
            cf.setComplemento(rs.getString("Complemento"));
            cf.setNumero(rs.getString("Numero"));
            cf.setTipoCliente(rs.getString("TipoCliente"));
         } 
        
        // Fechar conexao
        conn.close();
        
        return cf;
    }
}
