<%--
  Created by IntelliJ IDEA.
  User: Thomas Caron
  Date: 29/07/2022
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Livro</title>
</head>
<body>
<h1>Cadastro de livros</h1>
<fieldset>
    <legend>Dados basicos</legend>
    <form action="livro-servlet" method="post">
        <div>
            <label for="idNome">Nome:</label>
            <input type="text" id="idNome" name="nome">
        </div>
        <div>
            <label for="idautor">CPF:</label>
            <input type="text" id="idautor" name="autor">
        </div>
    </form>
</fieldset>

</body>
</html>
