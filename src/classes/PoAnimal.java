/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poanimal;

/**
 *
 * @author SAMANTHA
 */
public class PoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chien lechien = new Chien ("Chris", "méchant", "noir",3);
        Chat lechat = new Chat ("Neko","drôle","orange",19);
        
        System.out.println("Ce programme vous montre les caractéristique de mes animaux.");
        System.out.print("\n");
            System.out.println("Le nom de mon chien est "+ lechien.nom + " et il a "+ lechien.age +" ans.");
            System.out.println("Il est plutôt très "+ lechien.caractere +" et est de couleur "+ lechien.couleur +".");
            System.out.print("Son cri est : "+ lechien.getCri()+".");
        System.out.println("\n");
            System.out.println("Le chat s'appelle "+ lechat.nom + " et a "+ lechat.age +" ans.");
            System.out.println("Il est "+ lechat.caractere +" et a pour couleur "+ lechat.couleur +".");
            System.out.print("Son cri est : "+ lechat.getCri()+".");
        System.out.println("\n");
    }
    
}
