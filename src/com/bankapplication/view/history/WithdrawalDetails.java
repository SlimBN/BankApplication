/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankapplication.view.history;

import com.bankapplication.controller.OperationController;
import com.bankapplication.model.Deposit;
import com.bankapplication.model.Withdraw;
import java.util.ArrayList;

/**
 *
 * @author derickfelix
 */
public class WithdrawalDetails extends javax.swing.JDialog {

    private OperationController operationCtrl;
    private ArrayList<Withdraw> withdraws;

    /**
     * Creates new form RegisteredCustomer
     */
    public WithdrawalDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        customOperations();
    }

    private void customOperations() {
        this.operationCtrl = OperationController.getInstance();
        this.withdraws = operationCtrl.getAllWithdraws();
        for (int i = 0; i < this.withdraws.size(); i++) {
            Withdraw tempWithdraw = this.withdraws.get(i);
            // Amount
            tableWithdrawals.setValueAt(tempWithdraw.getAmount(), i, 0);
            // Date
            tableWithdrawals.setValueAt(tempWithdraw.getDate().toString(), i, 1);
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

        paneTittle = new javax.swing.JPanel();
        panelbTitle = new javax.swing.JLabel();
        scrllPanelWithdraws = new javax.swing.JScrollPane();
        tableWithdrawals = new javax.swing.JTable();
        paneButtons = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trisoft Bank - Withdrawal Details");

        paneTittle.setBackground(new java.awt.Color(0, 83, 165));

        panelbTitle.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        panelbTitle.setForeground(new java.awt.Color(254, 254, 254));
        panelbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelbTitle.setText("TRISOFT BANK OF USA");

        javax.swing.GroupLayout paneTittleLayout = new javax.swing.GroupLayout(paneTittle);
        paneTittle.setLayout(paneTittleLayout);
        paneTittleLayout.setHorizontalGroup(
            paneTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneTittleLayout.setVerticalGroup(
            paneTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTittleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelbTitle)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tableWithdrawals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "amount", "time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrllPanelWithdraws.setViewportView(tableWithdrawals);

        btnPrint.setText("Print");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneButtonsLayout = new javax.swing.GroupLayout(paneButtons);
        paneButtons.setLayout(paneButtonsLayout);
        paneButtonsLayout.setHorizontalGroup(
            paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneButtonsLayout.setVerticalGroup(
            paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneButtonsLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnCancel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrllPanelWithdraws, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrllPanelWithdraws, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel paneButtons;
    private javax.swing.JPanel paneTittle;
    private javax.swing.JLabel panelbTitle;
    private javax.swing.JScrollPane scrllPanelWithdraws;
    private javax.swing.JTable tableWithdrawals;
    // End of variables declaration//GEN-END:variables
}
