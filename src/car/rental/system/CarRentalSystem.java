/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental.system;

import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class CarRentalSystem {

    /**
     * @param args the command line arguments
     */
    
    static void welcome(){
     // this is to lunch the gui by the splash :-
        welcome welcome = new welcome();
        welcome.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                welcome.jLabel4.setText(i + " %");
                welcome.jProgressBar1.setValue(i);
                if (i == 50) {
                    welcome.jLabel2.setText("LOADING.....");
                }
                if (i == 98) {
                    welcome.jLabel2.setText("CONNECTED SUCCESSFULLY");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new ChooseUser().setVisible(true);
        welcome.dispose();
    }

    public static void main(String[] args) {
       welcome();
    }
    
}
