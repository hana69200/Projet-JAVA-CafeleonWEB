<%-- 
    Document   : test
    Created on : 16 janv. 2019, 10:34:20
    Author     : p1702401
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1> <%= request.getAttribute("identifiant") %>, vous êtes surement un reptilien</h1>
        <p><img src="img/connexion.png" alt="Un oeil et un triangle" width="300" height="300"></p>
        <form action="controleur" method="post">
            
            <div class="centre">
                <input type="text" name="identifiant" placeholder="Ex : Roger" size="30" maxlength="10" />
            </div>
            
            <div class="centre">
                <input type="text" name="mdp" placeholder="Ex : Je suis pas un reptilien" size="30" maxlength="10" />
            </div>
            
            <input type="hidden" name="page" value="connexion" />
            
            <div class="centre">
                <input type="submit" value="Valider" />
            </div>
            
        </form>
        <strong> Par contre si c'est encore michel qui a oublié son mot de passe c'est 1234... pas compliqué pourtant !</strong>
    </body>
</html>
