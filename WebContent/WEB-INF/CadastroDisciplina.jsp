<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<<<<<< HEAD
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link href="css/bootstrap.css" rel="stylesheet">
  <link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="back-edu">

  <a class="navbar-brand" rel="home" href="index.html">
                        <img style="max-width:130px; margin-top: -10px;"
                                src="img/educom.png">
                        </a>

  <form class="form-horizontal">
    <!-- Form Name -->
    <br/>
    <fieldset>

      <legend>
        <h1>Cadastrar Disciplina</h1>
      </legend>

      <!-- Text input-->
      <h2>Digite o nome da disciplina</h2>
      <div class="form-group">
        <label class="col-md-2 control-label" for="textinput">Descricao: </label>
        <div class="col-md-5">
          <input id="textinput" name="textinput" type="text" class="form-control input-lg">
        </div>
      </div>

      <!-- Button -->
      <div class="form-group">
        <label class="col-md-2 control-label" for="btnaluno"></label>
        <div class="col-md-4">
          <button id="btnaluno" name="btnaluno" class="btn btn-success btn-lg">Cadastrar</button>
        </div>
      </div>

    </fieldset>
  </form>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>

=======
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
>>>>>>> refs/remotes/origin/master
</html>