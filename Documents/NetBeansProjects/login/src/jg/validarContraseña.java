/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jg;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class validarContraseña {
    
    public static void main(String[] args) {
        String pwd1, pwd2;
        Scanner teclado = new Scanner(System.in);
        
        
        do {  
            System.out.println("Introduce ontraseña");
            pwd1 = teclado.nextLine();
            
            System.out.println("Repita contraseña");
            pwd2 = teclado.nextLine();
            
        }while ((pwd1.length()<=5) && (pwd2.length()<=5));
       
        
                
        if( pwd1.equals("12345")== true){
            System.out.println("La contraseña ingresada es igual a la anterior");
         
          }
        if( pwd2.equals("12345")== true){
            System.out.println("Intente una nueva");
            
            System.out.println("Introduce ontraseña");
            pwd1 = teclado.nextLine();
            
            System.out.println("Repita contraseña");
            pwd2 = teclado.nextLine();
          
                        
                
        }
        if( pwd1.equals(pwd2)== true){
            System.out.println("Contraseña ingresada exitosamanete");
          
                       
        }
        if( pwd1.equals(pwd2)== false){
            System.out.println("Contraseña no coincide" + " " + "Vuelva a intentar");
          
                
        }
        
     
        }
            
        }
            
     








    

