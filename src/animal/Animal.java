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
public class Animal {

        protected String nom;
        protected String caractere;
        protected String couleur;
        protected int age;
        protected String cri;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }   
    
public static void main(String[] args) {
    
    Animal leChat = new Animal();
        
      System.out.print("Je vais vous présenter les caractéristiques de mes animaux.");
      System.out.println("\n");
      
        System.out.println("Le nom de votre chat est "+ lenom. ". Son caractère est "+".");
        System.out.println("Sa couleur est "+" et il a "+" ans.");
        System.out.println("Il aime miauler "+ " !");
        
      System.out.print("\n");
        System.out.println("Ensuite, le chien s'apelle" +". Il est plutôt "+".");
        System.out.println("Sa couleur est "+" et il a "+" ans.");
        System.out.println("Il aboie de façon "+"!");
    }

}