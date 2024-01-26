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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import stecgames.modelo.TurmaCurso;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import stecgames.modelo.TurmaCurso;
import stecgames.persistencia.ConnectionFactory;
import stecgames.persistencia.ConnectionFactory;


/**
 *
 * @author Gustavo
 */
public class CursoDAO {
        public static void inserir(TurmaCurso c) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        PreparedStatement  preparedStatement2 = null;
        ResultSet rs = null;
        String SQL = "";
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO tb_turmacursos (Codigo, Nome, IdadeMin, IdadeMax, Periodo, ValorMatricula, ValorMensalidade, Parcelas, Observacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, c.getCod());
        preparedStatement.setString(2, c.getNome());
        preparedStatement.setInt(3, c.getIdadeMin());
        preparedStatement.setInt(4, c.getIdadeMax());
        preparedStatement.setString(5, c.getPeriodo());
        preparedStatement.setDouble(6, c.getValorMat());
        preparedStatement.setDouble(7, c.getValorMens());
        preparedStatement.setInt(8, c.getQtdParcelas());
        preparedStatement.setString(9, c.getObservacao());
        
        
        
        // so vai ter no turma treinamento
      //  preparedStatement.setTimestamp(7, dataAux);
        
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
        ArrayList<TurmaCurso> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_turmacursos " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            TurmaCurso c = new TurmaCurso();
            
            c.setCod(rs.getInt("Codigo"));
            c.setNome(rs.getString("Nome"));
            c.setIdadeMin(rs.getInt("IdadeMin"));
            c.setIdadeMax(rs.getInt("IdadeMax"));
            c.setPeriodo(rs.getString("Periodo"));
            c.setValorMat(rs.getDouble("ValorMatricula"));
            c.setValorMens(rs.getDouble("ValorMensalidade"));
            c.setQtdParcelas(rs.getInt("Parcelas"));
            c.setObservacao(rs.getString("Observacao"));
            
            
            lista.add(c);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
    
   
    
    public static void atualizar(TurmaCurso c) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        
        // Obtem conexao com BD
       conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "UPDATE tb_turmacursos " +
              " SET Nome = ?, " +
              " IdadeMin = ?, " +
              " IdadeMax = ?, " +
              " Periodo = ?, " + 
              " ValorMatricula = ?, " + 
              " ValorMensalidade = ?, " +
              " Parcelas = ?, " +
              " Observacao = ? " +  
              " WHERE Codigo = ? ";
                

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, c.getNome());
        preparedStatement.setInt(2, c.getIdadeMin());
        preparedStatement.setInt(3, c.getIdadeMax());
        preparedStatement.setString(4, c.getPeriodo());
        preparedStatement.setDouble(5, c.getValorMat());
        preparedStatement.setDouble(6, c.getValorMens());
        preparedStatement.setInt(7, c.getQtdParcelas());        
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
    
    
 /*  
    public void GeraRelatorioSelectUsuario() throws JRException, Exception {
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        try {
            String selecao = ((String) meujframe.TelaTurmaCurso.getModel().getValueAt(meujframe.TelaTurmaCurso.getSelectedRow(), 0));
//0 é o indice da coluna da jtable que contém o valor que eu irei usar como parametro, no meu caso, MinhaColunaOndeTemOIdDaTabela
            Map parametro = new HashMap();

            parametro.put("meuParametro", selecao);
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "IREPORT/RelatorioDoCurso.jasper"; //colocar aqui o endereço do seu relatório
            JasperPrint jp = JasperFillManager.fillReport(arquivo, parametro, conn);
            JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    */

    
    
    
    public static void excluir(TurmaCurso c) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM tb_turmacursos " +
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
