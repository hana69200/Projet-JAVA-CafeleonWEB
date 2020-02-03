/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import metier.Weapon;

/**
 *
 * @author Short
 */
public class ReptiliansPopulation {
    private int nbReptilians;
    private String message;

    /**
     *
     * @param pays
     */
    public ReptiliansPopulation(String pays)
    {
        System.out.println(pays);
        switch(pays)
        {   
            case "Europe": 
                nbReptilians = 666; 
                message ="waw"; 
                break;
                
            case "Ping":  
                nbReptilians = 51; 
                message ="Principalement des Lolis ..."; 
                break;
            case "Amérique Sud":
                nbReptilians = 5424120; 
                message ="Ils aiment le sables, vraiment beaucoup"; 
                break;
            case "'Murica (fuck yeah)":
                nbReptilians = 510; 
                message ="Principalement des politiques, des chefs d'entreprises étrangement.. Pas facile à atteindre !"; 
                break;
            case "Internet":
                nbReptilians = 0; 
                message ="Oh... des licornes, bien sûr"; 
                break;
            case "Bordure extérieur":
                nbReptilians = -1; 
                message ="Ils sont dans la terre creuse... crétin"; 
                break;
            default:
                nbReptilians = 0; 
                message ="Serrieux ?! ça existe ce truc ?"; 
                break;
        }
    }
    
    /**
     *
     * @return
     */
    public int getNbReptilians() {return nbReptilians;}

    /**
     *
     * @param weapon
     * @return
     */
    public int killReptilians(Weapon weapon)
    {
        nbReptilians -= weapon.getPuissance();
        if(nbReptilians < 0)
        {
            nbReptilians = 0;
        }
        return nbReptilians;
    }
    
}
