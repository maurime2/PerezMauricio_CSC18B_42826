/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

/**
 *
 * @author rcc
 */
public class FToCPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form FToCPanelForm
     */
    public FToCPanelForm() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fahrenheitLabel = new javax.swing.JLabel();
        fahrenheitTextField = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();
        celsiusLabel = new javax.swing.JLabel();

        fahrenheitLabel.setText("Enter fahrenheit degrees:");

        convertButton.setText("Convert");

        celsiusLabel.setText("Temperature in degrees celsius: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(convertButton)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fahrenheitLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fahrenheitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(celsiusLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fahrenheitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fahrenheitLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertButton)
                .addGap(18, 18, 18)
                .addComponent(celsiusLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celsiusLabel;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel fahrenheitLabel;
    private javax.swing.JTextField fahrenheitTextField;
    // End of variables declaration//GEN-END:variables
}