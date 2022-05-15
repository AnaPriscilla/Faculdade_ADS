<%-- 
    Document   : index
    Created on : 15 de mai. de 2022, 00:09:43
    Author     : anapriscilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,500;0,700;0,800;1,400&family=Roboto:wght@300;400;500;700;900&display=swap" rel="stylesheet">
    </head>
    <body>
        <h1>Projeto Web com Banco de Dados</h1>
        <form method="POST" action="Controller">
                <div class="linha1">
                    <label id="lblId" name="lblCodigo">Id: </label>
                    <input type="text" id="txtId" name="txtId" value="<c:out value="${id}"/>"/>
                    <label id="lblDescricao" name="lblDescricao">Descrição: </label>
                    <input type="text" id="txtDescricao" name="txtDescricao" value="<c:out value="${descricao}"/>"/>
                </div>
            
                <div class="linha2">
                    <label id="lblCpf" name="lblCpf">CPF: </label>
                    <input type="text" id="txtCpf" name="txtCpf" value="<c:out value="${cpf}"/>"/>
                    <label id="lblEmail" name="lblEmail">E-mail: </label>
                    <input type="text" id="txtEmail" name="txtEmail" value="<c:out value="${email}"/>"/>
                    <label id="lblDatanascimento" name="lblDatanascimento">Data de Nascimento: </label>
                    <input type="text" id="txtDatanascimento" name="txtDatanascimento" value="<c:out value="${datanascimento}"/>"/>
                </div>
                
                <div class="botoes"> 
                    <button name="botao" value="i">Inserir</button>
                    <button name="botao" value="a">Alterar</button>
                    <button name="botao" value="r">Remover</button>
                    <button name="botao" value="c">Consultar</button>
                </div>
                <div>
                    <table>
                        <tr><th>Id</th><th>Descricao</th><th>CPF</th><th>E-mail</th><th>Data de Nascimento</th></tr>
                        <c:forEach items="${lista}" var="linha">
                            <tr>
                                <td class="id"><c:out value="${linha.id}"/></td>
                                <td><c:out value="${linha.descricao}"/></td>
                                <td><c:out value="${linha.cpf}"/></td>
                                <td><c:out value="${linha.email}"/></td>
                                <td><c:out value="${linha.datanascimento}"/></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
        </form>
    </body>
</html>
