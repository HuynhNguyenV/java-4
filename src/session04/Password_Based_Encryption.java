/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author nguyenducthao
 */
public class Password_Based_Encryption extends javax.swing.JFrame {

    /**
     * Creates new form passwordencryption
     */
    public Password_Based_Encryption() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows." +
                    "WindowsLookAndFeel");
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        }
        UIManager.put("Button.showMnemonics", Boolean.TRUE);
        getContentPane().setBackground(new Color(212,208,200));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcrFileSelector = new javax.swing.JFileChooser();
        lblHeader = new javax.swing.JLabel();
        pnlEncryption = new javax.swing.JPanel();
        lblInstruction = new javax.swing.JLabel();
        lblFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        lblEncryptPassword = new javax.swing.JLabel();
        txpEncryptPassword = new javax.swing.JPasswordField();
        pnlDecryption = new javax.swing.JPanel();
        lblInstruction1 = new javax.swing.JLabel();
        lblDecryptFile = new javax.swing.JLabel();
        txtDecryptFile = new javax.swing.JTextField();
        btnDecryptBrowse = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        lblDecryptPassword = new javax.swing.JLabel();
        txpDecryptPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password-Based Encryptor/Decryptor");

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(153, 51, 0));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Password-Based Encryptor/Decryptor");

        pnlEncryption.setBorder(javax.swing.BorderFactory.createTitledBorder("Encrypt File"));
        pnlEncryption.setLayout(null);

        lblInstruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction.setText("Select the file to be encrypted.");
        pnlEncryption.add(lblInstruction);
        lblInstruction.setBounds(10, 20, 310, 14);

        lblFile.setText("File: ");
        pnlEncryption.add(lblFile);
        lblFile.setBounds(10, 50, 30, 14);

        txtFile.setEditable(false);
        pnlEncryption.add(txtFile);
        txtFile.setBounds(80, 50, 150, 20);

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        pnlEncryption.add(btnBrowse);
        btnBrowse.setBounds(250, 50, 80, 23);

        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });
        pnlEncryption.add(btnEncrypt);
        btnEncrypt.setBounds(250, 90, 80, 23);

        lblEncryptPassword.setText("Password:");
        pnlEncryption.add(lblEncryptPassword);
        lblEncryptPassword.setBounds(10, 90, 60, 14);

        txpEncryptPassword.setPreferredSize(new java.awt.Dimension(126, 20));
        pnlEncryption.add(txpEncryptPassword);
        txpEncryptPassword.setBounds(80, 90, 150, 20);

        pnlDecryption.setBorder(javax.swing.BorderFactory.createTitledBorder("Decrypt File"));
        pnlDecryption.setLayout(null);

        lblInstruction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction1.setText("Select the file to be decrypted.");
        pnlDecryption.add(lblInstruction1);
        lblInstruction1.setBounds(10, 20, 310, 14);

        lblDecryptFile.setText("File: ");
        pnlDecryption.add(lblDecryptFile);
        lblDecryptFile.setBounds(10, 50, 30, 14);

        txtDecryptFile.setEditable(false);
        pnlDecryption.add(txtDecryptFile);
        txtDecryptFile.setBounds(80, 50, 150, 20);

        btnDecryptBrowse.setText("Browse");
        btnDecryptBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptBrowseActionPerformed(evt);
            }
        });
        pnlDecryption.add(btnDecryptBrowse);
        btnDecryptBrowse.setBounds(250, 50, 80, 23);

        btnDecrypt.setText("Decrypt");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });
        pnlDecryption.add(btnDecrypt);
        btnDecrypt.setBounds(250, 90, 80, 23);

        lblDecryptPassword.setText("Password:");
        pnlDecryption.add(lblDecryptPassword);
        lblDecryptPassword.setBounds(10, 90, 60, 14);

        txpDecryptPassword.setPreferredSize(new java.awt.Dimension(126, 20));
        pnlDecryption.add(txpDecryptPassword);
        txpDecryptPassword.setBounds(80, 90, 150, 20);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlDecryption, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDecryption, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:

        fcrFileSelector.setDialogTitle("Select file to be encrypted");
        int returnVal = fcrFileSelector.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            txtFile.setText(
                fcrFileSelector.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        FileInputStream fileIn;
        FileOutputStream fileOut;
        PBEKeySpec pbeKeySpec;
        PBEParameterSpec pbeParamSpec;
        SecretKeyFactory keyFac;

        char[] password = txpEncryptPassword.getPassword();
        if(password.length <= 0){
            JOptionPane.showMessageDialog(this,
                new String("The file cannot be encrypted without " +
                    "a password!"), "Password Needed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Salt
        byte[] salt = {
            (byte)0xc7, (byte)0x73, (byte)0x21, (byte)0x8c,
            (byte)0x7e, (byte)0xc8, (byte)0xee, (byte)0x99
        };

        // Iteration count
        int count = 20;

        try {
            // Create PBE parameter set
            pbeParamSpec = new PBEParameterSpec(salt, count);

            pbeKeySpec = new PBEKeySpec(password);

            // Create a secret key
            keyFac = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
            SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);

            // Create PBE Cipher
            Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");

            // Initialize PBE Cipher with key and parameters
            pbeCipher.init(Cipher.ENCRYPT_MODE, pbeKey, pbeParamSpec);

            // Read bytes from the file and create a new encrypted file.
            String file = txtFile.getText();
            fileIn = new FileInputStream(file);

            // Read the file data into a byte array
            byte[] plainText = new byte[fileIn.available()];
            fileIn.read(plainText);

            // Encrypty the file data and store it in a byte array
            byte[] encryptedText = pbeCipher.doFinal(plainText);

            // Create filename with the prefix "Encrypted-"
            String selectedFile = fcrFileSelector.getSelectedFile().getName();
            String completePath = fcrFileSelector.getSelectedFile().getPath();
            StringBuffer filename = new StringBuffer(completePath);
            filename.insert(completePath.indexOf(selectedFile), "Encrypted-");

            // Write the encrypted data to a file
            fileOut = new FileOutputStream(filename.toString());
            fileOut.write(encryptedText);

            // Close the file streams
            fileIn.close();
            fileOut.close();

            JOptionPane.showMessageDialog(this, new String("The encrypted file is: " + filename), "Encryption Successful",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (InvalidKeySpecException ex) {
            ex.printStackTrace();
        } catch (BadPaddingException ex) {
            ex.printStackTrace();
        } catch (NoSuchPaddingException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (InvalidAlgorithmParameterException ex) {
            ex.printStackTrace();
        } catch (IllegalBlockSizeException ex) {
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptBrowseActionPerformed
        // TODO add your handling code here:
        fcrFileSelector.setDialogTitle("Select file to be decrypted");
        int returnVal = fcrFileSelector.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            txtDecryptFile.setText(
                fcrFileSelector.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnDecryptBrowseActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        FileInputStream fileIn;
        FileOutputStream fileOut;
        PBEKeySpec pbeKeySpec;
        PBEParameterSpec pbeParamSpec;
        SecretKeyFactory keyFac;

        char[] password = txpDecryptPassword.getPassword();
        if(password.length <= 0){
            JOptionPane.showMessageDialog(this,
                new String("The file cannot be decrypted without " +
                    "a password!"), "Password Needed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Salt
        byte[] salt = {
            (byte)0xc7, (byte)0x73, (byte)0x21, (byte)0x8c,
            (byte)0x7e, (byte)0xc8, (byte)0xee, (byte)0x99
        };

        // Iteration count
        int count = 20;

        try {
            // Create PBE parameter set
            pbeParamSpec = new PBEParameterSpec(salt, count);

            pbeKeySpec = new PBEKeySpec(password);

            // Create a secret key
            keyFac = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
            SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);

            // Create PBE Cipher
            Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");

            // Initialize PBE Cipher with key and parameters
            pbeCipher.init(Cipher.DECRYPT_MODE, pbeKey, pbeParamSpec);

            // Create a file instance for the encrypted file selected.
            String file = txtDecryptFile.getText();
            fileIn = new FileInputStream(file);

            // Read the data from the encrypted file into a byte array.
            byte[] encryptedText = new byte[fileIn.available()];
            fileIn.read(encryptedText);

            // Decrypt the data and store it in byte array
            byte[] plainText = pbeCipher.doFinal(encryptedText);

            // Create a filename with prefix "Encrypted-" replaced with "Decrypted-"
            String completePath = fcrFileSelector.getSelectedFile().getPath();
            StringBuffer filename = new StringBuffer(completePath);
            filename.replace(completePath.indexOf("Encrypted-"),
                completePath.indexOf("Encrypted-") + "Encrypted-".length(),
                "Decrypted-" );

            // Write the decrypted data to a file
            fileOut = new FileOutputStream(filename.toString());
            fileOut.write(plainText);

            // Close the file streams
            fileIn.close();
            fileOut.close();

            JOptionPane.showMessageDialog(this, new String("The decrypted file is: " + filename.toString()), "Decryption Successful",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (InvalidKeySpecException ex) {
            ex.printStackTrace();
        } catch (BadPaddingException ex) {
            ex.printStackTrace();
        } catch (NoSuchPaddingException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (InvalidAlgorithmParameterException ex) {
            ex.printStackTrace();
        } catch (IllegalBlockSizeException ex) {
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Password_Based_Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_Based_Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_Based_Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_Based_Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_Based_Encryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnDecryptBrowse;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnExit;
    private javax.swing.JFileChooser fcrFileSelector;
    private javax.swing.JLabel lblDecryptFile;
    private javax.swing.JLabel lblDecryptPassword;
    private javax.swing.JLabel lblEncryptPassword;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JPanel pnlDecryption;
    private javax.swing.JPanel pnlEncryption;
    private javax.swing.JPasswordField txpDecryptPassword;
    private javax.swing.JPasswordField txpEncryptPassword;
    private javax.swing.JTextField txtDecryptFile;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
}