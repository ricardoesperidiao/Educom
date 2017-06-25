<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/instituicao.css"/>
        <title>EDUCOM - Cadastro Disciplina</title>
</head>
<body>

 <div class="central">
        <div class="cabecalho"><h2 class="h2">Cadastro Disciplina</h2></div>
        
        <form class="formularioRelat" action="Educom" method="post">
        	<input type="hidden" name="logica" value="CadastroInstituicao">
            
            <div class="campo1">
                <p class="titulo">Nome da Instituição</p>
                <input type="text" name="descricao" class="texto">
            </div>
            
            <div class="campo2">
               <p>Selecione a turma:</p>
                 <select style="width: 250px;" name="idTurma">
					<c:forEach var="turma" items="${listaTurma}">
						<option value="${turma.id }" >${turma.nome }</option>
					</c:forEach>
				</select>
            </div>
           
            <div class="btncad">
                <input type="submit" value="Cadastrar" class="btncadastrar">
            </div>
            
        </form>
    </div>
   
</body>
</html>