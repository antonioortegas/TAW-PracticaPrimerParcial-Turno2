<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="es.taw.starwars.entity.FraseCelebre" %>
<%@ page import="es.taw.starwars.entity.Pelicula" %>
<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 14/04/2023
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>FraseCelebre</h1>
<%--@elvariable id="pelicula" type=""--%>
<form:form action="/guardar" modelAttribute="pelicula" method="post">
  <form:hidden path="peliculaId"/>
  Nombre:<form:input path="titulo" size="30" maxlength="50" /><br/>
  Ano:<form:input path="anyo" size="30" maxlength="50" /><br/>
  Texto de Apertura:<br/><form:textarea path="textoApertura" cssStyle="height: 300; width: 300"/><br/>
  <form:button>Guardar</form:button>
  <form:select multiple="true" path="personajeList" items="${personajes}" itemLabel="nombre" cssStyle="width:auto; height: 300"/><br/>
</form:form>


</body>
</html>