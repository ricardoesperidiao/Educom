package br.edu.com.controller.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import br.edu.com.controller.Facade;
import br.edu.com.controller.ILogica;
import br.edu.com.entities.Instituicao;
import br.edu.com.entities.UsuarioLogin;

public class CadastroInstituicao implements ILogica {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Instituicao instituicao = new Instituicao();
		BeanUtils.populate(instituicao, request.getParameterMap());
		
		UsuarioLogin user = (UsuarioLogin) request.getSession().getAttribute("usuarioSessao");
		
		instituicao.setProfessor(user.getProfessor());
		
		try {
			
			Facade.getInstance().getIInstituicao().salvarInstituicao(instituicao);
			
		} catch (Exception e) {
			System.out.println("Erro ->" + e.getMessage());
		}
		
		request.setAttribute("msg", "Instituicao" + instituicao.getNome() + "Cadastrada com sucesso!");
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
