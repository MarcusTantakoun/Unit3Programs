
package Lesson9.shapesV2;
import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ShapeMaker extends javax.swing.JFrame {
    StandardPen p;
    Shape s;

    public ShapeMaker() {
        initComponents();
        SketchPadWindow w = new SketchPadWindow(400,400);
        w.setLocation(50,275);
        p = new StandardPen(w);
        s = new Circle(0,0,0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        circlebtn = new javax.swing.JButton();
        wheelbtn = new javax.swing.JButton();
        rectbtn = new javax.swing.JButton();
        tribtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        movebtn = new javax.swing.JButton();
        resizebtn = new javax.swing.JButton();
        quitbtn = new javax.swing.JButton();
        outputbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Select a Shape");

        circlebtn.setText("CIRCLE");
        circlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebtnActionPerformed(evt);
            }
        });

        wheelbtn.setText("WHEEL");
        wheelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelbtnActionPerformed(evt);
            }
        });

        rectbtn.setText("RECTANGLE");
        rectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbtnActionPerformed(evt);
            }
        });

        tribtn.setText("TRIANGLE");
        tribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tribtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Options");

        movebtn.setText("MOVE");
        movebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movebtnActionPerformed(evt);
            }
        });

        resizebtn.setText("RESIZE");
        resizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizebtnActionPerformed(evt);
            }
        });

        quitbtn.setText("QUIT");
        quitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbtnActionPerformed(evt);
            }
        });

        outputbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputboxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Shape Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(circlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(movebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wheelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tribtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(outputbox, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(204, 204, 204)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circlebtn)
                    .addComponent(wheelbtn)
                    .addComponent(rectbtn)
                    .addComponent(tribtn))
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(movebtn)
                .addGap(40, 40, 40)
                .addComponent(resizebtn)
                .addGap(41, 41, 41)
                .addComponent(quitbtn)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(outputbox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebtnActionPerformed
        p.erase();
        s = new Circle(0,0,50);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_circlebtnActionPerformed

    private void wheelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelbtnActionPerformed
        p.erase();
        s = new Wheel(0,0,50,6);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_wheelbtnActionPerformed

    private void rectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbtnActionPerformed
        p.erase();
        s = new Rect(0,0,100,50);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_rectbtnActionPerformed

    private void tribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tribtnActionPerformed
        p.erase();
        s = new Triangle(0,0,50);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_tribtnActionPerformed

    private void resizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizebtnActionPerformed
        
    }//GEN-LAST:event_resizebtnActionPerformed

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitbtnActionPerformed

    private void outputboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputboxActionPerformed
        
    }//GEN-LAST:event_outputboxActionPerformed

    private void movebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movebtnActionPerformed
        double x = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new X Location", "0"));
        double y = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new Y Location", "0"));
        p.erase();
        s.move(x, y);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_movebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ShapeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circlebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton movebtn;
    private javax.swing.JTextField outputbox;
    private javax.swing.JButton quitbtn;
    private javax.swing.JButton rectbtn;
    private javax.swing.JButton resizebtn;
    private javax.swing.JButton tribtn;
    private javax.swing.JButton wheelbtn;
    // End of variables declaration//GEN-END:variables
}
