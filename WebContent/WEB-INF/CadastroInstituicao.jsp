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

    <a class="navbar-brand" rel="home" href="index.html">
                        <img style="max-width:130px; margin-top: -10px;"
                                src="img/educom.png">
                        </a>

    <form class="form-horizontal" action="Educom" method="post">
        <input type="hidden" name="logica" value="CadastroInstituicao">
        <!-- Form Name -->
        <br/>
        <fieldset>

            <legend>
                <h1>Cadastrar Institui��o</h1>
            </legend>

            <!-- Text input-->
            <h2>Preencha os campos abaixo: </h2>
            <div class="form-group">
                <label class="col-md-2 control-label" for="textinput">Nome da Institui��o</label>
                <div class="col-md-5">
                    <input id="textinput" name="nome" type="text" class="form-control input-lg">

                </div>
            </div>



            <div class="form-group">
                <label class="col-md-2 control-label" for="textinput">Sigla</label>
                <div class="col-md-2">
                    <input id="textinput" name="sigla" type="text" class="form-control input-lg">

                </div>
            </div>

            </div>
            </div>

            <!-- Button -->
            <div class="form-group">
                <label class="col-md-2 control-label" for="btnaluno"></label>
                <div class="col-md-4">
                    <input type="submit" value="Cadastrar" class="btn btn-success btn-lg">Cadastrar</button>
                </div>
            </div>

        </fieldset>
    </form>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>