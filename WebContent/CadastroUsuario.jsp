<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon" />
<link rel="stylesheet" href="css/CadastroUsuario.css">
<title>EDUCOM - Cadastro Usu�rio</title>
</head>
<body>

	<div class="central">

		<div class="cabecalho">
			<h2 class="h2">Cadastro Usu�rio</h2>
		</div>
		
		<form action="Educom" method="post" class="formularioRelat">
			<input type="hidden" name="acao" value="AutenticarUsuario">
			<input type="hidden" name="logica" value="CadastroUsuario">
					
			<div class="campo1">
				<p class="titulo">E-mail</p>
				<input type="email" name="email" class="texto1">
			</div>

			<div class="campo2">
				<p class="titulo">Nome</p>
				<input type="text" name="nome" class="texto">
			</div>

			<div class="campo3">
				<p class="titulo">Senha</p>
				<input type="password" name="senha" class="texto">
			</div>

			<div class="btncad">
				<input type="submit" value="Cadastrar" class="btncadastrar">
			</div>

		</form>
	</div>

</body>
</html>