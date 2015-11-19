package bol10_1;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author balvarezescudero
 */
public class Juego {

    public void pregunta() {
        int numcorrecto = 0;
        do {
            numcorrecto = Integer.parseInt(JOptionPane.showInputDialog("Número a adiviñar:"));
        } while (numcorrecto < 1 || numcorrecto > 50);

        int x = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos ?  "));

        for (int i = 0; i < x; i++) {
            int numadiv = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero :"));

            if (numadiv < numcorrecto) {
                JOptionPane.showMessageDialog(null, "O numero a adiviñar é maior ");
            } else if (numadiv > numcorrecto) {
                JOptionPane.showMessageDialog(null, "O numero a adivinar é menor ");
            } else {

                JOptionPane.showMessageDialog(null, "Acertache putas!!!!!");
                break; 
               
            }
             

        }
    }
   
}
