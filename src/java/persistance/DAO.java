package persistance;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hanab
 */
public class DAO {
    
    /**
     *
     */
    protected static Connection connexionBD;
    
    /**
     *
     * @throws SQLException
     */
    public DAO() throws SQLException {

    // Connexion à la base de données
    Connexion dataSourceDAO = Connexion.getOracleDataSourceDAO();
    DAO.connexionBD = dataSourceDAO.getConnection();
        
    }
    
    /**
     *
     * @return
     */
    public Connection connectTestDAO() {
        return connexionBD;
    }
    
}
