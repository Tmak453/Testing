/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author HOMEPC
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "tyler";
        
        System.out.println("Before: " + name);
        for(int i = 4; i < 0; i--) {
            name = name + name.charAt(i);
        }
        
        System.out.println("After: " + name);
    }
    
}
