/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 * @author victor
 */
public class baton extends Arme {
    
    int age;
    
    public baton (String n, int i , int a) {
        super(n, i);
        if (a>0) {
            age = a;
        } else {
            age = 0;
        }
    }
    
}
