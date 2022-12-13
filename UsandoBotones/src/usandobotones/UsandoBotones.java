/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usandobotones;

import javax.swing.*;
/**
 *
 * @author luxte
 */
public class UsandoBotones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       JFrame frame = new JFrame("Botones");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Press");
       frame.getContentPane().add(button); 
       frame.setVisible(true);
    }
    
    
}
