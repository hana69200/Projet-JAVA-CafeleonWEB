/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Short
 */
public class Weapon {
    private String nom;
    private int puissance;
    private String message;
    private String path;

    /**
     *
     * @param nom
     */
    public Weapon(String nom)
    {
        this.nom = nom;
        switch(nom)
        {
            case "Le Canard Jaune" :this.puissance = 100000;message="Coin.";path= nom+".jpg"; break;
            default:message="Je sais pas ce que c'est mais ça a intéret à être efficasse! ";break;
        }
    }

    /**
     *
     * @return
     */
    public int getPuissance()
    {
        return puissance;
    }

    /**
     *
     * @return
     */
    public String getNom()
    {
        return nom;
    }

    /**
     *
     * @return
     */
    public String getPath()
    {
        return path;
    }

    /**
     *
     * @return
     */
    public String getMessage()
    {
        return message;
    }
}
