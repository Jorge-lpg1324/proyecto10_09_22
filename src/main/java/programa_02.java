/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jorge
 */

import javax.swing.JOptionPane;

public class programa_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero != 0){
            
            if(numero > 0){
            
            JOptionPane.showMessageDialog(null, "El numero es positivo");
            
           
        }else{
                 JOptionPane.showMessageDialog(null, "El numero es negativo");
                
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        
        
    }
        JOptionPane.showMessageDialog(null, "Fin de los intentos");
    

    }
}

