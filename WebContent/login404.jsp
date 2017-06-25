<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon" />
<link href="css/Login.css" rel="stylesheet" />
<title>EDUCOM - Login</title>
</head>
<body>

	<div class="cabecalho">
		Pagina não encontrada
	</div>
	<div class="central">
		<div class="img">
			<img src="img/educom.png">
		</div>
		<div class="cabecalho">
			<h2 class="h2">Login</h2>
		</div>
		<form action="" class="formularioRelat">
			<input type="hidden" name="logica" value="AutenticarUsuario">
			<input type="hidden" name="acao" value="AutenticarUsuario">

			<div class="campo1">
				<p class="titulo">E-mail</p>
				<input type="email" name="email" class="texto1">
			</div>
			<div class="campo2">
				<p class="titulo">Senha</p>
				<input type="password" name="senha" class="texto">
			</div>
			<div class="btncad">
				<input type="submit" value="Entrar" class="btncadastrar">
			</div>
		</form>
	</div>
</body>
</html>