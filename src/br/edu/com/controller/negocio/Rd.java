package br.edu.com.controller.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Usuario;

public class Rd implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String acao = request.getParameter("acao");
		
		
		
		if(acao.equals("visualizarUsuarios")){
			
			 List<Usuario> listUsuarios = new ArrayList<Usuario>();
			 listUsuarios = Facade.getInstance().getUsuario().listarUsuarios();	
			 request.setAttribute("listaUsuarios", listUsuarios);
			 response.sendRedirect("visualizarUsuarios.jsp");
		}
		
		
		
	}

}
