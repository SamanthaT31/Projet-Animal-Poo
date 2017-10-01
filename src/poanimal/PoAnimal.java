/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poanimal;
import java.util.Scanner;

/**
 *
 * @author SAMANTHA
 */
public class PoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ce programme va vous montrer les caractéristiques de mes animaux. Saisissez soit Chat ou Chien : "); 
        
        int restart = 0;
        while ( restart == 0) {
        
        String choix = "";
        Scanner sc = new Scanner(System.in);
        
           choix = sc.nextLine();
            if (null != choix) switch (choix) {
            case "Chien":
                Chien lechien = new Chien ("Chris", "méchant", "noir",3);
                System.out.println("\n");
                System.out.println("Le nom de mon chien est "+ lechien.nom + " et il a "+ lechien.age +" ans.");
                System.out.println("Il est plutôt très "+ lechien.caractere +" et est de couleur "+ lechien.couleur +".");
                System.out.print("Son cri est d'aboyer : "+ lechien.getCri()+".");
                System.out.println("\n");
                break;
            case "Chat":
                Chat lechat = new Chat ("Neko","drôle","orange",19);
                System.out.println("\n");
                System.out.println("Le chat s'appelle "+ lechat.nom + " et a "+ lechat.age +" ans.");
                System.out.println("Il est "+ lechat.caractere +" et a pour couleur "+ lechat.couleur +".");
                System.out.print("Son cri est de miauler : "+ lechat.getCri()+".");
                System.out.println("\n");
                break;
            default:
                System.out.print("L'animal est inconnu.");
                break;
        }
            
        String resaisir = "";
            while ( !"O".equals(resaisir)) {
                System.out.println("Voulez-vous en savoir plus ? (O/N)");
                resaisir = sc.nextLine();
                    
                    if ("O".equals(resaisir) ) {
                        System.out.println("Saisissez donc l'autre animal.");
                    }
                    else if ("N".equals(resaisir)){
                        System.out.println("Merci, au revoir !");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Veuillez choisir O ou N");
                    }
            }
        }    
    }
    
}
