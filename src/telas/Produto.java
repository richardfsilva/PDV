/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositorio.Repositorio;

public class Produto extends javax.swing.JDialog {

  
    public Produto(java.awt.Frame parent, boolean modal) {
       
        super(parent, modal);
        this.setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        quantidadejTextField = new javax.swing.JTextField();
        quantidadejLabel = new javax.swing.JLabel();
        PrecojTextField = new javax.swing.JTextField();
        PrecojLabel = new javax.swing.JLabel();
        DescricaojLabel = new javax.swing.JLabel();
        PratosjTextField = new javax.swing.JTextField();
        DescricaojTextField = new javax.swing.JTextField();
        PratosjLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CadastrojTable = new javax.swing.JTable();
        NovojButton = new javax.swing.JButton();
        CadastrarjButton = new javax.swing.JButton();
        LimparjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro banco");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        quantidadejTextField.setEnabled(false);

        quantidadejLabel.setForeground(new java.awt.Color(240, 240, 240));
        quantidadejLabel.setText("QUANTIDADE");


        PrecojLabel.setForeground(new java.awt.Color(240, 240, 240));
        PrecojLabel.setText(" PREÇO");

        DescricaojLabel.setForeground(new java.awt.Color(240, 240, 240));
        DescricaojLabel.setText(" DESCRIÇÃO");



        PratosjLabel.setForeground(new java.awt.Color(240, 240, 240));
        PratosjLabel.setText(" PRATOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PratosjTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PratosjLabel)
                            .addComponent(DescricaojLabel))
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addComponent(DescricaojTextField))
                .addGap(185, 185, 185)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantidadejTextField)
                    .addComponent(quantidadejLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PrecojLabel)
                        .addGap(118, 118, 118))
                    .addComponent(PrecojTextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PratosjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PratosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescricaojLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quantidadejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecojLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescricaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));

        CadastrojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Pratos", "Descrição", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(CadastrojTable);

        NovojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Plus_20px.png"))); // NOI18N
        NovojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovojButtonActionPerformed(evt);
            }
        });

        CadastrarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Add Database_20px.png"))); // NOI18N
        CadastrarjButton.setEnabled(false);
        CadastrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarjButtonActionPerformed(evt);
            }
        });

        LimparjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Broom_20px.png"))); // NOI18N
        LimparjButton.setEnabled(false);
        LimparjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NovojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(CadastrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LimparjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovojButton)
                    .addComponent(CadastrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarjButtonActionPerformed

        Repositorio objRepositorio = new Repositorio();
    
        objRepositorio.setPrato(PratosjTextField.getText());
        objRepositorio.setDescricao(DescricaojTextField.getText());
        objRepositorio.setQuantidade(Integer.parseInt(quantidadejTextField.getText()));
        objRepositorio.setPreco(Double.parseDouble(PrecojTextField.getText()));
        
        objRepositorio.inserir(objRepositorio);
      
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

     carregarPratos();

    }//GEN-LAST:event_CadastrarjButtonActionPerformed

     public void carregarPratos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Code");
        modelo.addColumn("Prato");
        modelo.addColumn("Descricao");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Preco");
        
        Repositorio objRepositorio = new Repositorio();
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        listaCliente = objRepositorio.retornarTodos();

        for (int a = 0; a < listaCliente.size(); a++) {
            String[] novoUsuario = new String[5];

            novoUsuario[0] = String.valueOf(listaCliente.get(a).getCode());
            novoUsuario[1] = listaCliente.get(a).getPrato();
            novoUsuario[2] = listaCliente.get(a).getDescricao();
            novoUsuario[3] = String.valueOf(listaCliente.get(a).getQuantidade());
            novoUsuario[4] = String.valueOf(listaCliente.get(a).getPreco());
            
            modelo.addRow(novoUsuario);
        }
        CadastrojTable.setModel(modelo);
    }
    
    private void NovojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovojButtonActionPerformed
        // TODO add your handling code here:

        PratosjTextField.setEnabled(true);
        DescricaojTextField.setEnabled(true);
        PrecojTextField.setEnabled(true);
        quantidadejTextField.setEnabled(true);

        CadastrarjButton.setEnabled(true);
        LimparjButton.setEnabled(true);


    }//GEN-LAST:event_NovojButtonActionPerformed

    private void LimparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparjButtonActionPerformed
        // TODO add your handling code here:

        PratosjTextField.setText("");
        DescricaojTextField.setText("");
        PrecojTextField.setText("");
        quantidadejTextField.setText("");

    }//GEN-LAST:event_LimparjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarjButton;
    private javax.swing.JTable CadastrojTable;
    private javax.swing.JLabel DescricaojLabel;
    private javax.swing.JTextField DescricaojTextField;
    private javax.swing.JButton LimparjButton;
    private javax.swing.JButton NovojButton;
    private javax.swing.JLabel PratosjLabel;
    private javax.swing.JTextField PratosjTextField;
    private javax.swing.JLabel PrecojLabel;
    private javax.swing.JTextField PrecojTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quantidadejLabel;
    private javax.swing.JTextField quantidadejTextField;
    // End of variables declaration//GEN-END:variables
}
