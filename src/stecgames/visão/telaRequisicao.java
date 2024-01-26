/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import java.beans.PropertyVetoException;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import stecgames.modelo.Produtos;
import stecgames.modelo.Requisicoes;
import stecgames.persistencia.ProdutoDAO;
import stecgames.persistencia.RequisicaoDAO;
import stecgames.utilitarios.soNumeros;
import static stecgames.visão.TelaPrincipal.JdpPrincipal;

/**
 *
 * @author Daniel
 */
public class telaRequisicao extends javax.swing.JInternalFrame {

    /**
     * Creates new form telaReq
     */
    
    public telaRequisicao() {
        initComponents();
        
        txtQtd.setDocument(new soNumeros());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btRequisicao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTeste = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDisponivel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbSetor = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btRequisicao.setText("Gerar requisição");
        btRequisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRequisicaoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel6.setText("ID: ");

        txtTeste.setEditable(false);
        txtTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTesteActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca: ");

        txtNome.setEditable(false);

        txtMarca.setEditable(false);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMarca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel5.setText("Qnt Disponível: ");

        txtDisponivel.setEditable(false);

        jLabel3.setText("Qnt: ");

        jLabel4.setText("Setor Requisitante: ");

        cbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "RH", "Financeiro", "Cursos e Treinamentos", "Vendas", "Projetos/Desenvolvimento", "Marketing", "Almoxarifado" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btRequisicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRequisicao)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       telaListaProduto tela = new telaListaProduto();
        
        JdpPrincipal.add(tela);
        tela.setLocation(
            JdpPrincipal.getWidth()/2 - tela.getWidth()/2,
            JdpPrincipal.getHeight()/2 - tela.getHeight()/2);
        
        tela.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btRequisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRequisicaoActionPerformed
        String nome = txtNome.getText();
        String marca = txtMarca.getText();
        
        String qtdAux = txtQtd.getText();
        
        
        String qtdDispAux = txtDisponivel.getText();
        int qtdDisp = Integer.parseInt(qtdDispAux);
        
        String setor = cbSetor.getSelectedItem().toString();
        
        
        String testeAux = txtTeste.getText();
        int teste = Integer.parseInt(testeAux);
        
        String msgErro;
        
        if(qtdAux.equals("")){
            msgErro = "Preencha o campo QUANTIDADE.";
            JOptionPane.showMessageDialog(null, msgErro);
        }else{
            
        int qtd = Integer.parseInt(qtdAux);
        
        if (nome != null) {

            Requisicoes rI = new Requisicoes();
            Produtos produtoI = new Produtos();

            int qtds = (qtdDisp - qtd);

            rI.setNomeProduto(nome);
            rI.setMarcaProduto(marca);
            rI.setQtdProduto(qtd);
            rI.setSetor(setor);

            try {
                if (qtdDisp < qtd) {
                    JOptionPane.showMessageDialog(null, "A quantidade requisitada é maior\nque a quantidade disponível.");
                } else {
                    Produtos pB = new Produtos();
                    
                    
                    try {

                        pB.setCodigo(teste);
                        pB = ProdutoDAO.buscar(teste);

                    } catch (Exception e) {

                        throw new ServerException(e.getMessage());

                    }
                    
                    produtoI.setNome(nome);
                    produtoI.setMarca(marca);
                    produtoI.setQntEstoque(qtds);
                    produtoI.setQntMinima(pB.getQntMinima());
                    produtoI.setUnidMedida(pB.getUnidMedida());
                    produtoI.setValorUnidade(pB.getValorUnidade());
                    produtoI.setTipo(pB.getTipo());
                    produtoI.setCodigo(teste);
                    
                    ProdutoDAO.atualizar(produtoI);

                    RequisicaoDAO.inserir(rI);
                    
                          telaListaRequisicoes tela;
        try {
            tela = new telaListaRequisicoes(); JdpPrincipal.add(tela);
        tela.setLocation(
            JdpPrincipal.getWidth()/2 - tela.getWidth()/2,
            JdpPrincipal.getHeight()/2 - tela.getHeight()/2);
         
         
        tela.setVisible(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
                    dispose();
                }

            } catch (Exception ex) {

            }

            return;
        }
        }
    }//GEN-LAST:event_btRequisicaoActionPerformed

    private void txtTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTesteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRequisicao;
    private javax.swing.JComboBox<String> cbSetor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDisponivel;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTeste;
    // End of variables declaration//GEN-END:variables
public void recebendo(String recebe) throws ServerException{
    int recebeAux = Integer.parseInt(recebe);
    Produtos p  = new Produtos();
    
    try{
     
    p.setCodigo(recebeAux);
    p = ProdutoDAO.buscar(recebeAux);
    
 }catch(Exception e){
     
    throw new ServerException(e.getMessage());
    
 }
    String nome = p.getNome();
    String marca = p.getMarca();
    String qntEstoque = Integer.toString(p.getQntEstoque());
    
    txtTeste.setText(recebe);
    txtNome.setText(nome);
    txtMarca.setText(marca);
    txtDisponivel.setText(qntEstoque);
    
    
    }
}
