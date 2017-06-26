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
 			<td>Descrição</td>
 			<td>Turma</td>
 		</tr>
 		
	 <c:forEach var="disciplina" items="${listaDisciplina}">
	
	 	 <tr style="background-color: #CCCCCC"; height="200px;" id="bordar">
	           <td colspan="0">
	           		${disciplina.descricao}
	           	</td>
	           	<td colspan="0">
	           		${disciplina.turma.nome}
	           	</td>
			 	 <td>
			 	 	<a href="Educom?logica=Rd&acao=editarDisciplina&id=${disciplina.id}">
			 	 		Editar		            
		            </a>
			 	 </td>
			 	 <td>
			 	 	<a href="Educom?logica=ExcluirDisciplina&id=${disciplina.id}">
			 	 		Excluir	           
		            </a>
			 	 </td>
	 	 </tr>
	 </c:forEach>
</table>

</body>
</html>