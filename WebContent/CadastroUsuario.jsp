<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

    <br/>

    <br/><br/><br/><br/>

    <div class="container container-table">
        <div class="row vertical-center-row">

            <div class="well">
                <h1>Cadastro Inicial</h1>
                <hr/>

                <img style="max-width:180px;" src="img/educom.png" class="img-responsive img-center">
                <br/><br/>

                <div class="row">
                    <div class="modal-body">
                        <form class="form-horizontal" action="Educom" method="post">
                            <input type="hidden" name="acao" value="AutenticarUsuario">
			                <input type="hidden" name="logica" value="CadastroUsuario">
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="textinput">E-mail</label>
                                <div class="col-md-4">
                                    <input type="email" name="email" placeholder="ex: @gmail.com" class="form-control input-lg">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-4 control-label" for="textinput">Nome</label>
                                <div class="col-md-4">
                                    <input type="text" name="nome" type="email" class="form-control input-lg">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-4 control-label" for="passwordinput">Senha</label>
                                <div class="col-md-4">
                                   <input type="password" name="senha" class="form-control input-lg">
                                </div>
                            </div>

                            <!-- Button -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="singlebutton"></label>
                                <div class="col-md-4">
                                    <input type="submit" value="Cadastrar" class="btn btn-success btn-lg">Confirmar</button>
                                </div>
                            </div>
                    </div>

                </div>

            </div>
        </div>

    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>