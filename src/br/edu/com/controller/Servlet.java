package br.edu.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Servlet", urlPatterns={"/Educom", "/Servlet"})
public class Servlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String parametro = request.getParameter("logica");
		if(parametro != null){
			
			String nomeDaClasse = "br.edu.com.controller.negocio." + parametro;
			
			System.out.println("nome da classe "+nomeDaClasse);
			
			try {
				@SuppressWarnings("rawtypes")
				Class classe = Class.forName(nomeDaClasse);
	
				ILogica logica = (ILogica) classe.newInstance();
				logica.executa(request, response);
	
			} catch (Exception e) {
				throw new ServletException("A logica de negecios causou uma excecao", e);
			}
		} else {
			response.sendRedirect("index.jsp");
		}
	}

}
