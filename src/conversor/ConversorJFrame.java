/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nestor
 */
public class ConversorJFrame extends javax.swing.JFrame
{
	private Conversor conversor;
	private List<Conversor> conversores;
	
	
	/**
	 * Creates new form ConversorJFrame
	 */
	public ConversorJFrame()
	{
		initComponents();
		setLocationRelativeTo(null);
		
		conversores = new ArrayList<>();
		conversores.add(new ConversorPulgCent());
		conversores.add(new ConversorMillasKms());
                conversores.add(new ConversorHoraMin());
                conversores.add(new ConversorCelsiusFahren());
                conversores.add(new ConversorKgGramo());
		
		for(Conversor conv : conversores)
			conversorComboBox.addItem(conv.nameA() + " / " + conv.nameB());
		
		conversor = conversores.get(0);
                
		setLabels();
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLabel = new javax.swing.JLabel();
        bTextField = new javax.swing.JTextField();
        aAButton = new javax.swing.JButton();
        aLabel = new javax.swing.JLabel();
        aTextField = new javax.swing.JTextField();
        aBButton = new javax.swing.JButton();
        conversorComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLabel.setText("B");

        bTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTextFieldActionPerformed(evt);
            }
        });

        aAButton.setText("A A");
        aAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aAButtonActionPerformed(evt);
            }
        });

        aLabel.setText("A");

        aTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTextFieldActionPerformed(evt);
            }
        });

        aBButton.setText("A B");
        aBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBButtonActionPerformed(evt);
            }
        });

        conversorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el tipo de conversión:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(bLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(bTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aBButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(aAButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conversorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(conversorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aLabel)
                    .addComponent(aTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aBButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel)
                    .addComponent(bTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aAButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aAButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aAButtonActionPerformed
    {//GEN-HEADEREND:event_aAButtonActionPerformed
		toA();
    }//GEN-LAST:event_aAButtonActionPerformed
	
	
	private void toA()
	{
		String bString = bTextField.getText();
		bString = bString.replace(',', '.');
		double b;
		
		try
		{
			b = Double.valueOf(bString);
		}
		catch(NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(this, "No se pudo convertir: Ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		double a = conversor.toA(b);
		String aString = String.format("%.2f", a);
		aTextField.setText(aString);
	}
	
	
    private void bTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bTextFieldActionPerformed
    {//GEN-HEADEREND:event_bTextFieldActionPerformed
        toA();
    }//GEN-LAST:event_bTextFieldActionPerformed
	
		
	
    private void conversorComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_conversorComboBoxActionPerformed
    {//GEN-HEADEREND:event_conversorComboBoxActionPerformed
        conversor = conversores.get(conversorComboBox.getSelectedIndex());
		
        aTextField.setText(""); //Se blanquean los textfields al momento de la selección
        bTextField.setText("");
	
        setLabels();
    }//GEN-LAST:event_conversorComboBoxActionPerformed

    private void aBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBButtonActionPerformed
            toB();
    }//GEN-LAST:event_aBButtonActionPerformed

    private void aTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTextFieldActionPerformed
            toB();
    }//GEN-LAST:event_aTextFieldActionPerformed
	
        private void toB()
        {
                String aString = aTextField.getText();
                aString = aString.replace(',', '.');
                double a;

                try
                {
                        a = Double.valueOf(aString);

                }
                catch(NumberFormatException ex)
                {
                        JOptionPane.showMessageDialog(this, "No se pudo convertir: Ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                }
                
                double b = conversor.toB(a);
                String bString = String.format("%.2f", b);
                bTextField.setText(bString); 
                 
        }
        
        
	
	private void setLabels()
	{
		aLabel.setText(conversor.nameA());
		bLabel.setText(conversor.nameB());
		aBButton.setText("A " + conversor.nameB());
		aAButton.setText("A " + conversor.nameA());
	}
	
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(ConversorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch(InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(ConversorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch(IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(ConversorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch(javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(ConversorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new ConversorJFrame().setVisible(true);
			}
		});
	}
	
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aAButton;
    private javax.swing.JButton aBButton;
    private javax.swing.JLabel aLabel;
    private javax.swing.JTextField aTextField;
    private javax.swing.JLabel bLabel;
    private javax.swing.JTextField bTextField;
    private javax.swing.JComboBox<String> conversorComboBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
