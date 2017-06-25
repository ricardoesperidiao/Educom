package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Professor;
import br.edu.com.entities.UsuarioLogin;

public class CadastroUsuario implements ILogica{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UsuarioLogin user = new UsuarioLogin();
		
		BeanUtils.populate(user, request.getParameterMap());
		Professor professor = new Professor(user);
		try {
			Facade.getInstance().getProfessor().salvarUsuario(professor);
		} catch (Exception e) {
			System.out.println("Erro -> "+ e.getMessage());
		}
		HttpSession sessao = request.getSession(true);
        sessao.setAttribute("usuarioSessao", user);
    	request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);   
	}

}
