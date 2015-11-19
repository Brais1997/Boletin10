/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author balvarezescudero
 */
public class Juego {

    public void pregunta() {
        int numcorrecto = 0;
        int acertache = 0;//non acertou

        int x = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos ?  "));

        numcorrecto = (int) (Math.random() * 49 + 1);

        for (int i = 0; i < x; i++) {
            int numadiv = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero :"));
            int diferencia = Math.abs(numcorrecto - numadiv);
            if (diferencia > 20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe ");
            } else if (diferencia >= 10) {
                JOptionPane.showMessageDialog(null, "Lonxe ");
            } else if (diferencia > 5) {
                JOptionPane.showMessageDialog(null, "Preto");
            } else {
                JOptionPane.showMessageDialog(null, "Acertache!!");
                acertache = 1;
                break;
            }

        }
        if (acertache == 0) {
            JOptionPane.showMessageDialog(null, "Non acertache");
        }
    }
}
