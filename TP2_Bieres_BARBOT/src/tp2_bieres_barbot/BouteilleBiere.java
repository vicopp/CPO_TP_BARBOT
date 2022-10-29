/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_barbot;

/**
 *
 * @author victor
 */
public class BouteilleBiere {
    
    
    String nom; //attribution caracteristiques à la varibale 
    double degreAlcool;
    String Brasserie; 
    boolean Ouvert;
 
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + Brasserie ) ;

}
   public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
   nom = unNom;
   degreAlcool = unDegre;
   Brasserie = uneBrasserie;
   Ouvert = false;
} 
   BouteilleBiere uneBiere = new BouteilleBiere("oui", 5, "acees");
   
   
    public void decapsuler() {
        if (Ouvert == false) {
            Ouvert = true;
        }
        else{
            System.out.println("erreur la biere est deja ouverte");
        }
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouvert ? "; 
    if (Ouvert == true ) chaine_a_retourner += "oui" ; 
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
      }


    







