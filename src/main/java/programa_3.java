/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jorge
 */


import javax.swing.JOptionPane;

public class programa_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero != 0){
            
            if(numero % 2 == 0){
            
            JOptionPane.showMessageDialog(null, "El numero es par");
            
           
        }else{
                 JOptionPane.showMessageDialog(null, "El numero es impar");
                
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        
        
    }
        JOptionPane.showMessageDialog(null, "Fin de los intentos");
        
        
        
        
        
        
    }
    
}
