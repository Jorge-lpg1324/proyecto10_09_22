/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jorge
 */


import javax.swing.JOptionPane;

public class programa_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número correcto: "));
        
        while(numero != 18){
            
            if(numero > 19){
            
            JOptionPane.showMessageDialog(null, "El numero correcto es Menor que: "+numero);
            
           
        }else{
                 JOptionPane.showMessageDialog(null, "El numero correcto es mayor que: "+numero);
                
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        
        
    }
        JOptionPane.showMessageDialog(null, " !Felicidades el numero correcto es: "+numero+" !");
        
        
        
        
        
        
    }
    
}
