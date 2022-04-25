<%-- 
    Document   : login_Ana_Priscilla
    Created on : 25 de abr. de 2022, 12:40:00
    Author     : anapriscilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/stylelogin.css" type="text/css"/>
    </head>
    <body>
        <header>
            <nav class="menu-home">
                <a href="index.jsp">Home</a>
            </nav>
        </header>
         <section class="login">
            <h1>Login</h1>
            <form method="POST" action="ControllerLogin">
                <input id="usuario" type="text" name="usuario" placeholder="Usuário" required="required" />
                <input id="senha" type="password" name="senha" placeholder="Senha" required="required" />
                <button type="submit" class="btn-login">Acessar</button>
                
                <!--Servlet-->
                <div class="resultadologin">
                    <p>Teste:</p>
                    <input id="resultadousuario" type="text" name="resultadousuario"  value="<c:out value="${resultadousuario}"/>"/>
                    <input id="resultadosenha" type="password" name="resultadosenha"  value="<c:out value="${resultadosenha}"/>"/>
                </div>
                
                
            </form>
        </section>
    </body>
</html>
