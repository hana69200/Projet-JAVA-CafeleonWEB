package persistance;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import org.mariadb.jdbc.MariaDbDataSource;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author hanab
 */
public class Connexion extends OracleDataSource {
    
    private static Connexion ods;

    public static DataSource getDataSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connexion() throws SQLException{
    }

    /**
     *
     * @return
     */
 public static Connexion getOracleDataSourceDAO(){
       try{
           ods = new Connexion();
           ods.setDriverType("thin");
           ods.setPortNumber(1521);
           ods.setServiceName("orcl.univ-lyon1.fr");
           ods.setUser("p1804713");
           ods.setPassword("367876");
           ods.setServerName("iutdoua-oracle.univ-lyon1.fr");
           
       }
       catch(SQLException e){
           
       }
       finally{
           
       }
       return ods;
   } 

}
