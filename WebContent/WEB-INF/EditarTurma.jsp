<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>EDUCOM - Editar Turma</title>
    <link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="css/CadastroTurma.css">
</head>
<body>

    <div class="central">
        <div class="cabecalho"><h2 class="h2">Editar turma</h2></div>
            <form action="Educom" method="post" class="formularioRelat">
				<input type="hidden" name="logica" value="EditarTurma">
        		<input type="hidden" name="id" value="${turma.id}">
        	
                <div class="campo1">
                    <p>Nome</p>
                    <input type="text" name="nome" class="texto" value="${turma.nome}"><br>
                </div>

                <div class="campo2">
                    <p>Selecione a instui��o:</p>
                    <select style="width: 250px;" name="idInstituicao" id="instituicao">
						<c:forEach var="inst" items="${listaInstituicao}">
							<option value="${inst.id }" <c:if test="${turma.instituicao.id == inst.id}"> selected="selected" </c:if> >${inst.nome }</option>
						</c:forEach>
					</select>
                </div>

                <div class="btncad">
                    <input type="submit" value="Atualizar" class="btncadastrar">
                </div>
            </form>
    </div>

</body>
</html>