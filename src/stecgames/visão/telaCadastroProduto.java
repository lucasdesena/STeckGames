/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import stecgames.utilitarios.soNumerosV;
import stecgames.utilitarios.soNumeros;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import stecgames.modelo.Produtos;
import stecgames.modelo.Armarios;
import stecgames.persistencia.ArmarioDAO;
import stecgames.persistencia.ProdutoDAO;
import stecgames.utilitarios.PersonalizarMsgErro;
import static stecgames.visão.TelaPrincipal.JdpPrincipal;

/**
 *
 * @author Lucas
 */
public class telaCadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form telaCadastro
     */
    public telaCadastroProduto() {
        initComponents();
        
        txtQtdEstoque.setDocument(new soNumeros());
        txtQtdMinima.setDocument(new soNumeros());
        txtValorUnidade.setDocument(new soNumerosV());
        
        cbArmario.removeAllItems();
        ArrayList<Armarios> lista = null;
         
          try{
            lista = ArmarioDAO.listar();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Deu Ruim.");
        }
          
         for(Armarios p:lista){
            int codAAux = p.getCodArmario();
            String codA = String.valueOf(codAAux);
            
         cbArmario.addItem(codA);
         
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtQtdEstoque = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtdMinima = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUnidadeMedida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValorUnidade = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbArmario = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Cadastro de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("Marca:");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel3.setText("Qtd em Estoque:");

        jLabel4.setText("Qtd minima:");

        jLabel5.setText("Unidade de medida:");

        txtUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeMedidaActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor da unidade:");

        txtValorUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnidadeActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Eletrônico", "Limpeza", "Escritório" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de produto:");

        jLabel8.setText("Armário: ");

        cbArmario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbArmario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArmarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidadeMedida))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbArmario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cbArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeMedidaActionPerformed

    private void txtValorUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnidadeActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        int armario;
        int qntEstoque = 0;
        int qntMinima = 0;
        float valor = 0;
        String nome;
        String marca; 
        String unidadeMedida;
        String msgErro = "";
    
    try{    
    nome = txtNome.getText().trim();
    marca = txtMarca.getText().trim();
    unidadeMedida = txtUnidadeMedida.getText().trim();
    
    String qtdEstoqueAux = txtQtdEstoque.getText().trim();
    String qtdMinimaAux = txtQtdMinima.getText().trim();
    
    String valorAux = txtValorUnidade.getText().trim();
    String tipo = cbTipo.getSelectedItem().toString();
    String armarioAux = cbArmario.getSelectedItem().toString();
    
    String aux = valorAux.replace(",", ".");
    
        if (nome.equals("")
                && marca.equals("")
                && qtdEstoqueAux.equals("")
                && qtdMinimaAux.equals("")
                && unidadeMedida.equals("")
                && valorAux.equals("")) {
            msgErro = "TODOS OS CAMPOS DEVEM ESTAR PREENCHIDOS.";
            JOptionPane.showMessageDialog(null, msgErro);
        } else {
            if (nome.equals("")) {
                msgErro = "Preencha o campo NOME antes de continuar.";
                JOptionPane.showMessageDialog(null, msgErro);
            } else {
                if (marca.equals("")) {
                    msgErro = "Preencha o campo MARCA antes de continuar.";
                    JOptionPane.showMessageDialog(null, msgErro);
                } else {
                    if (qtdEstoqueAux.equals("")) {
                        msgErro = "Preencha o campo QTD EM ESTOQUE antes de continuar.";
                        JOptionPane.showMessageDialog(null, msgErro);
                    } else {
                        if (qtdMinimaAux.equals("")) {
                            msgErro = "Preencha o campo QTD MÍNIMA antes de continuar.";
                            JOptionPane.showMessageDialog(null, msgErro);
                        } else {
                            if (unidadeMedida.equals("")) {
                                msgErro = "Preencha o campo UNIDADE DE MEDIDA antes de continuar.";
                                JOptionPane.showMessageDialog(null, msgErro);
                            } else {
                                if (valorAux.equals("") || valorAux.equals(",")) {
                                    msgErro = "Preencha o campo VALOR antes de continuar.";
                                    JOptionPane.showMessageDialog(null, msgErro);
                                } else {
                                    if(tipo.equals("Selecione")){
                                        msgErro = "Selecione um TIPO DE PRODUTO antes de continuar.";
                                        JOptionPane.showMessageDialog(null, msgErro);
                                    }else{

                                    qntEstoque = Integer.parseInt(qtdEstoqueAux);
                                    qntMinima = Integer.parseInt(qtdMinimaAux);
                                    valor = Float.parseFloat(aux);
                                    armario = Integer.parseInt(armarioAux);
                                    
                                    if (nome != null) {

                                        Produtos produto = new Produtos();
                                        produto.setNome(nome);
                                        produto.setMarca(marca);
                                        produto.setQntEstoque(qntEstoque);
                                        produto.setQntMinima(qntMinima);
                                        produto.setUnidMedida(unidadeMedida);
                                        produto.setValorUnidade(valor);
                                        produto.setTipo(tipo);
                                        produto.setNumPedido(0);
                                        produto.setCodA(armario);
                                        
                                        Armarios aB = new Armarios();
                                        
                                        String idAAux = cbArmario.getSelectedItem().toString();
                                        int idA = Integer.parseInt(idAAux);
                                        
                                                    try {
                                                        
                                                    aB = ArmarioDAO.buscar(idA);
                                                    
                                                    int conta = aB.getQtdOcupada() + qntEstoque; 
                                                    
                                                    if(conta > aB.getQtdMaxima()){
                                                        JOptionPane.showMessageDialog(null, "A quantidade de produtos é maior que a \nquantidade máxima suportada por esse armário.");
                                                    }else if(conta > aB.getQtdMaxima()){
                                                        JOptionPane.showMessageDialog(null, "Esse armário já está cheio, por favor escolha outro.");
                                                    }else{
                                                        
                                                    try{
                                                    Armarios aA = new Armarios();
                                                    aA.setCodArmario(idA);
                                                    aA.setQtdMaxima(aB.getQtdMaxima());
                                                    aA.setQtdOcupada(conta);
                                                    
                                                    ArmarioDAO.atualizar(aA);
                                                    }catch (Exception ex){
                                                        
                                                    }
                                                    
                                                    ProdutoDAO.inserir(produto);
                                                    int resposta = JOptionPane.showConfirmDialog(null, nome + " cadastrado com sucesso!\n Deseja cadastrar mais um produto?", "Confirmação", JOptionPane.YES_NO_OPTION);
                                                    if (resposta == JOptionPane.YES_OPTION) {
                                                        telaCadastroProduto frame = new telaCadastroProduto();
                                                        JdpPrincipal.add(frame);
                                                        frame.setLocation(
                                                                JdpPrincipal.getWidth() / 2 - frame.getWidth() / 2,
                                                                JdpPrincipal.getHeight() / 2 - frame.getHeight() / 2);
                                                        frame.setVisible(true);
                                                        dispose();
                                                    } else if (resposta == JOptionPane.NO_OPTION) {
                                                        telaListaProduto frame = new telaListaProduto();
                                                        JdpPrincipal.add(frame);
                                                        frame.setLocation(
                                                                JdpPrincipal.getWidth() / 2 - frame.getWidth() / 2,
                                                                JdpPrincipal.getHeight() / 2 - frame.getHeight() / 2);
                                                        frame.setVisible(true);
                                                        dispose();
                                                    }
                                                    }
                                                    } catch (Exception ex) {

                                                    }
                                                    
                                                    
                                                
                                            

                                            
                                            

                                            /*telaConfirmacao frame = new telaConfirmacao();
                                        frame.setVisible(true);
                                        dispose();*/
                                            return;
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }catch (Exception e){
        String msgErro1;
        msgErro1 = "Insira apenas uma vírgula!!";
        JOptionPane.showMessageDialog(null, msgErro1);
    }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
      
    txtNome.setText("");
    txtMarca.setText("");
    txtQtdEstoque.setText("");
    txtQtdMinima.setText("");
    txtUnidadeMedida.setText("");
    txtValorUnidade.setText("");
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
        telaListaProduto frame = new telaListaProduto();
        JdpPrincipal.add(frame);
                        frame.setLocation(
                        JdpPrincipal.getWidth()/2 - frame.getWidth()/2,
                        JdpPrincipal.getHeight()/2 - frame.getHeight()/2);
        frame.setVisible(true);
        
        dispose();   
     
        
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void cbArmarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArmarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbArmarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox<String> cbArmario;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JTextField txtQtdMinima;
    private javax.swing.JTextField txtUnidadeMedida;
    private javax.swing.JTextField txtValorUnidade;
    // End of variables declaration//GEN-END:variables
}
