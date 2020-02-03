package controleur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.HashText;
import metier.User;
import persistance.modelDAO.UserDAO;

/**
 *
 * @author hanab
 */
public class Controleur extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     * @throws SQLException
     * @throws NoSuchAlgorithmException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, NoSuchAlgorithmException {
        response.setContentType("text/html;charset=UTF-8");
        String page = request.getParameter("page");
        RequestDispatcher rd;
        
        switch(page) {
            case "connexion":
                String id = request.getParameter("identifiant");
                String mdp = request.getParameter("mdp");
                UserDAO userDAO = new UserDAO();
                List<User> users = userDAO.getUsers();
                User user = null;
                for (User u : users) {
                    if (u.getNom().equals(id) && u.getPassword().equals(mdp)) {
                        user = u;
                        break;
                    }
                }
                request.setAttribute("identifiant", id);
                if (user != null) {
                    rd = request.getRequestDispatcher("Accueil.jsp");
                    rd.forward(request, response);
                    break;
                }
                else {
                    rd = request.getRequestDispatcher("test.jsp");
                    rd.forward(request, response);
                }
            case "complot":
                response.addHeader("arme",request.getParameter("arme") );
                response.addHeader("pays",request.getParameter("pays"));
                
                rd = request.getRequestDispatcher("complot.jsp");
                rd.forward(request, response);
                break;
            
            case "triangle":
                rd = request.getRequestDispatcher("triangle.jsp");
                rd.forward(request, response);
                break;
            
            default:
                System.out.println("la page " + page + " n'existe pas dans le 'case'");
                rd = request.getRequestDispatcher("accueil.jsp");
                rd.forward(request, response);
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "Est le controlleur";
    }

}
