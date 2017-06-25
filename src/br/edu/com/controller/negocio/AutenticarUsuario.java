package br.edu.com.controller.negocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.UsuarioLogin;

public class AutenticarUsuario implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		System.out.println("email = "+email);
		System.out.println("senha = "+senha);

		UsuarioLogin usuario = null;
		try {
			usuario = Facade.getInstance().getIUsuarioLogin().procurarUsuarioLogin("from UsuarioLogin where email ='"+email+"' and senha = '"+senha+"'").get(0);
		} catch (Exception e) {
			System.out.println("ususario = "+usuario);
			System.out.println("erro = "+e.getMessage());
		}
		
        if (usuario == null) {
            request.setAttribute("msg", "Login ou Senha Incorretos");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        } else {
        	HttpSession sessao = request.getSession(true);
            sessao.setAttribute("usuarioSessao", usuario);
        	request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);   
        }
	}
}
