/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

import java.util.Scanner;

/**
 *
 * @author PC-
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char est;
        string ERW;
        Scanner tec = new Scanner(System.in);
        
        
        System.out.println("Cuantos Estados?");
        int estados=tec.nextInt();
        char[]SS1=new char[estados+1]; 

        
        for(int i=1;i<=estados;i++){
        System.out.println("Estado "+i);
        est=tec.next().charAt(0);
        SS1[i]=est;

        }
        System.out.println("----------");
        for(int i=1;i<=estados;i++){
            System.out.print(SS1[i]);   
        }
        System.out.println(" ");
        
 
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
