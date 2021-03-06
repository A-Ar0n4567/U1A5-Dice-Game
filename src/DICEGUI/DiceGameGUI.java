/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DICEGUI;

/**
 *
 * @author aamir7110
 */
public class DiceGameGUI extends javax.swing.JFrame {
        int guess;
        int correct = 0;
        int incorrect = 0;
        int diceRoll;
        int totalRolls = 0;
    /**
     * Creates new form DiceGameGUI
     */
    public DiceGameGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DiceTitle = new javax.swing.JLabel();
        InstructionLabel = new javax.swing.JLabel();
        GuessLabel = new javax.swing.JLabel();
        DiceRollLabel = new javax.swing.JLabel();
        TotalRollsLabel = new javax.swing.JLabel();
        CorrectRollsLabel = new javax.swing.JLabel();
        IncorrectGuessLabel = new javax.swing.JLabel();
        PercentGuessLabel = new javax.swing.JLabel();
        Correctlabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        IncorrectLabel = new javax.swing.JLabel();
        PercentLabel = new javax.swing.JLabel();
        DiceNumber = new javax.swing.JLabel();
        GuessTextField = new javax.swing.JTextField();
        RollButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DiceTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DiceTitle.setText("Dice Guessing Game");

        InstructionLabel.setText("Enter In A Number From 1 To 6 And Click The Roll The Dice Button");

        GuessLabel.setText("Your Guess");

        DiceRollLabel.setText("Dice Roll");

        TotalRollsLabel.setText("Total Number Of Rolls:");

        CorrectRollsLabel.setText("Correct Guesses:");

        IncorrectGuessLabel.setText("Incorrect Guesses:");

        PercentGuessLabel.setText("Percentage Of Correct Guesses:");

        Correctlabel.setText("0");

        TotalLabel.setText("0");

        IncorrectLabel.setText("0");

        PercentLabel.setText("0");

        DiceNumber.setText("0");

        RollButton.setText("Roll The Dice");
        RollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(DiceTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PercentGuessLabel)
                                    .addComponent(TotalRollsLabel)
                                    .addComponent(CorrectRollsLabel)
                                    .addComponent(IncorrectGuessLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Correctlabel)
                                    .addComponent(TotalLabel)
                                    .addComponent(IncorrectLabel)
                                    .addComponent(PercentLabel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(RollButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(GuessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DiceNumber))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(GuessLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DiceRollLabel))
                            .addComponent(InstructionLabel, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DiceTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InstructionLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuessLabel)
                            .addComponent(DiceRollLabel)))
                    .addComponent(RollButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiceNumber)
                    .addComponent(GuessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorrectRollsLabel)
                    .addComponent(Correctlabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalRollsLabel)
                    .addComponent(TotalLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncorrectGuessLabel)
                    .addComponent(IncorrectLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PercentGuessLabel)
                    .addComponent(PercentLabel))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        double percent;
        
        guess = Integer.parseInt(GuessTextField.getText());
        
        diceRoll = (int)Math.round(Math.random()*5+1);
        DiceNumber.setText(String.valueOf(diceRoll));
        
        totalRolls = totalRolls + 1;
        
        if(diceRoll == guess){
            correct = correct+1;
        }else{
            incorrect = incorrect + 1;
        }
        
        percent = ((double)correct/(double)totalRolls)*100;
        
        percent = percent*100;
        percent = Math.round(percent);
        percent = percent/100;
        
        Correctlabel.setText(String.valueOf(correct));
        IncorrectLabel.setText(String.valueOf(incorrect));
        PercentLabel.setText(String.valueOf(percent));
        TotalLabel.setText(String.valueOf(totalRolls));
        
        
    }//GEN-LAST:event_RollButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorrectRollsLabel;
    private javax.swing.JLabel Correctlabel;
    private javax.swing.JLabel DiceNumber;
    private javax.swing.JLabel DiceRollLabel;
    private javax.swing.JLabel DiceTitle;
    private javax.swing.JLabel GuessLabel;
    private javax.swing.JTextField GuessTextField;
    private javax.swing.JLabel IncorrectGuessLabel;
    private javax.swing.JLabel IncorrectLabel;
    private javax.swing.JLabel InstructionLabel;
    private javax.swing.JLabel PercentGuessLabel;
    private javax.swing.JLabel PercentLabel;
    private javax.swing.JButton RollButton;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel TotalRollsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
