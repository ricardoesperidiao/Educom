package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.UsuarioLogin;

public class CadastroUsuario implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UsuarioLogin user = new UsuarioLogin();
		
		BeanUtils.populate(user, request.getParameterMap());
		//user.setProfessor(new Professor());
		try {
			Facade.getInstance().getIUsuarioLogin().salvarUsuarioLogin(user);
			
		} catch (Exception e) {
			System.out.println("Erro -> "+ e.getMessage());
		}
		request.setAttribute("msg", "Usuario "+ user.getNome() + " cadastrado com sucesso!");
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}

}
