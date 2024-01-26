/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import java.rmi.ServerException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import stecgames.modelo.Campanha;
import stecgames.persistencia.CampanhaDAO;



/**
 *
 * @author Fulvio
 */
public class ListarCampanhas extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarCampanhas
     */
    EditarCampanhas enviaTexto;
    public ListarCampanhas() {
        initComponents();
      
        
        
           DefaultTableModel modelo = (DefaultTableModel) tabCampanha.getModel();
           
        tabCampanha.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabCampanha.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabCampanha.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabCampanha.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabCampanha.getColumnModel().getColumn(4).setPreferredWidth(250);
        
           
           
           
           
        readJTable();
    }
    
    
    public void  readJTable(){
        
         DefaultTableModel modelo = (DefaultTableModel) tabCampanha.getModel();
         modelo.setNumRows(0);
         
          ArrayList<Campanha> lista = null;
          
         
         
          try{
            lista = CampanhaDAO.listar();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERRO");
        }
          
         NumberFormat nf = NumberFormat.getCurrencyInstance();
          
         for(Campanha c:lista){
      
         modelo.addRow(new Object[]{
        
         c.getId_campanhas(),
         c.getNome(),
         c.getTipo(),
         nf.format(Float.parseFloat(c.getValor())),
         c.getLink()
         
         
                 
     });
        
    }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabCampanha = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Campanhas");

        tabCampanha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Valor", "Link"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCampanha.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabCampanha.getTableHeader().setReorderingAllowed(false);
        tabCampanha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCampanhaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCampanha);
        if (tabCampanha.getColumnModel().getColumnCount() > 0) {
            tabCampanha.getColumnModel().getColumn(0).setResizable(false);
            tabCampanha.getColumnModel().getColumn(1).setResizable(false);
            tabCampanha.getColumnModel().getColumn(2).setResizable(false);
            tabCampanha.getColumnModel().getColumn(3).setResizable(false);
            tabCampanha.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Campanhas");

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAtualizar)
                        .addGap(112, 112, 112)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btAtualizar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed

      
    
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
    
    if (tabCampanha.getSelectedRow() == -1) {
         JOptionPane.showMessageDialog(null, "Selecione uma Campanha para editar");
    } else{
        
       if(enviaTexto == null){
           
            enviaTexto  = new EditarCampanhas();
            enviaTexto.setVisible(true);
            
     

        enviaTexto.setVisible(true);
            try {
                enviaTexto.recebendo(tabCampanha.getValueAt(tabCampanha.getSelectedRow(), 0).toString());
            } catch (ServerException ex) {
                Logger.getLogger(ListarCampanhas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            enviaTexto.setVisible(true);
            //enviaTexto.setState(EditarCampanhas.NORMAL);
            try {
                enviaTexto.recebendo(tabCampanha.getValueAt(tabCampanha.getSelectedRow(), 0).toString());
            } catch (ServerException ex) {
                Logger.getLogger(ListarCampanhas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        }   
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
if (tabCampanha.getSelectedRow() != -1) {

            Campanha campanha = new Campanha();

            campanha.setId_campanhas((int) tabCampanha.getValueAt(tabCampanha.getSelectedRow(), 0));

            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    CampanhaDAO.excluir(campanha);
                } catch (SQLException ex) {
                    Logger.getLogger(ListarCampanhas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ListarCampanhas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (resposta == JOptionPane.NO_OPTION) {
                return;
            }

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma campanha para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
String nome = this.txtPesquisar.getText();

        if(nome.equals("")){
             JOptionPane.showMessageDialog(null, "Escreva um nome para pesquisar.");
        }
        else{
        
         DefaultTableModel modelo = (DefaultTableModel) tabCampanha.getModel();
         modelo.setNumRows(0);
         
          ArrayList<Campanha> lista = null;
          
         
         
          try{
            lista = CampanhaDAO.pesquisar(nome);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERRO");
        }
          
         NumberFormat nf = NumberFormat.getCurrencyInstance();
          
         for(Campanha c:lista){
      
         modelo.addRow(new Object[]{
        
         c.getId_campanhas(),
         c.getNome(),
         c.getTipo(),
         nf.format(Float.parseFloat(c.getValor())),
         c.getLink()
         
         
                 
     });
        
    } }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tabCampanhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCampanhaMouseClicked
   
    }//GEN-LAST:event_tabCampanhaMouseClicked

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) tabCampanha.getModel();
         modelo.setNumRows(0);
         
          ArrayList<Campanha> lista = null;
          
         
         
          try{
            lista = CampanhaDAO.listar();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERRO");
        }
          
         NumberFormat nf = NumberFormat.getCurrencyInstance();
          
         for(Campanha c:lista){
      
         modelo.addRow(new Object[]{
        
         c.getId_campanhas(),
         c.getNome(),
         c.getTipo(),
         nf.format(Float.parseFloat(c.getValor())),
         c.getLink()
         
         
                 
     });
        
    }  
    }//GEN-LAST:event_btAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCampanha;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
