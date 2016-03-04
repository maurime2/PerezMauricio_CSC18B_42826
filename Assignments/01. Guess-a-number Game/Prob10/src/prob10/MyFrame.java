
package prob10;


public class MyFrame extends javax.swing.JFrame {

    int gNum = 60;  //To Guess
    int num = 0;    //Number to edit
    
    public MyFrame() {
        initComponents();
        this.setVisible(true);  //Shows Hello World
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gNumGuessLable = new javax.swing.JLabel();
        eButon = new javax.swing.JButton();
        gNumbTextfield = new javax.swing.JTextField();
        highOrLowLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gNumGuessLable.setText("I have a number between 1 and 1000. Can you guess my number?");

        eButon.setText("Enter");

        gNumbTextfield.setText("1");
        gNumbTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gNumbTextfieldActionPerformed(evt);
            }
        });

        highOrLowLable.setText("High or Low");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gNumGuessLable, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gNumbTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eButon)
                    .addComponent(highOrLowLable))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gNumGuessLable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gNumbTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eButon)
                .addGap(29, 29, 29)
                .addComponent(highOrLowLable)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        gNumGuessLable.getAccessibleContext().setAccessibleName("gNumLable");
        gNumGuessLable.getAccessibleContext().setAccessibleDescription("");
        eButon.getAccessibleContext().setAccessibleName("eButon");
        gNumbTextfield.getAccessibleContext().setAccessibleName("gNumbTextfield");
        gNumbTextfield.getAccessibleContext().setAccessibleDescription("");
        highOrLowLable.getAccessibleContext().setAccessibleName("highOrLowLable");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gNumbTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gNumbTextfieldActionPerformed
        // TODO add your handling code here:
                // convert String inputs to int values for use in a calculation
        
        
        String text = gNumbTextfield.getText();
                num = Integer.parseInt(text);
        //Changes Hot or Cold Lable    
                
        if(num<1 || num>10000){
        highOrLowLable.setText("Out of Range");
        }
        else if(num<gNum){
        highOrLowLable.setText("Too Low");
        }
        else if(num==gNum){
        highOrLowLable.setText("Correct!!!");
        }
        else if(num<gNum){
        highOrLowLable.setText("Too High");
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
    private javax.swing.JButton eButon;
    private javax.swing.JLabel gNumGuessLable;
    private javax.swing.JTextField gNumbTextfield;
    private javax.swing.JLabel highOrLowLable;
    // End of variables declaration//GEN-END:variables
}
