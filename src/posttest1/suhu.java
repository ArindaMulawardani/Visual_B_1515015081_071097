package posttest1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DADANG
 */
public class suhu extends javax.swing.JFrame {
    float c,f,k,r,cel,rem,kel,far;

    /**
     * Creates new form suhu
     */
    public suhu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelsuhu = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        celcius = new javax.swing.JRadioButton();
        kelvin = new javax.swing.JRadioButton();
        farenheit = new javax.swing.JRadioButton();
        konversi = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        labelcls = new javax.swing.JLabel();
        labelkel = new javax.swing.JLabel();
        labelfar = new javax.swing.JLabel();
        txtcls = new javax.swing.JTextField();
        txtkel = new javax.swing.JTextField();
        txtfar = new javax.swing.JTextField();
        reamur = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtrea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        labelsuhu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelsuhu.setText("SUHU AWAL");

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        celcius.setBackground(new java.awt.Color(255, 51, 102));
        buttonGroup1.add(celcius);
        celcius.setText("Celcius");
        celcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celciusActionPerformed(evt);
            }
        });

        kelvin.setBackground(new java.awt.Color(255, 51, 102));
        buttonGroup1.add(kelvin);
        kelvin.setText("Kelvin");
        kelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelvinActionPerformed(evt);
            }
        });

        farenheit.setBackground(new java.awt.Color(255, 51, 102));
        buttonGroup1.add(farenheit);
        farenheit.setText("Farenheit");
        farenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farenheitActionPerformed(evt);
            }
        });

        konversi.setBackground(new java.awt.Color(255, 51, 153));
        konversi.setText("Konversi");
        konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 51, 153));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 51, 153));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        labelcls.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelcls.setText("Celcius");

        labelkel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelkel.setText("Kelvin");

        labelfar.setText("Farenheit");

        txtcls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclsActionPerformed(evt);
            }
        });

        reamur.setBackground(new java.awt.Color(255, 51, 102));
        reamur.setText("Reamur");
        reamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reamurActionPerformed(evt);
            }
        });

        jLabel2.setText("Reamur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelsuhu)
                            .addComponent(labelcls)
                            .addComponent(labelkel)
                            .addComponent(labelfar)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(celcius)
                                        .addGap(18, 18, 18)
                                        .addComponent(kelvin)
                                        .addGap(18, 18, 18)
                                        .addComponent(farenheit)
                                        .addGap(18, 18, 18)
                                        .addComponent(reamur))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtrea, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(konversi)
                                            .addGap(28, 28, 28)
                                            .addComponent(reset)
                                            .addGap(31, 31, 31)
                                            .addComponent(keluar))
                                        .addComponent(txtcls, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtkel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfar, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelsuhu)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reamur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(celcius)
                        .addComponent(kelvin)
                        .addComponent(farenheit)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(konversi)
                    .addComponent(reset)
                    .addComponent(keluar))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcls)
                    .addComponent(txtcls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelkel)
                    .addComponent(txtkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelfar)
                    .addComponent(txtfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void celciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celciusActionPerformed
        // TODO add your handling code here:
        if(celcius.isSelected())
        {
            c = Float.parseFloat(input.getText());
            rem = (4/5)*c;
            cel = c;
            far = ((9/5)*c)+32;
            kel = c+273;
        }
        
        
    }//GEN-LAST:event_celciusActionPerformed

    private void kelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelvinActionPerformed
        // TODO add your handling code here:
        if(kelvin.isSelected())
        {
            k = Float.parseFloat(input.getText());
            far = ((9/5)*(k-273))+32;
            cel = k-273;
            kel = k;
            rem = (4/5)*(k-273);
        }
    }//GEN-LAST:event_kelvinActionPerformed

    private void farenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farenheitActionPerformed
        // TODO add your handling code here:
        if(farenheit.isSelected())
        {
            f = Float.parseFloat(input.getText());
            cel =((f-32)*5)/9;
            rem =((f-32)*4)/9;
            kel = (((f-32)*5)/9)+273;
            far = f;
        }
    }//GEN-LAST:event_farenheitActionPerformed

    private void reamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reamurActionPerformed
        // TODO add your handling code here:
        if(reamur.isSelected())
        {
            r = Float.parseFloat(input.getText());
            rem = r;
            cel = (5/4)*r;
            far = ((9/4)*r)+32;
            kel = ((5/4)*r)+273;
        }
    }//GEN-LAST:event_reamurActionPerformed

    private void konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiActionPerformed
        // TODO add your handling code here:
        txtcls.setText(Float.toString(cel));
        txtfar.setText(Float.toString(far));
        txtkel.setText(Float.toString(kel));
        txtrea.setText(Float.toString(rem));
        
    }//GEN-LAST:event_konversiActionPerformed

    private void txtclsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclsActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        input.setText("");
        txtcls.setText("");
        txtkel.setText("");
        txtfar.setText("");
        txtrea.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton celcius;
    private javax.swing.JRadioButton farenheit;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton keluar;
    private javax.swing.JRadioButton kelvin;
    private javax.swing.JButton konversi;
    private javax.swing.JLabel labelcls;
    private javax.swing.JLabel labelfar;
    private javax.swing.JLabel labelkel;
    private javax.swing.JLabel labelsuhu;
    private javax.swing.JRadioButton reamur;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txtcls;
    private javax.swing.JTextField txtfar;
    private javax.swing.JTextField txtkel;
    private javax.swing.JTextField txtrea;
    // End of variables declaration//GEN-END:variables
}
