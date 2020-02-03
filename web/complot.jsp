<%-- 
    Document   : complot
    Created on : 20 janv. 2019, 13:19:22
    Author     : Short
--%>

<%@page import="metier.Weapon"%>
<%@page import="generator.ReptiliansPopulation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LE COMPLOT REPTILIEN</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>
        <h1> Plan de destruction des reptiliens</h1>
        
        <%
            ReptiliansPopulation rp = new ReptiliansPopulation(request.getParameter("pays"));
            Weapon wp = new Weapon(request.getParameter("arme"));
            
            
            out.print("<p>Avant : "+rp.getNbReptilians()+"</p>");
            out.print("<p>Illuminati utilise "+wp.getNom()+"</p>");
            out.print("<p><img src='img/"+wp.getPath()+"'></p>");
            out.print("<p>"+wp.getMessage()+"</p>");
            out.print("<p>Après : "+rp.killReptilians(wp)+"</p>");
            
            if(rp.getNbReptilians() == 0 )
            {
                out.println("<p>It's super effective !</p>");
            }
        %>
        
    </body>
</html>
