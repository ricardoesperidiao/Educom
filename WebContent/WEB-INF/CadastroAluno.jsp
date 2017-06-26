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

 <br/>
<fieldset>

<legend><h1>Cadastrar Aluno</h1></legend>


<h2>Preencha os campos abaixo: </h2>
<div class="form-group">
  <label class="col-md-2 control-label" for="textinput">Nome do Aluno</label>  
  <div class="col-md-5">
  <input id="textinput" name="textinput" type="text" class="form-control input-lg">
    
  </div>
</div>


<div class="form-group">
  <label class="col-md-2 control-label" for="selectturma">Turma</label>
  <div class="col-md-2">
    <select id="selectturma" name="selectturma" class="form-control input-lg">
      <option value="1">fafica 1</option>
      <option value="2">favip 2</option>
    </select>
  </div>
</div>


<div class="form-group">
  <label class="col-md-2 control-label" for="selectinstituicao">Instituição</label>
  <div class="col-md-2">
    <select id="selectinstituicao" name="selectinstituicao" class="form-control input-lg">
      <option value="1">fafica</option>
      <option value="2">favip</option>
    </select>
  </div>
</div>


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
</html>