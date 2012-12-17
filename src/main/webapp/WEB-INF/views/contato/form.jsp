<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    <c:if test="${empty contato}">
       <c:set value="save" var="action" > </c:set>
    </c:if>
    <c:if test="${not empty  contato}">
       <c:set value="update" var="action" > </c:set>
    </c:if>
     
    
  <form action="${action}" >
     Nome:  
     <input name="nome"  /> <br/>
     Email:
     <input name="email"/> <br/>
     Telefone:
     <input name="telefone"/> <br/>
     <input type="submit" value="Enviar"  />
  </form>

</body>
</html>