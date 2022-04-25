<%-- 
    Document   : index
    Created on : 25 de abr. de 2022, 12:06:44
    Author     : anapriscilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HomePage</title>
    <link rel="stylesheet" href="css/stylehome.css" type="text/css"/>
</head>
<body>
	
<header class="navbar">
    <div class="logo">
	<h1>HomePage</h1>
    </div>
    <nav class="menu">
        <ul>
            <li><a href="login_Ana_Priscilla.jsp">login</a></li>
            <li><a href="cadastrar_Ana_Priscilla.jsp">cadastrar</a></li>
        </ul>
    </nav>
</header>
	
<section class="content">
    
        <img src="css/img/banner.png" alt="banner">
    
	<div class="content-text">
		<h3>Sobre:</h3>
                <hr>
		<p>
			Praticando JSP e Servlet. O JSP conhecido como Java Server Pages, foi criado, para contornar
			algumas limitações no desenvolvimento com Servlets. 
		</p>
		<p>
			Servlets são classes Java instaladas junto
			a um servidor, que implemente um Servlet Container, ou seja, servidor que permita a execução 
			de Servlets (Servidor Aplicações Java), tratando requisições recebidas de clientes. 
		</p>
	</div>
	
</section>
<footer class="copyright">
	<p>
		Desenvolvido em 2022 durante o 3º período -  
		Arquitetura e Projeto de Software - FATESG-GO | 
		por <a target=_blank href="https://github.com/AnaPriscilla">Ana Priscilla Furtado.</a>
	</p>
</footer>
    
    
</body>
</html>
