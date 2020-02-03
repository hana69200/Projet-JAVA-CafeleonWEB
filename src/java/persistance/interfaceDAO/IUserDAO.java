package persistance.interfaceDAO;

import java.util.List;
import metier.User;

/**
 *
 * @author hanab
 */
public interface IUserDAO {
    
    /**
     *
     * @return
     */
    public List<User> getUsers();
    
}
