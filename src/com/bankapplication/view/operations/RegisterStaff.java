/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankapplication.view.operations;

import com.bankapplication.controller.StaffController;
import com.bankapplication.model.Staff;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author derickfelix
 */
public class RegisterStaff extends javax.swing.JDialog {

    private File file;
    private StaffController staffController;
    private Staff staff;

    /**
     * Creates new form RegisterStaff
     */
    public RegisterStaff(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        customOperations();
    }

    private void customOperations() {
        this.staffController = StaffController.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        paneTittle = new javax.swing.JPanel();
        panelbTitle = new javax.swing.JLabel();
        paneBody = new javax.swing.JPanel();
        lblAddress = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cmbDay = new javax.swing.JComboBox<>();
        radioFemale = new javax.swing.JRadioButton();
        txtAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        lblSex = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        lblDOB = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        paneThumbnail = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        btnBrowsePicture = new javax.swing.JButton();
        cmbRank = new javax.swing.JComboBox<>();
        lblRank = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trisoft Bank - Register Staff");

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

        paneBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Staff", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Address:");

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        btnGroupSex.add(radioFemale);
        radioFemale.setText("Female");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSex.setText("Sex:");

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965" }));

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("DOB:");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        btnGroupSex.add(radioMale);
        radioMale.setText("Male");

        paneThumbnail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout paneThumbnailLayout = new javax.swing.GroupLayout(paneThumbnail);
        paneThumbnail.setLayout(paneThumbnailLayout);
        paneThumbnailLayout.setHorizontalGroup(
            paneThumbnailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneThumbnailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneThumbnailLayout.setVerticalGroup(
            paneThumbnailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneThumbnailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBrowsePicture.setText("Browse Picture");
        btnBrowsePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsePictureActionPerformed(evt);
            }
        });

        cmbRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Rank", "Board of Director", "Chief Executive Officer", "Chief Operating Officer", "General Manager", "Deputy General Manager", "Assistant General Manager", "Principal Officer", "Senior Officer/Probationary Officer", "Clerical Staff Member", "Non-Clerical Staff Member" }));

        lblRank.setText("Rank:");

        lblStatus.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(168, 1, 1));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paneBodyLayout = new javax.swing.GroupLayout(paneBody);
        paneBody.setLayout(paneBodyLayout);
        paneBodyLayout.setHorizontalGroup(
            paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRank, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbRank, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtAddress)
                    .addComponent(txtName)
                    .addGroup(paneBodyLayout.createSequentialGroup()
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneBodyLayout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioFemale))
                            .addGroup(paneBodyLayout.createSequentialGroup()
                                .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneThumbnail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBrowsePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        paneBodyLayout.setVerticalGroup(
            paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBodyLayout.createSequentialGroup()
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBodyLayout.createSequentialGroup()
                        .addComponent(paneThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowsePicture)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBodyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioMale)
                            .addComponent(radioFemale)
                            .addComponent(lblSex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRank)
                            .addComponent(cmbRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))))
                .addContainerGap())
        );

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnCancel))
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBrowsePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsePictureActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            Image img = getToolkit().createImage(file.getAbsolutePath())
                    .getScaledInstance(110, 110, Image.SCALE_SMOOTH);
            lblPicture.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnBrowsePictureActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
                try {
            // Min: 1000, Max: 9999
            int random = (int) (Math.random() * 9999 + 1000);
            // sets a random account number
            String acc = Integer.toString(random);
            String name = txtName.getText();
            String address = txtAddress.getText();
            String rank = cmbRank.getSelectedItem().toString();

            char sex = 'm';
            if (radioFemale.isSelected()) {
                sex = 'f';
            }
            // Database mask yy-mm-dd
            String dob = (String) cmbYear.getSelectedItem() + "-" + cmbMonth.getSelectedItem() + "-" + cmbDay.getSelectedItem();
            String psw = txtPassword.getText();
            if (fieldsIsEmpty()) {
                lblStatus.setText("Error: Some of the fields is empty!");
            } else {
                staff = new Staff();
                staff.setAccountNumber(acc);
                staff.setName(name);
                staff.setAddress(address);
                staff.setRank(rank);
                staff.setDob(dob);
                staff.setSex(sex);
                staff.setPassword(psw);
                staffController.store(staff);
                JOptionPane.showMessageDialog(this, "Staff created successfully\n"
                                                  + "Account Number: " + acc);
                this.dispose();
            }
        } catch (HeadlessException e) {
            System.out.println("Input Error: " + e);
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * It clears all the fields in this form
     */
    private void clearFields() {
        // Combo box
        this.cmbDay.setSelectedIndex(0);
        this.cmbMonth.setSelectedIndex(0);
        this.cmbYear.setSelectedIndex(0);
        this.cmbRank.setSelectedIndex(0);
        // Text
        this.txtName.setText(null);
        this.txtAddress.setText(null);
        this.txtPassword.setText(null);
        this.txtAddress.setText(null);
    }

    /**
     * Checks if there is an empty field
     *
     * @return It there is an empty field, if so it returns true
     */
    private boolean fieldsIsEmpty() {
        return txtAddress.getText() == null
                || txtName.getText() == null || txtPassword.getText() == null
                || cmbRank.getSelectedIndex() == 0 || cmbDay.getSelectedIndex() == 0
                || cmbMonth.getSelectedIndex() == 0 || cmbYear.getSelectedIndex() == 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowsePicture;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbRank;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblRank;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel paneBody;
    private javax.swing.JPanel paneThumbnail;
    private javax.swing.JPanel paneTittle;
    private javax.swing.JLabel panelbTitle;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
