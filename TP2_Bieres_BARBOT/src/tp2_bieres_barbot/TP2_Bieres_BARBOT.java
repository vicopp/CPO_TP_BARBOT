/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_barbot;

/**
 *
 * @author victor
 */
public class TP2_Bieres_BARBOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls"; uneBiere.degreAlcool = 7.0 ;
        uneBiere.Brasserie = "Dubuisson";
        uneBiere.Ouvert = false;
        uneBiere.lireEtiquette();
                
                
             
        
        // TODO code application logic here
    }
    
}
