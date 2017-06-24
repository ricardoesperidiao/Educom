package br.edu.com.controller.negocio;



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
			
			 List<Usuario> listUsuarios = Facade.getInstance().getUsuario().listarUsuarios();
			 
//			 com.github.jlinqer.collections.List<Usuario> t = new com.github.jlinqer.collections.List<>();
//			 t.addAll(listUsuarios);
			 
			 request.setAttribute("listaUsuarios", listUsuarios);
			 request.getRequestDispatcher("visualizarUsuarios.jsp").forward(request, response);
		}
		
		
		
	}

}
