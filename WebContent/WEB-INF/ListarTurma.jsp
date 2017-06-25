<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <table>
 		<tr>
 			<td>Nome</td>
 			<td>Institucao</td>
 		</tr>
 		
	 <c:forEach var="turma" items="${listaTurma}">
	
	 	 <tr style="background-color: #CCCCCC"; height="200px;" id="bordar">
	           <td colspan="0">
	           		${turma.nome}
	           	</td>
	           	<td colspan="0">
	           		${turma.instituicao.nome}
	           	</td>
			 	 <td>
			 	 	<a href="Educom?logica=Rd&acao=editarTurma&id=${turma.id}">
			 	 		Editar		            
		            </a>
			 	 </td>
			 	 <td>
			 	 	<a href="Educom?logica=ExcluirTurma&id=${turma.id}">
			 	 		Excluir	           
		            </a>
			 	 </td>
	 	 </tr>
	 </c:forEach>
</table>

</body>
</html>