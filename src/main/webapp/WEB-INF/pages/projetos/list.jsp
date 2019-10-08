<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />" >
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <div class="container" >
	
	<h1>Informações de Projetos</h1>
	<h10><a href="<c:url value="/projetos/form" />"  >Novo Projeto</a></h10>
	
	<table class="table" >
	   <thead class="table-dark">
		<tr>
			<th>Nome</th>
			<th>Tipo</th>
			<th>Gerente</th>
			<th>Valor</th>
			<th>Margem</th>
			<th>Ações</th>
			
		</tr>
	<thead>
	<tbody>
		<c:forEach var="projeto" items="${listaProjetos}" >
			<tr>
				<td>${projeto.nomeProjeto}</td>
				<td>${projeto.tipo}</td>
				<td>${projeto.gerenteProjeto}</td>
				<td>${projeto.valor}</td>
				<td>${projeto.margemLucro}</td>
	<td>
	

	<a href="<c:url value="/projetos/edit/${projeto.id}" />" 
	class="btn btn-primary" href="#" role="button">Editar</a>
	
	
	
	<a href="<c:url value="/projetos/deletar/${projeto.id}" />" 
	class="btn btn-danger" href="#" role="button">Excluir</a>
	
	
	</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>