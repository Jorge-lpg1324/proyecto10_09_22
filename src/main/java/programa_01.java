/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jorge
 */
import javax.swing.JOptionPane;

public class programa_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero >= 0){
            
            cuadrado = (int)Math.pow(numero,2);
            
            JOptionPane.showMessageDialog(null, "El numero "+numero+ " elevado al cuadrado es igual a: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); 
        }
        
       
    }
    
}
