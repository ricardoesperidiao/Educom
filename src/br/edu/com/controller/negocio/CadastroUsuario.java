package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Usuario;

public class CadastroUsuario implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Usuario user = new Usuario();
		
		BeanUtils.populate(user, request.getParameterMap());
		Facade.getInstance().getUsuario().salvarUsuario(user);
		
		request.setAttribute("msg", "Usuario "+ user.getNome()+" cadastrado com sucesso!");
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}

}
