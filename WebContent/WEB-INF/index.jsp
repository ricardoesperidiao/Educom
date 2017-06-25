<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="img/6765educom.ico" type="image/x-icon" />
<link rel="stylesheet" href="css/home.css" />
<title>EDUCOM - Home</title>
</head>
<body>


	<div class="barraMenu">

		<a href="CadastroAtividade.html"><input type="button"
			value="Cadastro Atividade" class="buttonAtividade"></a> <a
			href="CadastroAtividade.html"><input type="button"
			value="Instituição" class="buttonInstituicao"></a> <a
			href="CadastroAluno.html"><input type="button"
			value="Cadastro Aluno" class="buttonAluno"></a> <a
			href="relatorios.html"><input type="button"
			value="Cadastro Relatório" class="buttonRelatorio"></a> <a
			href="CadastroTuma.html"><input type="button"
			value="Cadastro Turma" class="buttonTurma"></a> <input
			type="button" value="Relatórios Gerenciais" class="buttonRelatorios">

	</div>

	<div>
	<h1>${msg}</h1>
	</div>

	<div class="grafico"></div>

	<div class="calendario"></div>


</body>
</html>