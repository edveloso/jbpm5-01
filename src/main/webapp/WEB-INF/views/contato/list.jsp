<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body  >  


  <div id="titulo"  style="background-color: #ededed;height: 50px; top: 0%" >
       <h1 style="padding-left: 10%; color: #bdbdbd">jbpm 5.4</h1> 
  </div>
   
  <div style="margin-top: 3%;margin-right: 7%; margin-left: 7%; margin-top: 0%;  background: white; padding: 3%; ">
	<h1 style="color: #adadad">Lista de Contatos</h1>
	<br />
	
	<c:set value="contato/form" var="urlnew"/> 
	<a href="${urlnew}">Novo Contato</a>
	<hr>



	<table cellpadding="1" cellspacing="0" width="80%" border="1"> 
	 <caption>Contatos</caption>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Opções</th> 
		</tr>
		<c:forEach var="contato" items="#{list}">
		
		    <c:set value="./contato/edit/${contato.id}" var="urledit"></c:set>
		    <c:set value="./contato/remove/${contato.id}" var="urlremove"></c:set>
		
			<tr>
				<td>${contato.id}</td>
				<td>${contato.nome}</td>
				<td>${contato.email}</td>
				<td>${contato.telefone}</td>
				<td>
				<a href="${urledit}">Editar</a>
				|
				<a href="${urlremove}">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>

</body>
</html>