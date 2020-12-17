/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Projeto_Apresentacao;

import br.edu.ifnmg.Projeto.LogicaAplicacao.Paciente;
import br.edu.ifnmg.Projeto.LogicaAplicacao.PessoaPacienteRepositorio;
import br.edu.ifnmg.Projeto.LogicaAplicacao.RepositorioFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author larisse
 */
public class PacienteEditar extends javax.swing.JInternalFrame {

    /**
     * Creates new form PacienteEditar
     */
    
    Paciente paciente;
    PessoaPacienteRepositorio repositorio;
    
    
    public PacienteEditar(Paciente pac) {
        
        this.paciente = pac;
        this.repositorio = RepositorioFactory.getPessoaPacienteRepositorio();               
        initComponents();
        this.setComponentes();
        
    }

     private void setComponentes(){
        
        this.lblId.setText(this.paciente.getId().toString());
        this.txtNome.setText(this.paciente.getNome());
        this.txtCpf.setText(this.paciente.getCpf());
        this.txtTelefone.setText(this.paciente.getTelefone());
        
       
    }
    
     private void getComponentes(){
        
        this.paciente.setNome(this.txtNome.getText());
        this.paciente.setCpf(this.txtCpf.getText());
        this.paciente.setTelefone(this.txtTelefone.getText());
   
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
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastrar paciente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Remover");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        lblId.setText("0");

        jLabel3.setText("CPF:");

        jLabel4.setText("Telefone:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(128, 128, 128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblId))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblId))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(this, "Deseja realmente salvar os dados do paciente:", "Confirmar", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION){
            this.getComponentes();
             if(repositorio.Salvar(this.paciente)){
               JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE );
               this.setComponentes();
                    
            }else{
                    
                    JOptionPane.showMessageDialog(this, "Falha ao salvar os dados", "Informação",
                            JOptionPane.ERROR_MESSAGE);
            }
                  
        }else{
              JOptionPane.showMessageDialog(this, "Operação cancelada","Informação", JOptionPane.INFORMATION_MESSAGE);
                 
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
           
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente remover esse usuário?", "Confirmação", JOptionPane.YES_NO_OPTION)
                
                == JOptionPane.YES_OPTION){
                   
                    if(repositorio.Apagar(this.paciente)){
                       this.setVisible(true);

                    }else{

                            JOptionPane.showMessageDialog(this, "Falha ao salvar os dados", "Informação",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                 
            
        }
        
    }//GEN-LAST:event_btnLimparActionPerformed

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
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
