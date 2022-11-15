package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victor
 */
public class Magicien extends Personnages {
    boolean c;
    
    
    public Magicien(String n, int i, boolean confirme) {
        super(n, i);
        c=confirme;
    }

    public void setC(boolean c) {
        this.c = c;      
    }
   
    
    
    
}
