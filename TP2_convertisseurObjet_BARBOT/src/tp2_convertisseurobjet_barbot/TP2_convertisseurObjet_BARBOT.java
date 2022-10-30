/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_barbot;

/**
 *
 * @author victor
 */
public class TP2_convertisseurObjet_BARBOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double res;
        Convertisseur monconvertisseur = new Convertisseur();
        
          Scanner sc = new Scanner (System.in); // creation scanner pour demander a l'utilisateur quel conversion effectuer
       
        System.out.println("Veuillez choisir une conversion 1:(Celcius vers Kelvin) 2:(Kelvin vers Celcius) 3:(Farenheit vers Celcius) 4:(Celcius vers Farenheit) 5:(Kelvin vers Farenheit) 6:(Farenheit vers Kelvin)");

        
        
        int a = sc.nextInt();
    if (a==1){
           System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
        res=monconvertisseur.CelciusVersKelvin(a);
                System.out.println(res);}
                else if (a==2){
                    System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=monconvertisseur.KelvinVersCelcius(b);
                                System.out.println(res);}
                else if (a==3){
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=monconvertisseur.FarenheitVersCelcius(b);
                                                        System.out.println(res);}
                else if (a==4){
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=monconvertisseur.CelciusVersFarenheit(b);
                                                        System.out.println(res);}
                else if (a==5){
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=monconvertisseur.CelciusVersFarenheit(b);
                                                        System.out.println(res);}
                else {
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=monconvertisseur.CelciusVersFarenheit(b);
                                                        System.out.println(res);}








}
   
                       

                       
                        }
   
   
    
        
    
     
        
        
     


    
