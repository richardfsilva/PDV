/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import repositorio.Repositorio;

public class Venda extends javax.swing.JDialog {

    int flag = 1;
    float resultado;
    DefaultTableModel modelo = new DefaultTableModel();
    double valorTotal = 0;

    /**
     * Creates new form Venda
     */
    public Venda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setResizable(false);
        initComponents();
        modelo.addColumn("Code");
        modelo.addColumn("Prato");
        modelo.addColumn("Descricao");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Preco");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        precounitarioljTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dinheirojTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        trocojTextField = new javax.swing.JTextField();
        precounitariojLabel = new javax.swing.JLabel();
        totaljTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendajTable = new javax.swing.JTable();
        finalizarvendajButton = new javax.swing.JButton();
        pesquisajButton = new javax.swing.JButton();
        pesquisajTextField = new javax.swing.JTextField();
        gerartrocojButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setIconImage(null);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Troco");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dinheiro");

        precounitariojLabel.setFont(new java.awt.Font("Arabic Typesetting", 3, 24)); // NOI18N
        precounitariojLabel.setForeground(new java.awt.Color(255, 255, 255));
        precounitariojLabel.setText("Preço unitario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trocojTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precounitarioljTextField)
                            .addComponent(dinheirojTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(precounitariojLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(totaljTextField1)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(precounitariojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(precounitarioljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dinheirojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trocojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(totaljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));

        vendajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Prato", "Descrição", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        jScrollPane1.setViewportView(vendajTable);

        finalizarvendajButton.setText("Finalizar Venda");
        finalizarvendajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarvendajButtonActionPerformed(evt);
            }
        });

        pesquisajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Search_15px.png"))); // NOI18N
        pesquisajButton.setToolTipText("Pesquisar produto");
        pesquisajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisajButtonActionPerformed(evt);
            }
        });

        gerartrocojButton.setText("Gerar Troco");
        gerartrocojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerartrocojButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pesquisajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(finalizarvendajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gerartrocojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalizarvendajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerartrocojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisajButtonActionPerformed

        try {
            flag = 1;
            this.pesquisarPratos(pesquisajTextField.getText());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_pesquisajButtonActionPerformed

    private void finalizarvendajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarvendajButtonActionPerformed
 
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
        }
        
        vendajTable.setModel(modelo);
        
        precounitarioljTextField.setText("");
        totaljTextField1.setText("");
        dinheirojTextField.setText("");
        trocojTextField.setText("");
        pesquisajTextField.setText("");
    }//GEN-LAST:event_finalizarvendajButtonActionPerformed

    private void gerartrocojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerartrocojButtonActionPerformed
        
    	float troco;
        troco = Float.parseFloat(dinheirojTextField.getText()) - Float.parseFloat(totaljTextField1.getText());
        trocojTextField.setText(String.valueOf(troco));
    }//GEN-LAST:event_gerartrocojButtonActionPerformed

    public void pesquisarPratos(String nomePesquisa) {
        Repositorio objRepositorio = new Repositorio();
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        objRepositorio.setCode(Integer.parseInt(nomePesquisa));

        listaCliente = objRepositorio.retornar(objRepositorio);

        for (int a = 0; a < listaCliente.size(); a++) {
            String[] novoUsuario = new String[5];

            novoUsuario[0] = String.valueOf(listaCliente.get(a).getCode());
            novoUsuario[1] = listaCliente.get(a).getPrato();
            novoUsuario[2] = listaCliente.get(a).getDescricao();
            novoUsuario[3] = String.valueOf(listaCliente.get(a).getQuantidade());
            novoUsuario[4] = String.valueOf(listaCliente.get(a).getPreco());

            valorTotal += listaCliente.get(a).getPreco();

            precounitarioljTextField.setText(String.valueOf(listaCliente.get(a).getPreco()));
            totaljTextField1.setText(String.valueOf(valorTotal));

            modelo.addRow(novoUsuario);

        }
        vendajTable.setModel(modelo);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dinheirojTextField;
    private javax.swing.JButton finalizarvendajButton;
    private javax.swing.JButton gerartrocojButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisajButton;
    private javax.swing.JTextField pesquisajTextField;
    private javax.swing.JLabel precounitariojLabel;
    private javax.swing.JTextField precounitarioljTextField;
    private javax.swing.JTextField totaljTextField1;
    private javax.swing.JTextField trocojTextField;
    private javax.swing.JTable vendajTable;
    // End of variables declaration//GEN-END:variables
}
