
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
        w.setLocation(50,400);
        p = new StandardPen(w);
        s = new Rect(0,0,100,50);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputbox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select a Shape");

        circlebtn.setBackground(new java.awt.Color(255, 51, 51));
        circlebtn.setText("CIRCLE");
        circlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebtnActionPerformed(evt);
            }
        });

        wheelbtn.setBackground(new java.awt.Color(255, 51, 51));
        wheelbtn.setText("WHEEL");
        wheelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelbtnActionPerformed(evt);
            }
        });

        rectbtn.setBackground(new java.awt.Color(255, 51, 51));
        rectbtn.setText("RECTANGLE");
        rectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbtnActionPerformed(evt);
            }
        });

        tribtn.setBackground(new java.awt.Color(255, 51, 51));
        tribtn.setText("TRIANGLE");
        tribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tribtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Options");

        movebtn.setBackground(new java.awt.Color(255, 153, 51));
        movebtn.setText("MOVE");
        movebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movebtnActionPerformed(evt);
            }
        });

        resizebtn.setBackground(new java.awt.Color(255, 153, 51));
        resizebtn.setText("RESIZE");
        resizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizebtnActionPerformed(evt);
            }
        });

        quitbtn.setBackground(new java.awt.Color(255, 153, 51));
        quitbtn.setText("QUIT");
        quitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Shape Data");

        outputbox.setEditable(false);
        outputbox.setColumns(20);
        outputbox.setRows(5);
        jScrollPane1.setViewportView(outputbox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(rectbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)
                                .addGap(145, 145, 145)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(circlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wheelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tribtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(quitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(movebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resizebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectbtn)
                    .addComponent(wheelbtn)
                    .addComponent(circlebtn)
                    .addComponent(tribtn))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(movebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resizebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quitbtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebtnActionPerformed
        s.erase(p);
        s = new Circle(0,0,50);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_circlebtnActionPerformed

    private void wheelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelbtnActionPerformed
        s.erase(p);
        s = new Wheel(0,0,50,6);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_wheelbtnActionPerformed

    private void rectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbtnActionPerformed
        s.erase(p);
        s = new Rect(0,0,100,50);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_rectbtnActionPerformed

    private void tribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tribtnActionPerformed
        s.erase(p);    //x,y,x2,x3, y2, y3
        s = new Triangle(0,0,50,100,100,0);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_tribtnActionPerformed

    private void resizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizebtnActionPerformed
        double x = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter Factor"));
        s.erase(p);
        s.stretchBy(x);
        s.draw(p);
        outputbox.setText(s.toString());
    }//GEN-LAST:event_resizebtnActionPerformed

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitbtnActionPerformed

    private void movebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movebtnActionPerformed
        double x = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new X Location", "0"));
        double y = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new Y Location", "0"));
        s.erase(p);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton movebtn;
    private javax.swing.JTextArea outputbox;
    private javax.swing.JButton quitbtn;
    private javax.swing.JButton rectbtn;
    private javax.swing.JButton resizebtn;
    private javax.swing.JButton tribtn;
    private javax.swing.JButton wheelbtn;
    // End of variables declaration//GEN-END:variables
}
