/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author SAMANTHA
 */
public class Chat extends Animal {

public Chat(String lenom, String lecaractere, String lacouleur, int llage) {
        
        Animal leChat = new Animal();
            
            lenom = "Neko";
            this.nom = lenom;
            lecaractere = "affectueux";
            this.caractere = lecaractere;
            lacouleur = "orange" ;
            this.couleur = lacouleur;
            llage = 5 ;
            this.age = llage;
            
        leChat.setCri("Miaoou");
        
    }

}