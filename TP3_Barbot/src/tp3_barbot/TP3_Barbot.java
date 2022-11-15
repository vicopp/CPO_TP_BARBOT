/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_barbot;

import armes.*;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class TP3_Barbot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Arme m = new Arme ("arme standard", 4);
    
    
    Epée ex = new Epée ("excalibur", 7, 5);
    Epée dur = new Epée ("durandal", 4, 7);
    baton charme = new baton ("charme", 4, 5);
    baton chene = new baton ("chene", 5, 6);
    
    ArrayList<Arme> Tab = new ArrayList<Arme>(); 
    Tab.add(ex);
    Tab.add(dur);
    Tab.add(charme);
    Tab.add(chene);
    
    System.out.println(Tab); 
    
    
   Magicien Gandalf = new Magicien ("gandalf", 65, true);
   Magicien Garcimore = new Magicien ("garcimore", 44, false);
   Guerrier Conan = new Guerrier ("conan", 78, false);
   Guerrier Lannister = new Guerrier ("Lannister", 45, true);
   
   
   ArrayList<Personnages> TabPers = new ArrayList<Personnages>();
   TabPers.add(Gandalf);
   TabPers.add(Garcimore);
   TabPers.add(Conan);
   TabPers.add(Lannister);
   
   System.out.println(TabPers);
    
    
    
    
    
    }

    public TP3_Barbot() {
    }
    
}
