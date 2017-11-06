package poanimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMANTHA
 */
public class Chien extends Animal {
    private String cri;

    public Chien(String nom, String caractere, String couleur, int age) {
        super(nom, caractere, couleur, age);
        cri = "Ouaf Ouaf";
        
    }

    public Chien(String cri, String nom, String caractere, String couleur, int age) {
        super(nom, caractere, couleur, age);
        this.cri = cri;
    }
    
    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }
   
}