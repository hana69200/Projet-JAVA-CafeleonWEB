package metier;

/**
 *
 * @author hanab
 */
public class User {
    
    private String nom;
    private String password;
    
    /**
     *
     * @param newNom
     * @param newPassword
     */
    public User(String newNom, String newPassword) {
        this.nom = newNom;
        this.password = newPassword;
    }
    
    /**
     *
     * @return
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }
    
}
