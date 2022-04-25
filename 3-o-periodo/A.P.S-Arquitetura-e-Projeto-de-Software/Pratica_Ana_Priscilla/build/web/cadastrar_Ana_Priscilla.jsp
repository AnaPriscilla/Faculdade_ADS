<%-- 
    Document   : cadastrar_Ana_Priscilla
    Created on : 25 de abr. de 2022, 12:08:46
    Author     : anapriscilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Representante</title>
    <link rel="stylesheet" href="css/stylecadastrar.css" type="text/css"/>
</head>
<body>
    <header>
        <nav class="menu-home">
            <a href="index.jsp">Home</a>
        </nav>
    </header>
    <form  method="POST" action="ControllerCadastro">
        <h1>Cadastrar Representante</h1>

        <div>
            <div>
                <label>CPF<span> *</span></label>
            </div>
            <input type="tel" id="cpf" name="cpf"/>
        </div>
       
        <div>
            <label>Nome<span> *</span></label>
            <input type="text" id="nome" name="nome"/>
        </div>

        <div>
            <label>E-MAIL<span> *</span></label>
            <input type="text" id="email" name="email">
        </div>
      
        <div>
            <div>
                <label>Senha<span> *</span></label>
            </div>
            
            <input type="password" id="senha" name="senha">
        </div>
      
        <div>
            <div>
                <label>Repetir Senha<span> *</span></label>
            </div>
            <input type="password" id="repsenha" name="repsenha">
        </div>

        <div class="btSC">
            <button class="salvar" type="submit">Salvar</button>
            <button class="cancelar" type="submit">Cancelar</button>
        </div>
        
        <div class="resultadocadastro">
              <p>Teste:</p>
        <div>
            <div>
                <label>CPF<span> *</span></label>
            </div>
            <input type="tel" id="resultadocpf" name="resultadocpf" value="<c:out value="${resultadocpf}"/>"/>
        </div>
       
        <div>
            <label>Nome<span> *</span></label>
            <input type="text" id="resultadonome" name="resultadonome" value="<c:out value="${resultadonome}"/>"/>
        </div>

        <div>
            <label>E-MAIL<span> *</span></label>
            <input type="text" id="resultadoemail" name="resultadoemail" value="<c:out value="${resultadoemail}"/>">
        </div>
      
        <div>
            <div>
                <label>Senha<span> *</span></label>
            </div>
            
            <input type="password" id="resultadosenha" name="resultadosenha" value="<c:out value="${resultadosenha}"/>">
        </div>
      
        <div>
            <div>
                <label>Repetir Senha<span> *</span></label>
            </div>
            <input type="password" id="resultadorepsenha" name="repsenha" value="<c:out value="${resultadorepsenha}"/>">
        </div>

        </div>
    </form>
</body>
</html>