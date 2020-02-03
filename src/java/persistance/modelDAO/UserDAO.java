package persistance.modelDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.User;
import persistance.DAO;
import persistance.interfaceDAO.IUserDAO;

/**
 *
 * @author hanab
 */
public class UserDAO extends DAO implements IUserDAO {
    
    /**
     *
     * @throws SQLException
     */
    public UserDAO() throws SQLException {
        super();
    }

    /**
     *
     * @return
     */
    @Override
    public List<User> getUsers() {
        ResultSet rset;
        Statement stmt;
        List<User> users = null;
        String query = "SELECT * FROM UserJava";
        try {
            stmt = connexionBD.createStatement();
            rset = stmt.executeQuery(query);
            users = new ArrayList<>();
            while (rset.next()) {
                users.add(new User(rset.getString(2), rset.getString(3)));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return users;
    }
    
}
