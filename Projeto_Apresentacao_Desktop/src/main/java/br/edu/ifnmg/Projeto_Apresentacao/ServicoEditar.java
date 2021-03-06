/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto_Apresentacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.RepositorioFactory;
import br.edu.ifnmg.Projeto.LogicaAplicacao.Servico;
import br.edu.ifnmg.Projeto.LogicaAplicacao.ServicoRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author larisse
 */
public class ServicoEditar extends javax.swing.JInternalFrame {

    
    Servico servico;
    ServicoRepositorio repositorio;
    /**
     * Creates new form ServicoEditar
     */
    public ServicoEditar(Servico s) {
        
        this.servico = s;
        this.repositorio = RepositorioFactory.getServicoRepositorio();        
        initComponents();
        this.setComponentes();
    }

     private void setComponentes(){
        
        this.lblId.setText(this.servico.getId().toString());
        this.txtDescricao.setText(this.servico.getDescricao());
        this.txtValor.setText(this.servico.getValor().toString());
    }
    
     private void getComponentes(){
        
        this.servico.setDescricao(this.txtDescricao.getText());
        //this.servico.setValor(this.txtValor.getText());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlServicos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);

        pnlServicos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Cadastro de serviço");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Valor:");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar serviço");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        lblId.setText("O");

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlServicosLayout = new javax.swing.GroupLayout(pnlServicos);
        pnlServicos.setLayout(pnlServicosLayout);
        pnlServicosLayout.setHorizontalGroup(
            pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServicosLayout.createSequentialGroup()
                .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlServicosLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(pnlServicosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlServicosLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(30, 30, 30)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlServicosLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(60, 60, 60)
                                    .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlServicosLayout.createSequentialGroup()
                                    .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblId)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlServicosLayout.setVerticalGroup(
            pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(pnlServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlServicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente salvar um novo serviço:", "Confirmar", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION){
            this.getComponentes();
             if(repositorio.Salvar(this.servico)){
               JOptionPane.showMessageDialog(this, "Serviço salvo com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE );
               this.setComponentes();
                    
            }else{
                    
                    JOptionPane.showMessageDialog(this, "Falha ao cadastrar serviço", "Informação",
                            JOptionPane.ERROR_MESSAGE);
              }
                  
        }else{
              JOptionPane.showMessageDialog(this, "Operação cancelada","Informação", JOptionPane.INFORMATION_MESSAGE);
                 
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente remover esse servico?", "Confirmação", JOptionPane.YES_NO_OPTION)
                
                == JOptionPane.YES_OPTION){
                   
                    if(repositorio.Apagar(this.servico)){
                       this.setVisible(true);

                    }else{

                            JOptionPane.showMessageDialog(this, "Falha ao salvar os dados", "Informação",
                                    JOptionPane.ERROR_MESSAGE);
                      }
                 
            
        }
                
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente cancelar o cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION){
            
                JOptionPane.showMessageDialog(this, "cadastro cancelado!");
                dispose();
        
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblId;
    private javax.swing.JPanel pnlServicos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
