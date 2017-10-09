/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import calculo.Newton;

/**
 *
 * @author 6248489
 */
public class principal extends javax.swing.JFrame {

    double[] X;
    double[] F;
    double xbusca;
    double result;
    Newton l;

    /**
     * Creates new form principal
     */
    public principal() {

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

        jPanel1 = new javax.swing.JPanel();
        x1 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        busca = new javax.swing.JTextField();
        labelX = new javax.swing.JLabel();
        labelF = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        x4 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        x5 = new javax.swing.JTextField();
        f5 = new javax.swing.JTextField();
        x6 = new javax.swing.JTextField();
        f6 = new javax.swing.JTextField();
        x7 = new javax.swing.JTextField();
        f7 = new javax.swing.JTextField();
        x8 = new javax.swing.JTextField();
        f8 = new javax.swing.JTextField();
        SliderNum = new javax.swing.JSlider();
        labelPontos = new javax.swing.JLabel();
        numPontos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ButtonEx2 = new javax.swing.JButton();
        ButtonEx3 = new javax.swing.JButton();
        ButtonEx3b = new javax.swing.JButton();
        ButtonEx4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ButtonEx4b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interpolação Polinomial de Newton");

        x1.setText("-1");

        f1.setText("4");

        x2.setText("0");

        f2.setText("1");

        x3.setText("2");

        f3.setText("-1");

        busca.setText("0.666");

        labelX.setText("Valores de X");

        labelF.setText("Valores de Y");

        labelResultado.setText("Resultado do Exemplo: -0.2581");

        jLabel1.setText("X :");

        x4.setText("0");

        f4.setText("0");

        x5.setText("0");

        f5.setText("0");

        x6.setText("0");

        f6.setText("0");

        x7.setText("0");

        f7.setText("0");

        x8.setText("0");

        f8.setText("0");

        SliderNum.setMaximum(8);
        SliderNum.setMinimum(2);
        SliderNum.setValue(3);
        SliderNum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderNumStateChanged(evt);
            }
        });

        labelPontos.setText("Número de pontos:");

        numPontos.setText("3 pontos.");

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        ButtonEx2.setText("Ex 2");
        ButtonEx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEx2ActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonEx2);

        ButtonEx3.setText("Ex 3");
        ButtonEx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEx3ActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonEx3);

        ButtonEx3b.setText("Ex3_b");
        ButtonEx3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEx3bActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonEx3b);

        ButtonEx4.setText("Ex 4");
        ButtonEx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEx4ActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonEx4);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButtonEx4b.setText("Ex4_b");
        ButtonEx4b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEx4bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelX)
                                .addComponent(labelPontos)
                                .addComponent(labelF))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SliderNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(numPontos))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(x1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(f2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(x2))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(f3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(x3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(f4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(x4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(f6)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(x7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(f7))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(f8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(x8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                            .addGap(3, 3, 3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonEx4b)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelResultado))
                .addGap(10, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SliderNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelX)
                            .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelF)))
                    .addComponent(numPontos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPontos)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelResultado))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ButtonEx4b)
                                .addComponent(jLabel1)
                                .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        F = new double[SliderNum.getValue()];
        X = new double[SliderNum.getValue()];
        l = new Newton();

        X[0] = Double.parseDouble(x1.getText());
        X[1] = Double.parseDouble(x2.getText());

        F[0] = Double.parseDouble(f1.getText());
        F[1] = Double.parseDouble(f2.getText());
        if (SliderNum.getValue() > 2) {
            X[2] = Double.parseDouble(x3.getText());
            F[2] = Double.parseDouble(f3.getText());
        }

        if (SliderNum.getValue() > 3) {
            X[3] = Double.parseDouble(x4.getText());
            F[3] = Double.parseDouble(f4.getText());
        }
        if (SliderNum.getValue() > 4) {
            X[4] = Double.parseDouble(x5.getText());
            F[4] = Double.parseDouble(f5.getText());
        }
        if (SliderNum.getValue() > 5) {
            X[5] = Double.parseDouble(x6.getText());
            F[5] = Double.parseDouble(f6.getText());
        }
        if (SliderNum.getValue() > 6) {
            X[6] = Double.parseDouble(x7.getText());
            F[6] = Double.parseDouble(f7.getText());
        }
        if (SliderNum.getValue() > 7) {
            X[7] = Double.parseDouble(x8.getText());
            F[7] = Double.parseDouble(f8.getText());

        }
        xbusca = Double.parseDouble(busca.getText());

        l = new Newton(X, F, xbusca, SliderNum.getValue());
        result = l.calculo();
        JOptionPane.showMessageDialog(null, "Resultado: " + result);
        labelResultado.setText("Ultimo Resultado: " + result);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonEx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEx4ActionPerformed
        x1.setText("70");
        f1.setText("13.56");
        x2.setText("85");
        f2.setText("13.28");
        x3.setText("100");
        f3.setText("12.27");
        x4.setText("0");
        f4.setText("0");
        x5.setText("0");
        f5.setText("0");
        x6.setText("0");
        f6.setText("0");
        x7.setText("0");
        f7.setText("0");
        x8.setText("0");
        f8.setText("0");

        busca.setText("95");

        SliderNum.setValue(3);
    }//GEN-LAST:event_ButtonEx4ActionPerformed

    private void ButtonEx3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEx3bActionPerformed
        x1.setText("80");
        f1.setText("95");
        x2.setText("100");
        f2.setText("112");
        x3.setText("120");
        f3.setText("138");
        x4.setText("0");
        f4.setText("0");
        x5.setText("0");
        f5.setText("0");
        x6.setText("0");
        f6.setText("0");
        x7.setText("0");
        f7.setText("0");
        x8.setText("0");
        f8.setText("0");

        busca.setText("95");

        SliderNum.setValue(3);
    }//GEN-LAST:event_ButtonEx3bActionPerformed

    private void ButtonEx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEx3ActionPerformed
        x1.setText("80");
        f1.setText("95");
        x2.setText("100");
        f2.setText("112");
        x3.setText("0");
        f3.setText("0");
        x4.setText("0");
        f4.setText("0");
        x5.setText("0");
        f5.setText("0");
        x6.setText("0");
        f6.setText("0");
        x7.setText("0");
        f7.setText("0");
        x8.setText("0");
        f8.setText("0");

        busca.setText("95");

        SliderNum.setValue(2);
    }//GEN-LAST:event_ButtonEx3ActionPerformed

    private void ButtonEx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEx2ActionPerformed
        x1.setText("500");
        f1.setText("2.74");
        x2.setText("1000");
        f2.setText("5.48");
        x3.setText("1500");
        f3.setText("7.9");
        x4.setText("2000");
        f4.setText("11");
        x5.setText("2500");
        f5.setText("13.93");
        x6.setText("3000");
        f6.setText("16.43");
        x7.setText("3500");
        f7.setText("20.24");
        x8.setText("4000");
        f8.setText("23.52");

        busca.setText("1730");

        SliderNum.setValue(8);
    }//GEN-LAST:event_ButtonEx2ActionPerformed

    private void SliderNumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderNumStateChanged
        numPontos.setText(SliderNum.getValue() + " pontos.");
    }//GEN-LAST:event_SliderNumStateChanged

    private void ButtonEx4bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEx4bActionPerformed
                x1.setText("55");
        f1.setText("14.08");
        x2.setText("70");
        f2.setText("13.56");
        x3.setText("85");
        f3.setText("13.28");
        x4.setText("100");
        f4.setText("12.27");
        x5.setText("0");
        f5.setText("0");
        x6.setText("0");
        f6.setText("0");
        x7.setText("0");
        f7.setText("0");
        x8.setText("0");
        f8.setText("0");

        busca.setText("80");

        SliderNum.setValue(4);
    }//GEN-LAST:event_ButtonEx4bActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEx2;
    private javax.swing.JButton ButtonEx3;
    private javax.swing.JButton ButtonEx3b;
    private javax.swing.JButton ButtonEx4;
    private javax.swing.JButton ButtonEx4b;
    private javax.swing.JSlider SliderNum;
    private javax.swing.JTextField busca;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JTextField f6;
    private javax.swing.JTextField f7;
    private javax.swing.JTextField f8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelF;
    private javax.swing.JLabel labelPontos;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel numPontos;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField x4;
    private javax.swing.JTextField x5;
    private javax.swing.JTextField x6;
    private javax.swing.JTextField x7;
    private javax.swing.JTextField x8;
    // End of variables declaration//GEN-END:variables
}
