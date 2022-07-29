<%--
  Created by IntelliJ IDEA.
  User: Thomas Caron
  Date: 29/07/2022
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<html>
<head>
    <title>Biblioteca da Falca</title>
</head>
<body>
<h1>Lista de livros cadastrados</h1>
<h3>Livro  de id: ${idLivroSalvo} , cadastrado com sucesso!</h3>

<table border="solid">
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Autor</th>
    </tr>
    <c:forEach var="livro" items="${livrosSalvos}" varStatus="id">
        <tr>
            <td>${id.count}</td>
            <td>${livrosSalvos.nome}</td>
            <td>${livrosSalvos.autor}</td>
        </tr>
    </c:forEach>
</table>
<a href="cadastro-cliente.jsp">Cadastre um novo Cliente</a>
</body>
</html>
