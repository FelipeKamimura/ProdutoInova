/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gui;

import br.data.entity.Cidade;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author alexandrelerario
 */
public class CadCidade extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadCidade
     */
    public CadCidade() {
        initComponents();
        listar();
    }
    
    ;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cidades");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });

        jButton1.setText("Salvar novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("UF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        add(txtNome.getText(), txtCod.getText(), txtUF.getText());
        limpar();
        listar();
        txtCod.requestFocus();
        /*br.data.entity.Cidade cid= new br.data.entity.Cidade();
        int cod = Integer.parseInt(txtCod.getText());
        String nome = txtNome.getText();
        cid.setCodigo(cod);
        cid.setNome(nome);
        new br.data.crud.CrudCidade().persist(cid);*/
    }//GEN-LAST:event_jButton1ActionPerformed
    public void add(String nomeTxt, String codTxt, String ufTxt){
        for (br.data.entity.Cidade cid : new br.data.crud.CrudCidade().getAll()) {
            if(txtNome.getText().equals(cid.getNome())){
                JOptionPane.showMessageDialog(null, "Essa Cidade já existe com o código: " + cid.getCodigo(), "Erro de cadastro", 1);
                return;
            }
        }
         br.data.entity.Cidade cid= new br.data.entity.Cidade();
        int cod = Integer.parseInt(codTxt);
        String nome = nomeTxt;
        String uf = ufTxt;
        cid.setCodigo(cod);
        cid.setNome(nome);
        cid.setUF(uf);
        new br.data.crud.CrudCidade().persist(cid);

    }
    public void listar(){  
        List lista2 = new ArrayList();
        for (br.data.entity.Cidade cid : new br.data.crud.CrudCidade().getAll()) {
            lista2.add (cid.getNome());
        }
        String[] strings = (String[]) lista2.toArray (new String[lista2.size()]);
        jList1.setListData(strings);
        jList1.addListSelectionListener(new ListSelectionListener() 
        {

        public void valueChanged(ListSelectionEvent evt) 
        {
             // To avoid double value selected
             if (evt.getValueIsAdjusting())
                return;
             System.out.println("Selected: " + jList1.getSelectedValue());
             for (br.data.entity.Cidade cid : new br.data.crud.CrudCidade().getAll()) {
                 if(jList1.getSelectedValue() == cid.getNome()){
                     txtCod.setText(cid.getCodigo().toString());
                     txtUF.setText(cid.getUF());
                 }
            }
             txtNome.setText(jList1.getSelectedValue());
        }

    });
    }
    
    private void delete(String nome, int cod, String uf){
        br.data.entity.Cidade cid= new br.data.entity.Cidade();
        cid.setCodigo(cod);
        cid.setNome(nome);
        cid.setUF(uf);
        new br.data.crud.CrudCidade().remove(cid);
}
    
    public void limpar(){
        txtNome.setText("");
        txtCod.setText("");
        txtUF.setText("");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       listar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if("".equals(txtCod.getText()) || "".equals(txtNome.getText())){
            JOptionPane.showMessageDialog(null, "Informe os dados da cidade a ser excluida");
        }else{
            delete(txtNome.getText(), Integer.parseInt(txtCod.getText()), txtUF.getText());
            limpar();
            listar();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            super.processKeyEvent(evt);
        }else{
            evt.consume();
        }
return;// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
