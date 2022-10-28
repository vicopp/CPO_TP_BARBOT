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
        
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        uneBiere.lireEtiquette();
        BouteilleBiere Biere1 = new BouteilleBiere ("heineken", 5.0, "Allemagne");
        BouteilleBiere Biere2 = new BouteilleBiere ("desperados",5.9,"Suisse" );
        BouteilleBiere Biere3 = new BouteilleBiere ("1664", 5.5, "Alsace");       
        Biere2.decapsuler();g
        
             
        
        // TODO code application logic here
    }
    
}
