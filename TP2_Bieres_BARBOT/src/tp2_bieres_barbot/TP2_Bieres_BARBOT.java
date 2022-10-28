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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.nom = "Cuvée des trolls"; uneBiere.degreAlcool = 7.0 ;
        uneBiere.Brasserie = "Dubuisson";
        uneBiere.Ouvert = false;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        autreBiere.nom = "Leffe"; autreBiere.degreAlcool = 6.6;
        autreBiere.Brasserie = "Abbaye de Leffe";
        uneBiere.Ouvert = false;
        uneBiere.lireEtiquette();
        
                
                
             
        
        // TODO code application logic here
    }
    
}
