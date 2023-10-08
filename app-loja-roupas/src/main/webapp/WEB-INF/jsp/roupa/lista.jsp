<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>AppLoja</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
	  <h3>Listagem de Roupas:</h3>
	  <h4><a href="/roupa/cadastro">Nova Roupa</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>Código</th>
	        <th>Tipo</th>
	        <th>Cor</th>
	        <th>Tamanho</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="b" items="${listaAcessorio}">
		      <tr>
		        <td>${b.id}</td>
		        <td>${b.nome}</td>
		        <td>${b.valor}</td>
		        <td>${b.codigo}</td>
		        <td>${b.tipo}</td>
		        <td>${b.cor}</td>
		        <td>${b.tamanho}</td>
		        <td><a href="/acessorio/${b.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>