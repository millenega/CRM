<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
			href="<c:url value="/resources/css/main.css" />" >
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Alterar Informações de Projeto</h2>


</div>

 	
   <form action="<c:url value="/projetos/update" />" method="post">
   
      <input type="hidden" value="${projeto.id}" name="id" > 
      <label for="nomeProjeto">Nome</label>
       <br/>
      <input type="text" value="${projeto.nomeProjeto}" name="nomeProjeto" id="nomeProjeto" size="35">
      <br/>
      
      
      <input type="hidden" value="${projeto.id}" name="id" > 
      <label for="tipo">Tipo</label>
       <br/>
     <input type="text" value="${projeto.tipo}" name="tipo" id="tipo" size="35">
      <br/>
     
        
      <input type="hidden" value="${projeto.id}" name="id" > 
      <label for="gerenteProjeto">Nome do Gerente</label>
       <br/>
     <input type="text" value="${projeto.gerenteProjeto}" name="gerenteProjeto" id="gerenteProjeto" size="35">
      <br/>
     
     <input type="hidden" value="${projeto.id}" name="id" > 
      <label for="valor">Valor</label>
       <br/>
     <input type="text" value="${projeto.valor}" name="valor" id="valor" size="35">
      <br/>
     
      <input type="hidden" value="${projeto.id}" name="id" > 
      <label for="margemLucro">Margem de Lucro</label>
       <br/>
     <input type="text" value="${projeto.margemLucro}" name="margemLucro" id="margemLucro" size="35">
     
   
     <br/>
     <br/>
      
      
      <input type="submit" value="Salvar"
      class="btn btn-primary" type="submit" value="Submit">
         
      
   </form>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html></html>