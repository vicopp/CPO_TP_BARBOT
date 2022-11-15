/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victor
 */
public class Personnages {
    String nom; 
    private int niveauDeVie;
    
    public Personnages(String n, int i) {
        nom = n;
        if (i>0) {
            niveauDeVie = i;
        } else {
            niveauDeVie = 1;
        }
        if (i>100) {
            niveauDeVie = 100;
        }    
    } 
}        
    

