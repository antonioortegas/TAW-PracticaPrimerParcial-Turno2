<%@ page import="es.taw.starwars.entity.FraseCelebre" %>
<%@ page import="es.taw.starwars.entity.FraseCelebre" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 12/04/2023
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<FraseCelebre> lista = (List<FraseCelebre>) request.getAttribute("frases");
%>

<html>
<head>
    <title>Frases</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Personaje</th>
        <th>Frase</th>
        <th>Pelicula</th>
    </tr>
    <%
        for (FraseCelebre fraseCelebre: lista){
    %>
        <tr>
            <td><%= fraseCelebre.getPersonaje().getNombre()%></td>
            <td><%= fraseCelebre.getFrase()%></td>
            <td><%= fraseCelebre.getPelicula().getTitulo()%></td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
