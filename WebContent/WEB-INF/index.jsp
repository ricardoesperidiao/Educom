<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/navybar.css" rel="stylesheet">

</head>

<body>
    <div class="navbar-wrapper">
        <div class="container-fluid">
            <nav class="navbar navbar-fixed-top">
                        <a class="navbar-brand" rel="home" href="index.html">
                        <img style="max-width:150px; margin-top: -8px;"
                                src="img/educom.png">
                        </a>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="#" class="">Home</a>
                            </li>

                            <li class=" dropdown">
                                <a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Minhas Instituições 
                                <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li class=" dropdown">
                                        <li><a href="cadastroinstituicao.html">Adicionar</a></li>
                                        <li><a href="#">Listar</a></li>
                                    </li>
                                </ul>
                            </li>

                            <li class=" dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true"
                                    aria-expanded="false">Minhas Turmas
                            <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="cadastroturma.html">Cadastrar nova turma</a></li>
                                    <li><a href="#">Visualizar minhas turmas</a></li>
                                </ul>
                            </li>

                             <li class=" dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true"
                                    aria-expanded="false">Minhas Disciplinas
                            <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="cadastrodisciplina.html">Cadastrar nova disciplina</a></li>
                                    <li><a href="#">Visualizar Disciplinas</a></li>
                                </ul>
                            </li>


                            <li class=" dropdown">
                                <a href="#" class="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Meus Alunos 
                                <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="CadastroAluno.jsp">Cadastrar novo aluno</a></li>
                                    <li><a href="#">Visualizar meu alunos</a></li>
                                </ul>
                            </li>

                            <li class=" dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true"
                                    aria-expanded="false">Atividades
                            <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="cadastroatividade.html">Nova Atividade</a></li>
                                    <li><a href="#">Listar Atividades</a></li>
                                </ul>
                            </li>

                            <li class=""><a href="#">Dashboard</a></li>

                        </ul>
                        <ul class="nav navbar-nav pull-right">
                            <li class=" dropdown"><a href="#" class="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true"
                                    aria-expanded="false">nome.usuario  <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Alterar Senha</a></li>
                                    <li><a href="#">Meu Perfil</a></li>
                                </ul>
                            </li>
                            <li class=""><a href="#">Sair</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>

</html>