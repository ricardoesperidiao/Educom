<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/instituicao.css"/>
        <title>EDUCOM - Editar Disciplina</title>
</head>
<body>

 <div class="central">
        <div class="cabecalho"><h2 class="h2">Editar Disciplina</h2></div>
        
        <form class="formularioRelat" action="Educom" method="post">
        	<input type="hidden" name="logica" value="EditarDisciplina">
        	<input type="hidden" name="id" value="${disciplinca.id}">
        	
            
            <div class="campo1">
                <p class="titulo">Descrição</p>
                <input type="text" name="descricao" class="texto" value="${disciplinca.nome}">
            </div>
            
            <div class="campo2">
                <p class="titulo">Turma</p>
                <input type="text" name="turma" class="texto" value="${disciplina.turma.id}">
            </div>
           
            <div class="btncad">
                <input type="submit" value="Concluir" class="btncadastrar">
            </div>
            
        </form>
    </div>
   
</body>
</html>