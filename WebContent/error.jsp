<%@page import="br.edu.educom.util.TransformaData"%>
<%@page import="br.edu.com.entities.UsuarioLogin"%>
<%@page import="java.util.Date"%>
<%@ page isErrorPage="true" import="java.io.*" contentType="text/plain"%>

<%
	HttpSession sessao = request.getSession(true);
	UsuarioLogin usuarioSessao = (UsuarioLogin) sessao.getAttribute("usuarioSessao");

	StringWriter stringWriter = new StringWriter();
	PrintWriter printWriter = new PrintWriter(stringWriter);
	exception.printStackTrace(printWriter);
	String MSG = "";
	
	MSG = "Usuário que causo a exception: "+usuarioSessao.getEmail();
	MSG += "\nData e Hora: "+TransformaData.getData_eHora_Atual();
	
	MSG += "\n\nO erro foi = "+exception.getMessage();
	MSG += "\n"+stringWriter;
	
	System.out.println(MSG);
	//EnviarExceptionEmail erro = new EnviarExceptionEmail();
	//erro.enviarEmailException(MSG);
	
	printWriter.close();
	stringWriter.close();
	request.setAttribute("msg", "Atenção: Ocorreu um erro, mais não se preocupe a nossa equipe já esta verificando o erro");
	request.getRequestDispatcher("loginErro.jsp").forward(request, response);
%>
