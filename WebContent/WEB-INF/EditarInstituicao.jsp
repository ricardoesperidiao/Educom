<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/instituicao.css"/>
        <title>EDUCOM - Editar Instituição</title>
</head>
<body>

 <div class="central">
        <div class="cabecalho"><h2 class="h2">Editar Instituição</h2></div>
        
        <form class="formularioRelat" action="Educom" method="post">
        	<input type="hidden" name="logica" value="EditarInstituicao">
        	<input type="hidden" name="id" value="${inst.id}">
        	
            
            <div class="campo1">
                <p class="titulo">Nome da Instituição</p>
                <input type="text" name="nome" class="texto" value="${inst.nome}">
            </div>
            
            <div class="campo2">
                <p class="titulo">Sigla Instituição</p>
                <input type="text" name="sigla" class="texto" value="${inst.sigla}">
            </div>
           
            <div class="btncad">
                <input type="submit" value="Concluir" class="btncadastrar">
            </div>
            
        </form>
    </div>
   
</body>
</html>