/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jorge
 */

import javax.swing.JOptionPane;

public class programa_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero=0,suma=0;
        
       
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            suma = suma+numero;
        
        }
        while(numero!= 0);
            
            
            JOptionPane.showMessageDialog(null, "El total de la suma es: "+suma);
            
           
            
          
        
        
    }
 
        
        
        
    }
    
}
