package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.com.controller.ILogica;

public class Logout implements ILogica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		try{
			System.out.println("to no logout");
			HttpSession sessao = request.getSession(); 
			
			if(sessao != null){
				sessao.removeAttribute("usuarioSessao");
				sessao.invalidate();
				System.out.println("sessao morreu");
	        }
	        response.sendRedirect("login.jsp");
		} catch(Exception e){			
			System.out.println("Erro no logout = "+e.getMessage());
			response.sendRedirect("error.jsp");
		}
		
		
		
	}

}