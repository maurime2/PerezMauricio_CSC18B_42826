
package Guess_A_Number;


public class MyFrame extends javax.swing.JFrame {

    int gNum = 60;  //To Guess
    int num = 0;    //Number to edit
    
    public MyFrame() {
        initComponents();
        this.setVisible(true);  //Need this to display window
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gNumGuessLable = new javax.swing.JLabel();
        gNumbTextfield = new javax.swing.JTextField();
        highOrLowLable = new javax.swing.JLabel();
        colorLable = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gNumGuessLable.setText("I have a number between 1 and 1000. Can you guess my number?");

        gNumbTextfield.setText("1");
        gNumbTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gNumbTextfieldActionPerformed(evt);
            }
        });

        highOrLowLable.setText("High or Low");

        colorLable.setBackground(new java.awt.Color(102, 255, 51));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gNumGuessLable, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gNumbTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(highOrLowLable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorLable)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gNumGuessLable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gNumbTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(highOrLowLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLable, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        gNumGuessLable.getAccessibleContext().setAccessibleName("gNumLable");
        gNumGuessLable.getAccessibleContext().setAccessibleDescription("");
        gNumbTextfield.getAccessibleContext().setAccessibleName("gNumbTextfield");
        gNumbTextfield.getAccessibleContext().setAccessibleDescription("");
        highOrLowLable.getAccessibleContext().setAccessibleName("highOrLowLable");
        colorLable.getAccessibleContext().setAccessibleName("colorLable");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gNumbTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gNumbTextfieldActionPerformed
        
        //Convert Strings to Ints
        String text = gNumbTextfield.getText();
                //God Mode                            //GOD MODE DOSE NOT WORK
                if(text == "123456"){                //Wanted to display number
                    highOrLowLable.setText(Integer.toString(gNum));
                }
                else {
                    num = Integer.parseInt(text);
                }
                
        //Changes Hot or Cold Lable
        if(text == "123456"){              //This Should have displayed god mode
            highOrLowLable.setText(Integer.toString(gNum));
        }
        else if(num<1 || num>1000){        //Out of range
        highOrLowLable.setText("Out of Range");
        colorLable.setBackground(new java.awt.Color(0, 0, 0));
        }
        else if(num<gNum){                //Number is Less than
        highOrLowLable.setText("Too Low");
        colorLable.setBackground(new java.awt.Color(0, 0, 255));
        }
        else if(num==gNum){               //Number is gNum
        highOrLowLable.setText("Correct!!!");
                colorLable.setBackground(new java.awt.Color(0, 255, 0));
        }
        else if(num>gNum){                //Number is greater than gNum
        highOrLowLable.setText("Too High");
        colorLable.setBackground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_gNumbTextfieldActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField colorLable;
    private javax.swing.JLabel gNumGuessLable;
    private javax.swing.JTextField gNumbTextfield;
    private javax.swing.JLabel highOrLowLable;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables
}
